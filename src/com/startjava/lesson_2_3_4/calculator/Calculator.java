package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int num1, num2, result;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = Math.floorDiv(num1, num2);
                } else {
                    System.out.println("ОШИБКА");
                    return result;
                }
                break;
            case '^':
                result = (int) Math.pow(num1, num2);
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Вы допустили ошибку при вводе знака");
        }
        System.out.print("Результат: " + result);
        return result;
    }
}