public class Calculator {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        //выберите действие 1-"+"; 2-"-"; 3-"*"; 4-"/"; 5-"^"; 6-"%"
        char sign = 4;
        int result = 0;
        if (sign == 1 && a >= 0 && b >= 0) {
            result = a + b;
            sign = '+';
        } else if (sign == 2 && a >= 0 && b >= 0) {
            result = a - b;
            sign = '-';
        } else if (sign == 3 && a >= 0 && b >= 0) {
            result = a * b;
            sign = '*';
        } else if (sign == 4 && a >= 0 && b >= 0) {
            result = a / b;
            sign = '/';
        } else if (sign == 5 && a >= 0 && b >= 0) {
            result = 1;
            for (int i = 1; i <= b; i++) {
                result = result * a;
            }
            sign = '^';
        } else if (sign == 6 && a >= 0 && b >= 0) {
            result = a % b;
            sign = '%';
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}