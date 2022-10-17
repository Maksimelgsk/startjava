public class CyclesTheme {
    public static void main (String [] args){
        System.out.println ("\nЗадача №1. Подсчет суммы четных и нечетных чисел\n");
        int evenSum = 0;
        int oddSum = 0;
        int i = -10;
        do {
             if (i % 2 == 0) {
                 evenSum = evenSum + i;
             } else { 
                   oddSum = oddSum + i;
             }
             i++;
           } while (i <= 21);
        System.out.println("Сумма четных чисел: " + evenSum);
        System.out.println("Сумма нечетных чисел: " + oddSum);
        System.out.println("Сумма всех чисел: " + (evenSum + oddSum));

        System.out.println("\nЗадача №2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        if (num1 > num3 && num2 > num3 && num1 > num2) {
          System.out.println(" min = " + num3);
          System.out.println(" max = " + num1);
        }
        for (i = num1; i >= num3; i--) {
           System.out.print(" " + i);
        }

        System.out.println();
        System.out.println("\nЗадача №3. Вывод реверсивного числа и суммы его цифр\n");
        int number = 0;
        int sumDigits = 0;
        int digit = 1234;
        i = digit;
        while(i > 0) {
            number = i % 10;
            sumDigits = number + sumDigits;
            System.out.println(" " + number);
            i /= 10;
        }
        System.out.println("Сумма цифр: " + sumDigits);

        System.out.println("\nЗадача №4. Вывод чисел на консоль в несколько строк\n");
        for (i = 1; i < 24; i+= 2) {
            for (int j = 0; j < 5; j++) {
                if (i < 24) {
                    System.out.printf("%4d", i);
               } else {
                   System.out.printf("%4d", 0);
               }
            i += 2;
            }
         i -=2;
         System.out.println();
        }

        System.out.println ("\nЗадача №5. Проверка количества единиц на четность\n");
        int numX = 3141591;
        int ones = 0;
        int sum = 0;
        i = numX;
        while (i > 0) {
            ones = i % 10;
            if (ones != 1) {
                ones = 0;
            }
            sum = ones + sum;
            i = i / 10;
        }
        if (sum % 2 == 0) {
            System.out.println("Число " + numX + " содержит " + sum + " (четное) количество единиц");
        } else {
            System.out.println("Число " + numX + " содержит " + sum + " (нечетное) количество единиц");
        }

        System.out.println ("\nЗадача №6. Отображение фигур в консоли\n");
        for(i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
               System.out.print("*");
            }
        System.out.println();
        }

        System.out.println();
        i = 0;
        while (i < 5) {
        int j = i;
             while (j < 5) {
               j++;
               System.out.print("#");
            }
         i++;
        System.out.println();
        }

        System.out.println();
        int j = 1;
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
         int num = 1234322;
         int rev = 0;
         i = num;
         while (i != 0) {
            rev = rev * 10 + i % 10;
            i = i / 10;
         }
         if (rev == num) {
             System.out.print("Число " + num + " является палиндромом");
         } else {
             System.out.print("Число " + num + " не является палиндромом");
         }

         System.out.println ("\nЗадача №9. Определение, является ли число счастливым\n");
         number = 501213;
         int left = number % 1000;
         int right = (number / 1000) % 1000;
         int sumL = 0;
         int sumR = 0;
         while (left != 0) {
             sumL = sumL + left % 10;
             left /= 10;
             }
             System.out.println("Сумма цифр " + (number / 100) % 10 + (number / 10) % 10 + 
                     number % 10 + " = " + sumL);
         while (right != 0) {
             sumR = sumR + right % 10;
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