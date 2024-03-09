package com.aston.java.lesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='bepaid-iframe']")));

        WebElement iframeHeaderPrice = driver.findElement(By.xpath("//div[@class='header__payment-amount']"));

        WebElement iframeHeaderNumber = driver.findElement(By.xpath("//p[@class='header__payment-info']"));

        List<WebElement> iframeAppCardInputPlaceholders = driver.findElements(By.xpath("//app-card-input//input//following-sibling::label"));

        WebElement iframeIconMasterCard = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']"));
        wait.until(ExpectedConditions.visibilityOf(iframeIconMasterCard));

        WebElement iframeIconVisa = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/visa-system.svg']"));
        wait.until(ExpectedConditions.visibilityOf(iframeIconVisa));

        WebElement iframeIconBelkart = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']"));
        wait.until(ExpectedConditions.visibilityOf(iframeIconBelkart));

        WebElement iframeIconMir = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']"))));

        WebElement iframeButton = driver.findElement(By.xpath("//div[@class='card-page__card']//button"));
        wait.until(ExpectedConditions.visibilityOf(iframeButton));

        List<String> placeholders = new ArrayList<>();
        for (WebElement ele : iframeAppCardInputPlaceholders) {
            wait.until(ExpectedConditions.visibilityOf(ele));
            placeholders.add(ele.getAttribute("textContent"));
        }

        short price = 30;
        Assertions.assertEquals(price + ".00", iframeHeaderPrice.getAttribute("textContent").replace("BYN", "").trim());
        String number = String.valueOf(297777777);
        Assertions.assertEquals(number, iframeHeaderNumber.getAttribute("textContent").replace(" Оплата: Услуги связи\nНомер:375", "").trim());
        Assertions.assertEquals(List.of("Номер карты", "Срок действия", "CVC", "Имя держателя (как на карте)"), placeholders);
        Assertions.assertTrue(iframeIconMasterCard.isDisplayed());
        Assertions.assertTrue(iframeIconVisa.isDisplayed());
        Assertions.assertTrue(iframeIconBelkart.isDisplayed());
        Assertions.assertTrue(wait.until(ExpectedConditions.visibilityOf(iframeIconMir)).isDisplayed());

        WebElement iframeIconMaestro = driver.findElement(By.xpath("//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']"));
        Assertions.assertTrue(wait.until(ExpectedConditions.visibilityOf(iframeIconMaestro)).isDisplayed());
    }
}