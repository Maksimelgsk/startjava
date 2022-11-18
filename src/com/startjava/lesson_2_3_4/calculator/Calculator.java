package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    public int calculate() {
        Scanner scan = new Scanner(System.in);
        String mathExpression = scan.nextLine();
        String[] partsExpression = mathExpression.split(" ");
        int num1 = Integer.parseInt(partsExpression[0]);
        int num2 = Integer.parseInt(partsExpression[2]);
        char sign = partsExpression[1].charAt(0);
        switch (sign) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return Math.floorDiv(num1, num2);
                } else {
                    System.out.println("ОШИБКА!");
                }
            case '^': return (int) Math.pow(num1, num2);
            case '%': return num1 % num2;
            default:
                System.out.println("Вы допустили ошибку при вводе знака!");
        }
        return 0;
    }
}