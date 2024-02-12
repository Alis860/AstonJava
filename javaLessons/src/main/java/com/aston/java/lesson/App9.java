package com.aston.java.lesson;

import java.util.*;

public class App9 {
    public static void main(String[] args) {
        //Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел.
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        int size = 10; // Размер набора чисел


        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100)); // Генерируем случайные числа от 0 до 99
        }

        System.out.println("Сгенерированный набор чисел: " + numbers);

        int evenCount = 0;


        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Количество четных чисел: " + evenCount);
    }
}

