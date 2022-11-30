package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private static final int ATTEMPT = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        int secretNumber = (int) (Math.random() * 100 + 1);
        int i;
        for (i = 0; i < ATTEMPT; i++) {
            boolean isGuessed1;
            isGuessed1 = isGuessed(player1, secretNumber, i);
            if (isGuessed1) {
                break;
            }
            boolean isGuessed2;
            isGuessed2 = isGuessed(player2, secretNumber, i);
            if (isGuessed2) {
                break;
            }
        }
        if (i < ATTEMPT) {
            System.out.print("Числа игрока " + player1.getName() + " : ");
            printNumbers(player1.getNumbers(i));
            System.out.print("Числа игрока " + player2.getName() + " : ");
            printNumbers(player2.getNumbers(i));
            player1.clearAttempts(i);
            player2.clearAttempts(i);
        } else {
            System.out.print("Числа игрока " + player1.getName() + " : ");
            printNumbers(player1.getNumbers(i - 1));
            System.out.print("Числа игрока " + player2.getName() + " : ");
            printNumbers(player2.getNumbers(i - 1));
            player1.clearAttempts(i - 1);
            player2.clearAttempts(i - 1);
        }
    }

    private static boolean isGuessed(Player player, int secretNumber, int i) {
        System.out.print(player.getName() + ", введите число: ");
        Scanner scanner = new Scanner(System.in);
        int playerNumber = player.addNumber(scanner.nextInt(), i);
        if (playerNumber == secretNumber && i < ATTEMPT) {
            System.out.println("Игрок " + player.getName() + " угадал число " + playerNumber + " с " + (i + 1) +
                    " попытки");
            return true;
        } else if (playerNumber != secretNumber && i == ATTEMPT - 1) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        if (playerNumber > secretNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private static void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println();
    }
}