package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 3, 2, 4, 2, 7};
        int len = intArr.length;
        for (int i : intArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(intArr[i] + " ");
        }

        System.out.println("\n2. Вывод произведения элементов массива");
        len = 10;
        intArr = new int[len];
        int p = 1;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
            System.out.print(intArr[i] + " ");
            p = i == 0 ? 1 : p * intArr[i];
        }
        System.out.println("\n" + intArr[1] + " * " + intArr[2] + " * " + intArr[3] + " * "
                + intArr[4] + " * " + intArr[5] + " * " + intArr[6] + " * " + intArr[7] +
                " * " + intArr[8] + " = " + p / intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        len = 15;
        float[] floatArr = new float[len];
        int k = 0;
        int n = 0;
        for (int i = 0; i < len; i++) {
            k++;
            floatArr[i] = (float) Math.random();
            System.out.printf("%7.3f", floatArr[i]);
            if (k == 8) System.out.println();
        }
        System.out.println("\n");
        for (int i = 0; i < len; i++) {
            n++;
            if (floatArr[i] > floatArr[len / 2]) {
                floatArr[i] = 0;
            }
            System.out.printf("%7.3f", floatArr[i]);
            if (n == 8) System.out.println();
        }
        int sum = 0;
        for (float value : floatArr) {
            int b;
            if (value == 0) {
                b = 1;
            } else {
                b = 0;
            }
            sum += b;
        }
        System.out.println("\n\n  Кол-во обнуленных ячеек: " + sum);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        len = 26;
        char[] charArr = new char[len];
        int i = 0;
        int j = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            charArr[i++] = ch;
        }
        for (i = 0; i < len; i++) {
            System.out.print(charArr[i] + " ");
        }
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            charArr[j++] = ch;
        }
        for (int m = 0; m <= len; m++) {
            for (j = 0; j < m; j++) {
                System.out.print(charArr[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        len = 30;
        intArr = new int[len];
        for (i = 0; i < len; i++) {
            int randomNum;
            do {
                randomNum = (int) (Math.random() * 40 + 60);
            } while (!isUnique(intArr, randomNum));
            intArr[i] = randomNum;
        }
        Arrays.sort(intArr);
        for (i = 0; i < len; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", intArr[i]);
        }

    }
    private static boolean isUnique(int[] intArr, int num) {
        for (int element : intArr) {
            if (num == element) {
                return false;
            }
        }
        return true;
    }
}

