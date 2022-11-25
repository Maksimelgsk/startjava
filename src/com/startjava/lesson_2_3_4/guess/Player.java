package com.startjava.lesson_2_3_4.guess;

public class Player {
    private final String name;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }
}