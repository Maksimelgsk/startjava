package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадача №1. Подсчет суммы четных и нечетных чисел\n");
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
        int a = 10;
        int b = -1;
        int c = 5;
        int min = b;
        int max = a;
        if (a > max) {
            max = a;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            c = min;
        }
        for (int i = --max; i > min; i--) {
           System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача №3. Вывод реверсивного числа и суммы его цифр\n");
        int number = 1234;
        int sumDigits = 0;
        while(number > 0) {
            int digit = number % 10;;
            sumDigits += digit;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println("\nСумма цифр: " + sumDigits);

        System.out.println("\nЗадача №4. Вывод чисел на консоль в несколько строк\n");
        int newLine = 0;
        for (int i = 1; i < 30; i += 2) {
            newLine++;
            if (i < 24) {
                System.out.printf("%4d", i);
            } else if (i >= 24) {
                System.out.printf("%4d", 0);
            }
            if (newLine == 5 || newLine == 10) {
                System.out.println();
            }
        }

        System.out.println ("\nЗадача №5. Проверка количества единиц на четность\n");
        number = 314191;
        int copyNumber = number;
        int countOnes = 0;
        while (copyNumber > 0) {
            int digit = copyNumber % 10;
            if (digit == 1) {
                countOnes++;
            }
            copyNumber /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.println("Число " + number + " содержит " + countOnes + 
                    " (четное) количество единиц");
        } else {
            System.out.println("Число " + number + " содержит " + countOnes + 
                   " (нечетное) количество единиц");
        }

        System.out.println ("\nЗадача №6. Отображение фигур в консоли\n");
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int numSymbolsPerLine = 0;
        int numLines = 0;
        while (numSymbolsPerLine < 5) {
            numLines = numSymbolsPerLine;
            while (numLines < 5) {
                numLines++;
                System.out.print("#");
            }
            numSymbolsPerLine++;
            System.out.println();
        }

        System.out.println();
        numLines = 1;
        numSymbolsPerLine = 5;
        do {
            if(numSymbolsPerLine < 3) {
                numLines = numSymbolsPerLine;
            } else {
                numLines = 6 - numSymbolsPerLine;
            }
            do {
                System.out.print("$");
            } while(--numLines > 0);
            System.out.println();
            numSymbolsPerLine--;
        } while(numSymbolsPerLine > 0);

        System.out.println ("\nЗадача №7. Отображение ASCII-символов\n");
        System.out.println("  Dec  Char");
        for (int i = 0; i <= 127; i++) {
            if ((i > 0) && (i <= 47) && (i % 2 == 1)) {
                System.out.printf("%4d%5c%n", i, i);
            } else if ((i > 97) && (i <= 122) && (i % 2 == 0)) {
                System.out.printf("%4d%5c%n", i, i);
            }
        }

        System.out.println ("\nЗадача №8. Проверка, является ли число палиндромом\n");
        number = 1234321;
        copyNumber = number;
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        if (rev == copyNumber) {
            System.out.print("Число " + copyNumber + " является палиндромом");
        } else {
            System.out.print("Число " + copyNumber + " не является палиндромом");
        }

        System.out.println ("\n\nЗадача №9. Определение, является ли число счастливым\n");
        number = 501213;
        int right = number % 1000;
        int left = number / 1000;
        int sumL = 0;
        int sumR = 0;
        while (left != 0 && right != 0) {
            sumL += left % 10;
            sumR += right % 10;
            left /= 10;
            right /= 10;
        }
        System.out.println("Сумма цифр " + number / 1000 + " = " + sumL);
        System.out.println("Сумма цифр " + number % 1000 + " = " + sumR);
        if (sumL == sumR) {
            System.out.println(number + " является счастливым числом");
        } else {
            System.out.println(number + " не является счастливым числом");
        }

        System.out.println ("\nЗадача №10. Вывод таблицы умножения Пифагора\n");
        System.out.print("   |  2  3  4  5  6  7  8  9\n");
        System.out.println("---|-------------------------");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d",i * j);
                if (j == 1 ) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
   }
}