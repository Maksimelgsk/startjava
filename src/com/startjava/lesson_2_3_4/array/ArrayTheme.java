package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int len = intArr.length;
        outIntArray(intArr);
        System.out.println();
        for (int i = 0; i < len / 2; i++) {
            int var = intArr[i];
            len--;
            intArr[i] = intArr[len - i];
            intArr[len - i] = var;
        }
        outIntArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        int result = 1;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }
        System.out.println();
        for (int i = 1; i < len - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i]);
            System.out.printf("%3s", (i < 8) ? " * " : " = ");
        }
        System.out.println(result);
        System.out.println(intArr[0] + " " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatArr = new float[15];
        len = floatArr.length;
        for (int i = 0; i < len; i++) {
            floatArr[i] = (float) Math.random();
        }
        outFloatArrayMod(floatArr);
        System.out.println("\n");
        int sumNull = 0;
        float middleNum = floatArr[len / 2];
        for (int i = 0; i < len; i++) {
            if (floatArr[i] > middleNum) {
                floatArr[i] = 0;
                sumNull++;
            }
        }
        outFloatArrayMod(floatArr);
        System.out.println("\n\n  Кол-во обнуленных ячеек: " + sumNull);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letterArr = new char[26];
        len = letterArr.length;
        int k = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            letterArr[k++] = ch;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(letterArr[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        len = 30;
        intArr = new int[len];
        for (int i = 0; i < len; i++) {
            int randomNum;
            do {
                randomNum = (int) (Math.random() * 40 + 60);
            } while (!isUnique(intArr, randomNum));
            intArr[i] = randomNum;
        }
        Arrays.sort(intArr);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", intArr[i]);
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = srcArr.length;
        System.out.println("Source array : " + Arrays.toString(srcArr));
        int noEmptyString = 0;
        for (int i = 0; i < len; i++) {
            if (!srcArr[i].isBlank()) {
                noEmptyString++;
            }
        }
        String[] destArr = new String[noEmptyString];
        int n = 0;
        int length = 1;
        for (int i = 0; i < len; i++) {
                if (!srcArr[i].isBlank()) {
                    System.arraycopy(srcArr, i, destArr, n++, length);
                }
        }
        System.out.println("Destination arrays : " + Arrays.toString(destArr));

    }

    private static boolean isUnique(int[] intArr, int num) {
        for (int element : intArr) {
            if (num == element) {
                return false;
            }
        }
        return true;
    }

    public static void outIntArray(int[] intArr) {
        for (int num : intArr) {
            System.out.print(num + " ");
        }
    }

    public static void outFloatArrayMod(float[] floatArr) {
        for (int i = 0; i < floatArr.length; i++) {
            if (i % 8 == 0) System.out.println();
            System.out.printf("%7.3f", floatArr[i]);
        }
    }

}