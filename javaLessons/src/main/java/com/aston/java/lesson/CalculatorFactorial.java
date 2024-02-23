package com.aston.java.lesson;

import java.util.Scanner;

public class CalculatorFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        try {
            long factorial = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " = " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал отрицательных чисел не определен.");
        }
        if (number == 0 || number == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}