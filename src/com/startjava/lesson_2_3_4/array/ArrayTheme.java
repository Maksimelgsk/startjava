package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 3, 2, 4, 2, 7, 5};
        int len = intArr.length;
        outIntArray(intArr);
        System.out.println();
        for (int i = 0; i < len / 2; i++) {
            int var = intArr[i];
            intArr[i] = intArr[len - i - 1];
            intArr[len - i - 1] = var;
        }
        outIntArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        len = 10;
        intArr = new int[len];
        int multi = 1;
        for (int i = 1; i < intArr.length - 1; i++) {
            intArr[i] = i;
            multi *= intArr[i];
        }
        System.out.print("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = " + multi);
        String result = (multi == 40320) ? "(The solve : True)" : "(The solve : False)";
        System.out.print(" " + result);

        System.out.println("\n\n3. Удаление элементов массива");
        len = 15;
        float[] floatArr = new float[len];
        for (int i = 0; i < len; i++) {
            floatArr[i] = (float) Math.random();
        }
        outFloatArrayMod(floatArr);
        System.out.println("\n");
        int sum = 0;
        for (int i = 0; i < len; i++) {
            float midFlotArr = floatArr[len / 2];
            if (floatArr[i] > midFlotArr) {
                floatArr[i] = 0;
            }
            int b;
            if (floatArr[i] == 0) b = 1;
            else b = 0;
            sum += b;
        }
        outFloatArrayMod(floatArr);
        System.out.println("\n\n  Кол-во обнуленных ячеек: " + sum);

        System.out.println("\n\n4. Вывод элементов массива лесенкой в обратном порядке");
        len = 26;
        char[] charArr = new char[len];
        int k = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            charArr[k++] = ch;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(charArr[j] + " ");
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
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println("Исходный массив : ");
        for (String s : stringArr) {
            System.out.print(s);
        }
        int length = 0;
        for (String s : stringArr) {
            if (s.isBlank()) {
                length++;
            }
        }
        int totalFillSting = stringArr.length - length;
        System.out.println();
        String[] arrCopy1 = new String[1];
        System.arraycopy(stringArr, 1, arrCopy1, 0, 1);
        String[] arrCopy2 = new String[3];
        System.arraycopy(stringArr, 3, arrCopy2, 0, 3);
        String[] arrCopy3 = new String[3];
        System.arraycopy(stringArr, 7, arrCopy3, 0, 3);
        System.out.println("Клонированный массив : ");
        for (String arrCopy: combineArrays(arrCopy1, arrCopy2, arrCopy3, totalFillSting)) {
            System.out.print(arrCopy);
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

    public static String[] combineArrays(String[] arrCopy1, String[] arrCopy2, String[] arrCopy3, int totalString1) {
        int totalString2 = arrCopy1.length + arrCopy2.length + arrCopy3.length;
        String[] totalArray = new String[totalString2];
        if (totalString2 == totalString1) {
            for (int i = 0; i < arrCopy1.length; i++) {
                totalArray[i] = arrCopy1[i];
            }
            int j = 0;
            for (int i = arrCopy1.length; i < arrCopy1.length + arrCopy2.length; i++) {
                totalArray[i] = arrCopy2[j];
                j++;
            }
            int k = 0;
            for (int i = arrCopy1.length + arrCopy2.length; i < totalString2; i++) {
                totalArray[i] = arrCopy3[k];
                k++;
            }
        }
        return totalArray;

    }

}