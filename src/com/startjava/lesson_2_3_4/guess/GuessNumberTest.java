package com.startjava.lesson_2_3_4.guess;

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
        GuessNumber game = new GuessNumber(player1, player2, player3);
        String reply = "yes";
        do {
            if ("yes".equals(reply)) {
                game.launch();
            }
            System.out.print("Хотите продолжить игру? [yes/no]:");
            reply = scan.next();
        } while (!"no".equals(reply));
    }
}