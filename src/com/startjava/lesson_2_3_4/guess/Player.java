package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int number;
    private int[] arrayNumbers;

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }



    public void setArrayNumbers(int[] arrayNumbers) {
        this.arrayNumbers = Arrays.copyOf(arrayNumbers, arrayNumbers.length);
    }
    public int[] getArrayNumbers() {
        return Arrays.copyOf(arrayNumbers, arrayNumbers.length);
    }
}