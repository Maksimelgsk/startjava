import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculate = new Calculator();
        int userInput;
        String reply = "yes";
        while(reply.equals("yes")) {
            System.out.print("Введите первое число: ");
            userInput = scan.nextInt();
            calculate.setNum1(userInput);
            System.out.print("Введите знак математической операции: ");
            calculate.setMathOperator(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            userInput = scan.nextInt();
            calculate.setNum2(userInput);
            calculate.Operator();
            reply = "";
            while (!reply.equals("no") && !reply.equals("yes")) {
                System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                scan = new Scanner(System.in);
                reply = scan.nextLine();
            }
        }
    }
}
