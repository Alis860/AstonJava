package com.aston.java.lesson;

import org.junit.jupiter.api.Test;

import static com.aston.java.lesson.CalculatorFactorial.calculateFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorFactorialTest {

    @Test
    void testCalculateFactorialForPositiveNumber() {
        int number = 5;
        long expectedFactorial = 120;
        long actualFactorial = calculateFactorial(number);

        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    void testCalculateFactorialForNegativeNumber() {
        int number = -5;

        assertThrows(IllegalArgumentException.class, () -> calculateFactorial(number));
    }

    @Test
    public void testCalculateFactorialForZero() {
        int number = 0;
        long expectedFactorial = 1;
        long actualFactorial = CalculatorFactorial.calculateFactorial(number);

        assertEquals(expectedFactorial, actualFactorial);
    }
}