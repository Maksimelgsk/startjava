package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int ROUNDS = 3;
    private final Player[] players;
    private static final int MAX_ATTEMPTS = 10;

    public GuessNumber(Player... players) {
        Random random = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Player a = players[index];
            players[index] = players[i];
            players[i] = a;
        }
        this.players = players;
    }

    public void launch() {
        for (int k = 0; k < ROUNDS; k++) {
            int secretNumber = (int) (Math.random() * 100 + 1);
            System.out.println("Раунд " + (k + 1));
            boolean winnerDefined = false;
            for (int i = 1; i <= MAX_ATTEMPTS; i++) {
                for (Player player : players) {
                    if (isGuessed(player, secretNumber, i)) {
                        player.addWin();
                        winnerDefined = true;
                        break;
                    }
                }
                if (winnerDefined) {
                    break;
                }
            }
            printNumbersAndClear();
        }
        printWinner();
    }

    private int enterNumber(Player player, int attemptNumber) {
        Scanner scanner = new Scanner(System.in);
        int playerNumber;
        while (true) {
            playerNumber = scanner.nextInt();
            if (player.addNumber(playerNumber, attemptNumber)) {
                return playerNumber;
            }
        }
    }

    private boolean isGuessed(Player player, int secretNumber, int attemptNumber) {
        System.out.print(player.getName() + ", введите число: ");
        int number = enterNumber(player, attemptNumber);
        if (number == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " с " + attemptNumber +
                    " попытки");
            return true;
        }
        if (attemptNumber == MAX_ATTEMPTS) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        System.out.println("Число " + number + (number > secretNumber ? " больше" : " меньше") +
                " того, что загадал компьютер");
        return false;
    }

    private void printNumbersAndClear() {
        for (Player player : players) {
            System.out.print("Числа игрока " + player.getName() + " : ");
            for (int number : player.getNumbers()) {
                if (number != 0) {
                    System.out.print(" " + number);
                }
            }
            System.out.print("  (Победы игрока: " + player.getWins() + ")");
            System.out.println();
            player.clearAttempts();
        }
    }

    private void printWinner(){
        int winnerIndex = 0;
        int maxWins = players[0].getWins();
        boolean isDraw = true;
        for (int i = 1; i < players.length; i++) {
            if (players[i].getWins() > maxWins) {
                winnerIndex = i;
                maxWins = players[i].getWins();
                isDraw = false;
            } else if (players[i].getWins() < maxWins){
                isDraw = false;
            }
        }
        if (isDraw) {
            System.out.println("Ничья.");
        } else {
            System.out.println("Победу в 3-х раундах одержал игрок " + players[winnerIndex].getName());
        }
    }
}