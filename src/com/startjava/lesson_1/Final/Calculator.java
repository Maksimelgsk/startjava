package com.startjava.lesson_1.Final;

public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        //выберите действие '+'; '-'; '*'; '/'; '^'; "%"
        char operator = '^';
        int result = 0;
        if (a < 0 || b < 0) {
            System.out.println("Введите целые положительные числа!!!");
        } else {
            if (operator == '+') {
                result = a + b;
            } else if (operator == '-') {
                result = a - b;
            } else if (operator == '*') {
                result = a * b;
            } else if (operator == '/') {
                result = a / b;
            } else if (operator == '^') {
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            } else if (operator == '%') {
                result = a % b;
            }
            System.out.println(a + " " + operator + " " + b + " = " + result);
        }
    }
}