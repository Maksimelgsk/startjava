package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    static final int attempt = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        int secretNum = (int) (Math.random() * 100 + 1);
        int[] arrayPlayer1 = new int[attempt];
        int[] arrayPlayer2 = new int[attempt];
        player1.setNumbers(arrayPlayer1);
        player2.setNumbers(arrayPlayer2);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= attempt - 1; i++) {
            System.out.print(player1.getName() + ", введите число: ");
            arrayPlayer1[i] = scanner.nextInt();
            if (player1.getNumbers()[i] == secretNum) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumbers()[i]
                        + " с " + (i + 1) + " попытки");
                break;
            }
            if (player1.getNumbers()[i] != secretNum && i == 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }
            if (player1.getNumbers()[i] > secretNum) {
                System.out.println("Число " + player1.getNumbers()[i] + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getNumbers()[i] + " меньше того, что загадал компьютер");
            }

            System.out.print(player2.getName() + ", введите число: ");
            arrayPlayer2[i] = scanner.nextInt();
            if (player2.getNumbers()[i] == secretNum) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumbers()[i]
                        + " с " + (i + 1) + " попытки");
                break;
            }
            if (player2.getNumbers()[i] != secretNum && i == 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
            if (arrayPlayer2[i] > secretNum) {
                System.out.println("Число " + player2.getNumbers()[i] + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player2.getNumbers()[i] + " меньше того, что загадал компьютер");
            }
        }
        System.out.print("Числа игрока " + player1.getName() + " : ");
        int count = 0;
        for (int i : player1.getNumbers()) {
            if (i != 0) {
                count++;
            }
        }
        int[] destArray1 = new int[count];
        int n = 0;
        int length = 1;
        for (int i = 0; i < player1.getNumbers().length; i++) {
            if (player1.getNumbers()[i] != 0) {
                System.arraycopy(player1.getNumbers(), i, destArray1, n++, length);
            }
        }
        Arrays.fill(player1.getNumbers(), 0, count, 0);
        toConsole(destArray1);

        System.out.print("Числа игрока " + player2.getName() + " : ");
        count = 0;
        for (int i : player2.getNumbers()) {
            if (i != 0) {
                count++;
            }
        }
        int[] destArray2 = new int[count];
        n = 0;
        for (int i = 0; i < player2.getNumbers().length; i++) {
            if (player2.getNumbers()[i] != 0) {
                System.arraycopy(player2.getNumbers(), i, destArray2, n++, length);
            }
        }
        Arrays.fill(player2.getNumbers(), 0, count, 0);
        toConsole(destArray2);

    }
    public static void toConsole(int[] array) {
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}