package com.aston.java.lesson;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorFactorialTest {

    @Test(description = "Тестрование ввода положительного числа для вычисления факториала")
    void testCalculateFactorialForPositiveNumber() {
        int number = 5;
        long expectedFactorial = 120;
        long actualFactorial = CalculatorFactorial.calculateFactorial(number);
        assertEquals(actualFactorial, expectedFactorial);
    }

    @Test(description = "Тестирование ввода отрицательного числа для вычисления факториала",
            expectedExceptions = IllegalArgumentException.class)
    void testCalculateFactorialForNegativeNumber() {
        int number = -5;
        CalculatorFactorial.calculateFactorial(number);
    }

    @Test(description = "Тестрование ввода числа 0 для вычисления факториала")
    void testCalculateFactorialForZero() {
        int number = 0;
        long expectedFactorial = 1;
        long actualFactorial = CalculatorFactorial.calculateFactorial(number);
        assertEquals(actualFactorial, expectedFactorial);
    }
}