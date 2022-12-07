package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private final int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int i) {
        if (number <= 0 || number > 100) {
            System.out.print("Вы ввели неверное число!!! " + name + " введите число от 0 до 100: ");
        }
        numbers[i] = number;
    }

    public int addNumber(int number, int i) {
        return (numbers[i] = number);
    }

    public int[] getNumbers(int length) {
        return Arrays.copyOf(numbers, length);
    }

    public void clearAttempts(int length) {
        Arrays.fill(numbers, 0, length, 0);
    }

}