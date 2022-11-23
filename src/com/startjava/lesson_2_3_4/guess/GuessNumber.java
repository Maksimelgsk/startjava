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
        player1.setArrayNumbers(new int[attempt]);
        int[] arrayPlayer1;
        int[] arrayPlayer2;
        arrayPlayer1 = player1.getArrayNumbers();
        arrayPlayer2 = player1.getArrayNumbers();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= attempt - 1; i++) {
            System.out.print(player1.getName() + ", введите число: ");
            player1.setNumber(scanner.nextInt());
            arrayPlayer1[i] = player1.getNumber();
            if (player1.getNumber() == secretNum) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " + (i + 1) + " попытки");
                break;
            }
            if (player1.getNumber() != secretNum && i == 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }

            if (player1.getNumber() > secretNum) {
                System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
            }

            System.out.print(player2.getName() + ", введите число: ");
            player2.setNumber(scanner.nextInt());
            arrayPlayer2[i] = player2.getNumber();
            if (player2.getNumber() == secretNum) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber() + " с " + (i + 1) + " попытки");
                break;
            }
            if (player2.getNumber() != secretNum && i == 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
            if (player2.getNumber() > secretNum) {
                System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
            }

        }
        int[] attemptsPlayer1 = attemptsArray(player1.getName(), arrayPlayer1);
        toConsole(attemptsPlayer1);
        System.out.println();
        int[] attemptsPlayer2 = attemptsArray(player2.getName(), arrayPlayer2);
        toConsole(attemptsPlayer2);
    }

    public static void toConsole(int[] array) {
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public int[] attemptsArray (String name, int[] array) {
        System.out.print("Числа игрока " + name + " : ");
        int count = 0;
        for (int i : array) {
            if (i != 0) {
                count++;
            }
        }
        int[] destArray = new int[count];
        int n = 0;
        int length = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.arraycopy(array, i, destArray, n++, length);
            }
        }
        Arrays.fill(array, 0, count, 0);
        return destArray;
    }
}