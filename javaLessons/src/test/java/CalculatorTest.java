import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.aston.java.lesson.DriverInitializer.driver;
import static com.aston.java.lesson.DriverInitializer.initDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddition()  {
        initDriver();
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        MobileElement resultElement = (MobileElement) driver.findElement(By.id("com.google.android.calculator:id/formula"));
        String actualResult = resultElement.getText();
        String expectedResult = "10";
        assertEquals(expectedResult, actualResult, "Результат неверный");
    }

}
