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

    public int addNumber(int number, int i) {
        return (numbers[i] = number);
    }

    public int[] getNumbers(int length) {
        if (numbers[length] == 0) {
            length = length - 1;
        }
        return Arrays.copyOf(numbers, length + 1);
    }

    public void clearAttempts(int length) {
        Arrays.fill(numbers, 0, length + 1, 0);
    }

}