package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reply = "yes";
        while ("yes".equals(reply)) {
            System.out.print("Введите математическое выражение: ");
            try {
                calculate(scan.nextLine());
            } catch (Exception error) {
                System.err.println("Ошибка! Неккоректный ввод значений!!!");
            }
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                reply = scan.nextLine();
            } while (!"no".equals(reply) && !"yes".equals(reply));
        }
    }

    public static void calculate(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
        int num1 = Integer.parseInt(partsExpression[0]);
        int num2 = Integer.parseInt(partsExpression[2]);
        char sign = partsExpression[1].charAt(0);
        try {
            if (num1 < 0 || num2 < 0) {
                throw new IllegalArgumentException();
            }
            try {
                int result = switch (sign) {
                    case '+' -> num1 + num2;
                    case '-' -> num1 - num2;
                    case '*' -> num1 * num2;
                    case '/' -> Math.floorDiv(num1, num2);
                    case '^' -> (int) Math.pow(num1, num2);
                    case '%' -> num1 % num2;
                    default -> throw new IllegalStateException();
                };
                System.out.print("Результат: " + result);
            } catch (ArithmeticException error) {
                System.err.println("Ошибка! Деление на ноль!");
            }
        } catch (IllegalArgumentException error) {
            System.err.println("Ошибка! Введены отрицательные числа!!!");
        }
    }
}
