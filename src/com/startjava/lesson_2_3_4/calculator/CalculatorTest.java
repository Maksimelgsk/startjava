package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String reply = "yes";
        while ("yes".equals(reply)) {
            System.out.print("Введите математическое выражение: ");
            String str = scan.nextLine();
            String[] words = str.split(" ");
                calc.setNum1(Integer.parseInt(words[0]));
                calc.setNum2(Integer.parseInt(words[2]));
                calc.setSign(words[1].charAt(0));
                calc.calculate();
            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                reply = scan.nextLine();
            } while (!"no".equals(reply) && !"yes".equals(reply));
        }
    }
}
