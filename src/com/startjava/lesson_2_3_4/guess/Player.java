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

    public int[] getNumbers() {
        int count = 0;
        for (int i : numbers) {
            if (i != 0) {
                count++;
            }
        }
        return Arrays.copyOf(numbers, count);
    }

    public void fillArray (int[] numbers) {
        int count = 0;
        for (int i : numbers) {
            if (i != 0) {
                count++;
            }
        }
        Arrays.fill(numbers, 0, count, 0);
        System.out.println(Arrays.toString(numbers));
    }

    public int addNumber(int number, int i) {
        return (numbers[i] = number);
    }

}