public class Calculator {
    private int num1, num2, result;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setMathOperator(char sign) {
        this.sign = sign;
    }

    public void Operator() {
        switch (sign) {
            case '+':
                result = num1 + num2;
                System.out.print("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.print("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.print("Результат: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.print("ОШИБКА");
                } else {
                    result = num1 / num2;
                    System.out.print("Результат: " + result);
                }
                break;
            case '^':
                result = 1;
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                System.out.print("Результат: " + result);
                break;
            case '%': result = num1 % num2;
                System.out.print("Результат: " + result);
                break;
            default: 
                System.out.println("Вы допустили ошибку при вводе знака");
        }
    }
}