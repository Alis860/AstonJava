package com.aston.java.lesson;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTsTest {
    private static WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Zub\\Desktop\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test is starting");
    }

    @Test
    public void testOnlineRechargeBlock() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.mts.by/?hash-offset=70&hash-dur=1300#pay-section");
        WebElement applyCookies = driver.findElement(By.id("cookie-agree"));
        applyCookies.click();

        // Проверяем название указанного блока
        WebElement blockTitle = driver.findElement(By.xpath("//div[@class='pay__wrapper']//h2"));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        String actualTitle = blockTitle.getText();
        Assertions.assertEquals(expectedTitle, actualTitle, "Название блока не соответствует ожидаемому");

        // Проверяем наличие логотипов платежных систем
        WebElement logo1 = driver.findElement(By.xpath("//img[@alt='Visa']"));
        assertTrue(logo1.isDisplayed());

        WebElement logo2 = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        assertTrue(logo2.isDisplayed());

        WebElement logo3 = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        assertTrue(logo3.isDisplayed());

        WebElement logo4 = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        assertTrue(logo4.isDisplayed());

        WebElement logo5 = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        assertTrue(logo5.isDisplayed());

        WebElement logo6 = driver.findElement(By.xpath("//img[@alt='МИР']"));
        assertTrue(logo6.isDisplayed());

        // Заполняем поля и проверяем работу кнопки "Продолжить"
        WebElement inputNumber = driver.findElement(By.xpath("//input[@class='phone']"));
        inputNumber.click();
        inputNumber.sendKeys("297777777");
        WebElement inputSum = driver.findElement(By.xpath("//input[@class='total_rub']"));
        inputSum.click();
        inputSum.sendKeys("30");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@class='email']"));
        inputEmail.click();
        inputEmail.sendKeys("kosmonova@yandex.ru");
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();

        // Найти ссылку "Подробнее о сервисе"
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        link.click();
        // Проверить, что URL соответствует ожидаемому
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl, "URL не соответствует ожидаемому");
    }

    @AfterAll
    public static void tearDown() {
        // Закрыть браузер после окончания тестов
        System.out.println("Test is closing");
        driver.quit();
    }
}