package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];
    private int wins;
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWins () {
        return wins;
    }

    public void addWin() {
        wins++;
    }

    public boolean addNumber(int number, int attempt) {
        if (number <= 0 || number > 100) {
            System.out.print("Вы ввели неверное число!!! " + name + " введите число от 0 до 100: ");
            return false;
        }
        attempts = attempt;
        numbers[attempt - 1] = number;
        return true;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempts);
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }

}