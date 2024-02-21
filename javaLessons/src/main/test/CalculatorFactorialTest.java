import com.aston.java.lesson.CalculatorFactorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.aston.java.lesson.CalculatorFactorial.calculateFactorial;

class CalculatorFactorialTest {

    @Test
    void testCalculateFactorialForPositiveNumber() {
        int number = 5;
        long expectedFactorial = 120;
        long actualFactorial = calculateFactorial(number);
        Assertions.assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    void testCalculateFactorialForNegativeNumber() {
        int number = -5;
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculateFactorial(number));
    }

    @Test
    public void testCalculateFactorialForZero() {
        int number = 0;
        long expectedFactorial = 1;
        long actualFactorial = CalculatorFactorial.calculateFactorial(number);
        Assertions.assertEquals(expectedFactorial, actualFactorial);
    }
}