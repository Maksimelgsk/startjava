package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String NAME;
    private final int[] NUMBERS = new int[10];

    public Player(String name) {
        this.NAME = name;
    }

    public String getName() {
        return NAME;
    }

    public int[] getNumbers() {
        int count = 0;
        for (int i : NUMBERS) {
            if (i != 0) {
                count++;
            }
        }
        return Arrays.copyOf(NUMBERS, count);
    }

    public int fillNumbers(int num, int i) {
        NUMBERS[i] = num;
        return num;
    }
}