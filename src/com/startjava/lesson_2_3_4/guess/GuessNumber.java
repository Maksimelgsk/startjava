package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int AMOUNT_PLAYERS = 3;
    private static final int ROUNDS = 3;
    private final Player[] player = new Player[AMOUNT_PLAYERS];
    private static final int ATTEMPT = 10;
    private static final int[] WINS = new int[3];


    public GuessNumber(Player... players) {
        Random random = new Random();
        for (int i = 0; i < players.length; i++) {
            int index = random.nextInt(i + 1);
            player[i] = players[i];
            Player a = player[index];
            player[index] = player[i];
            player[i] = a;
        }
    }

    public void launch() {
        int j;
        int i;
        for (int k = 0; k < ROUNDS; k++) {
            int secretNumber = (int) (Math.random() * 100 + 1);
            System.out.println("Раунд " + (k + 1));
            for (i = 0; i < ATTEMPT; i++) {
                for (j = 0; j < player.length; j++) {
                    if (isGuessed(player[j], secretNumber, i)) {
                        i = ATTEMPT - 1;
                        WINS[j]++;
                        break;
                    }
                }
            }
            for (j = 0; j < player.length; j++) {
                System.out.print("Числа игрока " + player[j].getName() + " : ");
                printNumbers(player[j].getNumbers(i));
                player[j].clearAttempts(i);
            }
            int totalWINS = 0;
            while (totalWINS < AMOUNT_PLAYERS) {
                System.out.println("Количество побед игрока " + player[totalWINS].getName() + " : " + WINS[totalWINS]);
                totalWINS++;
            }
        }
        if (WINS[0] == WINS[1] && WINS[1] == WINS[2]) {
            System.out.println("По итогам 3-х раундов зафиксирована ничья!");
        } else if (WINS[0] > WINS[1] && WINS[0] > WINS[2]) {
            System.out.println("По итогам 3-х раундов победил игрок " + player[0].getName());
        } else if (WINS[1] > WINS[0] && WINS[1] > WINS[2]) {
            System.out.println("По итогам 3-х раундов победил игрок " + player[1].getName());
        } else {
            System.out.println("По итогам 3-х раундов победил игрок " + player[2].getName());
        }
        Arrays.fill(WINS, 0, WINS.length, 0);
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
        }
        if (playerNumber != secretNumber && i == ATTEMPT - 1) {
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