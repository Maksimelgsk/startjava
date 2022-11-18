package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        int len = intArr.length;
        outIntArray(intArr);
        System.out.println();
        for (int i = 0; i < len; i++) {
            len--;
            int tmp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = tmp;
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
            System.out.print(intArr[i] + ((i < len - 2) ? " * " : " = " + result));
        }
        System.out.println("\n" + intArr[0] + " " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatArr = new float[15];
        len = floatArr.length;
        for (int i = 0; i < len; i++) {
            floatArr[i] = (float) Math.random();
        }
        outFloatArray(floatArr);
        int zeroCounter = 0;
        float middleNum = floatArr[len / 2];
        for (int i = 0; i < len; i++) {
            if (floatArr[i] > middleNum) {
                floatArr[i] = 0;
                zeroCounter++;
            }
        }
        outFloatArray(floatArr);
        System.out.println("\n\n  Кол-во обнуленных ячеек: " + zeroCounter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] engAlphabet = new char[26];
        len = engAlphabet.length;
        int k = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            engAlphabet[k++] = ch;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(engAlphabet[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        len = 30;
        intArr = new int[len];
        for (int i = 0; i < len; i++) {
            int randomNum;
            boolean unique;
            do {
                randomNum = (int) (Math.random() * 40 + 60);
                unique = isUnique(intArr, randomNum);
            } while (!unique);
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
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (!srcArr[i].isBlank()) {
                count++;
            }
        }
        String[] destArr = new String[count];
        int destPos = 0;
        int countStr = 0;
        for (int i = 0; i < len; i++) {
            if (!srcArr[i].isBlank()) {
                countStr++;
            } else {
                if (countStr > 0) {
                    System.arraycopy(srcArr, i - countStr, destArr, destPos, countStr);
                    destPos += countStr;
                }
                countStr = 0;
            }
        }
        System.out.println("Исходный массив : " + Arrays.toString(srcArr));
        System.out.println("Модифицированный массив : " + Arrays.toString(destArr));
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

    public static void outFloatArray(float[] floatArr) {
        for (int i = 0; i < floatArr.length; i++) {
            if (i % 8 == 0) System.out.println();
            System.out.printf("%7.3f", floatArr[i]);
        }
    }
}