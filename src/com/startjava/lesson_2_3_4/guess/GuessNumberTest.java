package com.startjava.lesson_2_3_4.guess;

import java.util.Random;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игра состоит из 3-х раундов. У каждого игрока по 10 попыток в каждом раунде.");
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.next());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.next());
        System.out.print("Введите имя третьего игрока: ");
        Player player3 = new Player(scan.next());
        Player[] players = new Player[]{player1, player2, player3};
        Random random = new Random();
        for(int j = 0; j < players.length; j++) {
            int index = random.nextInt(j + 1);
            Player a = players[index];
            players[index] = players[j];
            players[j] = a;
        }
        GuessNumber game = new GuessNumber(players[0], players[1], players[2]);
        String reply = "yes";
        int round = 3;
        do {
            if("yes".equals(reply)) {
                for (int i = 0 ; i < round; i++) {
                    System.out.println("Раунд " + (i + 1));
                    game.launch();
                    }
            }
            System.out.print("Хотите продолжить игру? [yes/no]:");
            reply = scan.next();
        } while (!"no".equals(reply));
    }
}