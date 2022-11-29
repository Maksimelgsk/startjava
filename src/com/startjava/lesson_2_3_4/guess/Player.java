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

    public int[] getNumbers(int length) {
        int count = 0;
        for (int i = 0; i <= length + 1; i++) {
            if (numbers[i] != 0) {
                count++;
            }
        }
        return Arrays.copyOf(numbers, count);
    }

    public int addNumber(int number, int i) {
        return (numbers[i] = number);
    }

    public void fillArray() {
        int count = 0;
        for (int number : numbers) {
            if (number != 0) {
                count++;
            }
        }
        Arrays.fill(numbers, 0, count, 0);
    }

}