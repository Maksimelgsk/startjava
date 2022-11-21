package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) throws RuntimeException {
        Scanner scan = new Scanner(System.in);
        String reply = "yes";
        while ("yes".equals(reply)) {
            System.out.print("Введите математическое выражение: ");
            int result = calculate(scan.nextLine());
            System.out.print("Результат: " + result);
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                reply = scan.nextLine();
            } while (!"no".equals(reply) && !"yes".equals(reply));
        }
    }

    public static int calculate(String mathExpression) {
        try {
            String[] partsExpression = mathExpression.split(" ");
            double num1 = Double.parseDouble(partsExpression[0]);
            double num2 = Double.parseDouble(partsExpression[2]);
            char sign = partsExpression[1].charAt(0);
            if (num1 < 0 || num2 < 0 ) {
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
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException error) {
            System.err.println("Ошибка! Неккоректный ввод значений!");
        } catch (ArithmeticException error) {
            System.err.println("Ошибка! Деление на ноль!");
        } catch (IllegalStateException error) {
            System.err.println("Ошибка! Неккоректный ввод знака!");
        }
        return 0;
    }
}
