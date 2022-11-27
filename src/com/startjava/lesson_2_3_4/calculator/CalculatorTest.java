package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reply = "yes";
        while ("yes".equals(reply)) {
            System.out.print("Введите математическое выражение: ");
            try {
                System.out.print("Результат: " + Calculator.calculate(scan.nextLine()));
            } catch (NumberFormatException e) {
                System.err.println("Ошибка! Некорректный ввод значений! Введите целые и положительные числа!");
            } catch (IllegalStateException | IllegalArgumentException | ArithmeticException e) {
                System.err.println(e.getMessage());
            }
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                reply = scan.nextLine();
            } while (!"no".equals(reply) && !"yes".equals(reply));
        }
    }
}