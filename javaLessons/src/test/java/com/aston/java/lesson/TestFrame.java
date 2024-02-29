package com.aston.java.lesson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestFrame extends WebDriverSettings {


    @Test
    @DisplayName("Проверка надписей в незаполненных полях для ввода реквизитов карты")

    public void testFrameBankBlock() {

        WebElement mobileServiceField = driver.findElement(By.xpath("//input[@class='phone']"));
        String mobileServiceNumber = mobileServiceField.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Номер абонента' блока услуги связи: " + mobileServiceNumber);

        WebElement mobileServiceField1 = driver.findElement(By.xpath("//input[@class='total_rub']"));
        String mobileServiceSum = mobileServiceField1.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Сумма' блока услуги связи: " + mobileServiceSum);

        WebElement mobileServiceField2 = driver.findElement(By.xpath("//input[@class='email']"));
        String mobileServiceEmail = mobileServiceField2.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'E-mail для отправки чека' блока услуги связи: " + mobileServiceEmail);

        WebElement inputNumber = driver.findElement(By.xpath("//input[@class='phone']"));
        inputNumber.click();

        inputNumber.sendKeys("297777777");
        WebElement inputSum = driver.findElement(By.xpath("//input[@class='total_rub']"));
        inputSum.click();

        inputSum.sendKeys("30");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@class='email']"));
        inputEmail.click();
        inputEmail.sendKeys("kosmonova@yandex.ru");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        continueButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String[] windowHandles = driver.getWindowHandles().toArray(new String[0]);

        driver.switchTo().window(windowHandles[0]);
        By xpathSelector = By.xpath("(//app-payment-container//span)[1]");
        wait.until(ExpectedConditions.presenceOfElementLocated(xpathSelector));
        WebElement element = driver.findElement(xpathSelector);
        element.sendKeys("Тестовые данные" + inputSum);

        WebElement cardNumberFiled = driver.findElement(By.xpath("//label[text()='Номер карты']"));
        String cardNumber = cardNumberFiled.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Номер карты' нового окна: " + cardNumberFiled);

        WebElement validityFiled = driver.findElement(By.xpath("//input[@type='tel']"));
        String validity = validityFiled.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Срок действия' нового окна: " + validity);

        WebElement cvcFiled = driver.findElement(By.xpath("//input[@name='verification_value']"));
        String cvc = cvcFiled.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'CVC' нового окна: " + cvc);

        WebElement nameHolderFiled = driver.findElement(By.xpath("//input[@autocomplete='cc-name']"));
        String nameHolder = nameHolderFiled.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Имя держателя (как на карте)' нового окна: " + nameHolder);
    }
}
//div[@class='app-wrapper__content']