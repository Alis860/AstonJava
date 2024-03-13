package com.aston.java.lesson;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.aston.java.lesson.DriverInitializer.driver;
import static com.aston.java.lesson.DriverInitializer.initDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {
    @Test
    public void testAddition()  {
        initDriver();
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String result = driver.findElement(By.className("//android.widget.EditText[@resource-id=\"com.google.android.calculator:id/formula\"]")).getText();
        assertEquals("10", result);
    }
}
