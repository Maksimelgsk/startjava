package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        int num1 = Integer.parseInt(partsExpression[0]);
        int num2 = Integer.parseInt(partsExpression[2]);
        char sign = partsExpression[1].charAt(0);
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException("Ошибка! Введите целые и положительные числа!");
        }
        if (num2 == 0) {
            throw new ArithmeticException ("Ошибка! Деление на ноль!");
        }
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> Math.floorDiv(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> num1 % num2;
            default -> throw new IllegalStateException("Ошибка! Некорректный ввод знака математической операции!");
        };
    }
}