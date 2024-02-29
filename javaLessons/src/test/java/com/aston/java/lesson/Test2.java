package com.aston.java.lesson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends WebDriverSettings {

    @Test
    @Order(2)
    @DisplayName("Поиск и вывод текста надписей в незаполненных полях для каждого варианта оплаты услуг. Рассрочка")

    public void testInstallmentPlanBlock() {

        WebElement installmentPlanButton = driver.findElement(By.xpath("//button[@class='select__header']"));
        installmentPlanButton.click();

        WebElement installmentPlanField = driver.findElement(By.xpath("//ul[@class='select__list']//li[3]"));
        installmentPlanField.click();

        WebElement installmentPlanField1 = driver.findElement(By.xpath("//input[@id='internet-phone']"));
        String installmentPlanNumber = installmentPlanField1.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Номер счета на 44' блока рассрочка: " + installmentPlanNumber);

        WebElement installmentPlanField2 = driver.findElement(By.xpath("//input[@id='internet-sum']"));
        String installmentPlanSum = installmentPlanField2.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Сумма' блока рассрочка: " + installmentPlanSum);

        WebElement installmentPlanField3 = driver.findElement(By.xpath("//input[@id='internet-email']"));
        String installmentPlanEmail = installmentPlanField3.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'E-mail для отправки чека' блока рассрочка: " + installmentPlanEmail);
    }
}