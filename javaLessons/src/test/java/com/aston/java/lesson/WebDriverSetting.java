package com.aston.java.lesson;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverSetting {
    public static WebDriver driver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Zub\\Desktop\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test is starting");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.mts.by/?hash-offset=70&hash-dur=1300#pay-section");
        WebElement applyCookies = driver.findElement(By.id("cookie-agree"));
        applyCookies.click();
    }

    @AfterAll
    public static void tearDown() {
        // Закрыть браузер после окончания тестов
        System.out.println("Test is closing");
        driver.quit();
    }
}