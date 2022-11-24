package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        double num1 = Double.parseDouble(partsExpression[0]);
        double num2 = Double.parseDouble(partsExpression[2]);
        char sign = partsExpression[1].charAt(0);
        if (num1 < 0 || num2 < 0) {
            System.err.println("Ошибка! Введены отрицательные числа!");
            return 0;
        }
        if (num1 % 1 != 0 || num2 % 1 != 0) {
            System.err.println("Ошибка! Введены не целые числа!");
            return 0;
        }
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        double result = switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '^' -> Math.pow(num1, num2);
            case '%' -> num1 % num2;
            default -> throw new IllegalStateException();
        };
        return (int) result;
    }
}