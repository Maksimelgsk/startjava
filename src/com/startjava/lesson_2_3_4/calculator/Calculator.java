package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public int calculate(int num1, int num2, char sign) {
        switch (sign) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return Math.floorDiv(num1, num2);
                } else {
                    System.out.println("ОШИБКА!");
                    return 0;
                }
            case '^': return (int) Math.pow(num1, num2);
            case '%': return num1 % num2;
            default:
                System.out.println("Вы допустили ошибку при вводе знака!");
        }
        return 0;
    }
}