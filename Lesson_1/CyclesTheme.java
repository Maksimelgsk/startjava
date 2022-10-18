public class CyclesTheme {
    public static void main (String [] args) {
        System.out.println ("\nЗадача №1. Подсчет суммы четных и нечетных чисел\n");
        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
             } else {
                sumOdd += counter;
             }
             counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven +
                " , а нечетных " + sumOdd);

        System.out.println("\nЗадача №2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 5;
        int num2 = -1;
        int num3 = 10;
        int min = 0;
        int max = 0;
        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        for (int i = --max; i > min; i--) {
           System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача №3. Вывод реверсивного числа и суммы его цифр\n");
        int number = 1234;
        int sumDigits = 0;
        while(number > 0) {
            int digit = 0;
            digit = number % 10;
            sumDigits += digit;
            System.out.print(digit + " ");
            number /= 10;
        }
        System.out.println("\nСумма цифр: " + sumDigits);

        System.out.println("\nЗадача №4. Вывод чисел на консоль в несколько строк\n");
        for (int i = 1; i < 24; i+= 2) {
            for (int j = 0; j < 5; j++) {
                if (i < 24) {
                    System.out.printf("%3d", i);
                } else {
                    System.out.printf("%3d", 0);
                }
            i += 2;
            }
        i -= 2;
        System.out.println();
        }

        System.out.println ("\nЗадача №5. Проверка количества единиц на четность\n");
        int numX = 314191;
        int x = numX;
        int sum = 0;
        while (x > 0) {
            int ones = 0;
            ones = x % 10;
            if (ones != 1) {
                ones = 0;
            }
            sum += ones;
            x /= 10;
        }
        if (sum % 2 == 0) {
            System.out.println("Число " + numX + " содержит " + sum + " (четное) количество единиц");
        } else {
            System.out.println("Число " + numX + " содержит " + sum + " (нечетное) количество единиц");
        }

        System.out.println ("\nЗадача №6. Отображение фигур в консоли\n");
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
               System.out.print("*");
            }
        System.out.println();
        }

        System.out.println();
        int i = 0;
        int j = 0;
        while (i < 5) {
            j = i;
            while (j < 5) {
                j++;
                System.out.print("#");
            }
            i++;
        System.out.println();
        }

        System.out.println();
        j = 1;
        i = 5;
        do {
            if(i < 3) {
                j = i;
            } else {
                j = 6 - i;
            }
            do {
                System.out.print("$");
            } while(--j > 0);
        System.out.println();
        i--;
        } while(i > 0);

        System.out.println ("\nЗадача №7. Отображение ASCII-символов\n");
        System.out.println("  Dec  Char");
        for (i = 0; i <= 127; i++) {
            if (i > 0 && i <= 47 && i % 2 == 1) {
                System.out.printf("%4d%5c%n", i, i);
            } else if (i > 97 && i <= 122 && i % 2 == 0) {
                System.out.printf("%4d%5c%n", i, i);
            }
        }

        System.out.println ("\nЗадача №8. Проверка, является ли число палиндромом\n");
        int num = 1234321;
        int printNum = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (rev == printNum) {
            System.out.print("Число " + printNum + " является палиндромом");
        } else {
            System.out.print("Число " + printNum + " не является палиндромом");
        }

        System.out.println ("\n\nЗадача №9. Определение, является ли число счастливым\n");
        number = 501213;
        int left = number % 1000;
        int right = (number / 1000) % 1000;
        int sumL = 0;
        int sumR = 0;
        while (left != 0) {
            sumL += left % 10;
            left /= 10;
        }
        System.out.println("Сумма цифр " + (number / 100) % 10 + (number / 10) % 10 + 
                 number % 10 + " = " + sumL);
        while (right != 0) {
            sumR += right % 10;
            right /= 10;
        }
        System.out.println("Сумма цифр " + (number / 100000) % 10 + (number / 10000) % 10 + 
                (number / 1000) % 10 + " = " + sumR);
        if (sumL == sumR) {
            System.out.println(number + " является счастливым числом");
        } else {
            System.out.println(number + " не является счастливым числом");
        }

        System.out.println ("\nЗадача №10. Вывод таблицы умножения Пифагора\n");
        System.out.print("   |  2  3  4  5  6  7  8  9\n");
        System.out.println("---|-------------------------");
        for (i = 2; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                System.out.printf("%3d",i * j);
                if (j == 1 ) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
   }
}