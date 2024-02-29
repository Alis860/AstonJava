package com.aston.java.lesson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test4 extends WebDriverSettings {
    @Test
    @Order(4)
    @DisplayName("Заполнение полей и проверка работы кнопки \"Продолжить\"")

    public void testFillCommunicationServicesBlock() {

        WebElement communicationServicesButton = driver.findElement(By.xpath("//button[@class='select__header']"));
        communicationServicesButton.click();

        WebElement communicationServicesButton1 = driver.findElement(By.xpath("//p[@class='select__option']"));
        communicationServicesButton1.click();

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

        try {
            Thread.sleep(5000); // Задержка в 5 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}