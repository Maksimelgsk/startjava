public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        //выберите действие '+'; '-'; '*'; '/'; '^'; "%"
        char sign = '^';
        int result = 0;
        if (a < 0 || b < 0) {
            System.out.println("Введите целые положительные числа!!!");
        } else {
            if (sign == '+') {
                result = a + b;
            } else if (sign == '-') {
                result = a - b;
            } else if (sign == '*') {
                result = a * b;
            } else if (sign == '/') {
                result = a / b;
            } else if (sign == '^') {
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            } else if (sign == '%') {
                result = a % b;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}