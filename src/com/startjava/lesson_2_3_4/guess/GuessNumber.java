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
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print(player1.getName() + ", введите число: ");
            int playerNumber1 = player1.addNumber(scanner.nextInt(), i);
            if (playerNumber1 == secretNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + playerNumber1 + " с "
                        + (i + 1) + " попытки");
                break;
            }
            checkNumber(playerNumber1, secretNumber, i, player1.getName());

            System.out.print(player2.getName() + ", введите число: ");
            int playerNumber2 = player2.addNumber(scanner.nextInt(), i);
            if (playerNumber2 == secretNumber) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + playerNumber2 + " с "
                        + (i + 1) + " попытки");
                break;
            }
            checkNumber(playerNumber2, secretNumber, i, player2.getName());
            i++;
        } while (i <= ATTEMPT - 1);
        System.out.print("Числа игрока " + player1.getName() + " : ");
        printNumbers(player1.getNumbers());
        player1.fillArray(player1.getNumbers());

        System.out.print("Числа игрока " + player2.getName() + " : ");
        printNumbers(player2.getNumbers());
        player2.fillArray(player2.getNumbers());
    }

    public static void printNumbers(int[] numbers) {
        for (int i : numbers) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void checkNumber(int playerNumber, int secretNumber, int i, String name) {
        if (playerNumber > secretNumber && i < ATTEMPT - 1) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else if (playerNumber < secretNumber && i < ATTEMPT - 1){
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        } else {
            System.out.println("У игрока " + name + " закончились попытки");
        }
    }

}