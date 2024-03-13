package com.aston.java.lesson;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.aston.java.lesson.DriverInitializer.driver;
import static com.aston.java.lesson.DriverInitializer.initDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {

    @Test
    public void testAddition() {
        initDriver();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();

        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "12");
    }

    @Test
    public void testSubtraction() {
        initDriver();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_sub"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "6");
    }

    @Test
    public void testMultiplication() {
        initDriver();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_mul"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "27");
    }

    @Test
    public void testDivision() {
        initDriver();
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_div"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "3");
    }
}
