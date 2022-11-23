package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток");
        System.out.print("Введите имя первого игрока: ");
        Player playerFirst = new Player(scan.next());
        System.out.print("Введите имя второго игрока: ");
        Player playerSecond = new Player(scan.next());
        GuessNumber game = new GuessNumber(playerFirst, playerSecond);
        String reply = "yes";
        do {
            if("yes".equals(reply)) {
                game.launch();
            }
            System.out.print("Хотите продолжить игру? [yes/no]:");
            reply = scan.next();
        } while (!"no".equals(reply));
    }
}