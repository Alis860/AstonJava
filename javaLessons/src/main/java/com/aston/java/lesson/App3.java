package com.aston.java.lesson;

import java.util.Arrays;

class App3 {
    public static void main(String[] args) {
        System.out.println(isSum(10, 11));
        checkNum(0);
        System.out.println(isNegativeNumber(1));
        display("привет", 4);
        System.out.println(isLeapYear(2020));
        arrayReplacement();
        arrayEmpty();
        arrayMultiply();
        arrayDiagonal(5);
        arrayArguments(10, 5);
    }

    public static boolean isSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNum(int c) {
        if (c >= 0) {
            System.out.println("Число " + c + " является положительным");
        } else {
            System.out.println("Число " + c + " является отрицательным");
        }
    }

    public static boolean isNegativeNumber(int x) {
        return x < 0;
    }

    public static void display(String str, int s) {
        for (int i = 0; i < s; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else return year % 4 == 0 && year % 100 != 0;
    }

    public static void arrayReplacement() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

    public static void arrayEmpty() {
        int[] arr = new int[100];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = j + 1;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }

    public static void arrayMultiply() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 9, 8, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

    public static void arrayDiagonal(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                if (i == j)
                    array[i][j] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                if (i + j == size - 1)
                    array[i][j] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

    public static void arrayArguments(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        System.out.println(Arrays.toString(array));
    }
}