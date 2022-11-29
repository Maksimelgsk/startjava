package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    static private final int ATTEMPT = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        int secretNumber = (int) (Math.random() * 100 + 1);
        int i;
        for (i = 0; i <= ATTEMPT - 1; i++) {
            boolean isNumber1;
            isNumber1 = isNumber(player1, secretNumber, i);
            if (isNumber1) {
                break;
            }
            boolean isNumber2;
            isNumber2 = isNumber(player2, secretNumber, i);
            if (isNumber2) {
                break;
            }
        }
        System.out.print("Числа игрока " + player1.getName() + " : ");
        printNumbers(player1.getNumbers(i));

        System.out.print("Числа игрока " + player2.getName() + " : ");
        printNumbers(player2.getNumbers(i));
    }

    public static void printNumbers(int[] numbers) {
        for (int i : numbers) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static boolean isNumber(Player player, int secretNumber, int i) {
        System.out.print(player.getName() + ", введите число: ");
        Scanner scanner = new Scanner(System.in);
        int playerNumber = player.addNumber(scanner.nextInt(), i);
        if (playerNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + playerNumber + " с " + (i + 1) + " попытки");
            return true;
        }
        if (playerNumber > secretNumber && i < ATTEMPT - 1) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else if (playerNumber < secretNumber && i < ATTEMPT - 1) {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        } else {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }
}