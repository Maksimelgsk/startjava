package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private static final int qtyPlayers = 3;
    private final Player[] player = new Player[qtyPlayers];
    private static final int ATTEMPT = 10;

//    private static int win1;
//
//    private static int win2;
//
//    private static int win3;

    public GuessNumber(Player... players) {
        System.arraycopy(players, 0, this.player, 0, players.length);
    }

    public void launch() {
        int secretNumber = (int) (Math.random() * 100 + 1);
        int j;
        int i;
        for (i = 0; i < ATTEMPT; i++) {
            for (j = 0; j < player.length; j++) {
                if (isGuessed(player[j], secretNumber, i)) {
                    i = ATTEMPT - 1;
                    break;
                }
            }
        }
        for (j = 0; j < player.length; j++) {
            System.out.print("Числа игрока " + player[j].getName() + " : ");
            printNumbers(player[j].getNumbers(i));
            player[j].clearAttempts(i);
//            System.out.println("Количество побед игрока" + player[j].getName() + " : ");
        }
    }

    private static boolean isGuessed(Player player, int secretNumber, int i) {
        System.out.print(player.getName() + ", введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num <= 0 || num > 100) {
            player.setNumber(num, i);
            num = scanner.nextInt();
        }
        int playerNumber = player.addNumber(num, i);
        if (playerNumber == secretNumber && i < ATTEMPT) {
            System.out.println("Игрок " + player.getName() + " угадал число " + playerNumber + " с " + (i + 1) +
                    " попытки");
            return true;
        } else if (playerNumber != secretNumber && i == ATTEMPT - 1) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        System.out.println("Число " + playerNumber + (playerNumber > secretNumber ? " больше" : " меньше") +
                " того, что загадал компьютер");
        return false;
    }

    private static void printNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number != 0) {
                System.out.print(" " + number);
            }
        }
        System.out.println();
    }
}