package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    static final int ATTEMPT = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        int secretNum = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= ATTEMPT; i++) {
            System.out.print(player1.getName() + ", введите число: ");
            int numPlayer1 = player1.fillNumbers(scanner.nextInt(), i);
            if (i == ATTEMPT - 1 && numPlayer1 != secretNum) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
            }
            if (numPlayer1 == secretNum) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + numPlayer1 + " с " + (i + 1) + " попытки");
                break;
            }
            if (numPlayer1 > secretNum) {
                System.out.println("Число " + numPlayer1 + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + numPlayer1 + " меньше того, что загадал компьютер");
            }

            System.out.print(player2.getName() + ", введите число: ");
            int numPlayer2 = player2.fillNumbers(scanner.nextInt(), i);
            if (numPlayer2 != secretNum && i == ATTEMPT - 1) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
            }
            if (numPlayer2 == secretNum) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + numPlayer2 + " с " + (i + 1) + " попытки");
                break;
            }
            if (numPlayer2 > secretNum) {
                System.out.println("Число " + numPlayer2 + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + numPlayer2 + " меньше того, что загадал компьютер");
            }
        }
        System.out.print("Числа игрока " + player1.getName() + " : ");
        toConsole(player1.getNumbers());
        int[] destArray1 = new int[ATTEMPT];
        resetArray(player2.getNumbers(), destArray1);

        System.out.print("Числа игрока " + player2.getName() + " : ");
        toConsole(player2.getNumbers());
        int[] destArray2 = new int[ATTEMPT];
        resetArray(player2.getNumbers(), destArray2);
    }

    public static void toConsole(int[] array) {
        for (int i : array) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void resetArray (int[] array, int[] destArray) {
        int n = 0;
        int length = 1;
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array, i, destArray, n++, length);
        }
        Arrays.fill(destArray, 0, array.length, 1);
    }
    
}