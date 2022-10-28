import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String reply = "yes";
        while("yes".equals(reply)) {
            System.out.print("Введите первое число: ");
            calc.setNum1(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextInt());
            calc.calculate();
            System.out.println("\nХотите продолжить вычисления? [yes/no]:");
            do {
                reply = scan.nextLine();
            } while (!"no".equals(reply) && !"yes".equals(reply));
        }
    }
}
