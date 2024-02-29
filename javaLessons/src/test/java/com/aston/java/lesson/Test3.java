package com.aston.java.lesson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test3 extends WebDriverSettings {


    @Test
    @Order(3)
    @DisplayName("Поиск и вывод текста надписей в незаполненных полях для каждого варианта оплаты услуг. Задолженность")

    public void testDebtBlock() {

        WebElement debtButton = driver.findElement(By.xpath("//button[@class='select__header']"));
        debtButton.click();

        WebElement debtField = driver.findElement(By.xpath("//ul[@class='select__list']//li[4]"));
        debtField.click();

        WebElement debtField1 = driver.findElement(By.xpath("//input[@id='score-arrears']"));
        String debtNumber = debtField1.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Номер счета на 2073' блока задолженность: " + debtNumber);

        WebElement debtField2 = driver.findElement(By.xpath("//input[@id='arrears-sum']"));
        String debtSum = debtField2.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Сумма' блока задолженность: " + debtSum);

        WebElement debtField3 = driver.findElement(By.xpath("//input[@id='arrears-email']"));
        String debtEmail = debtField3.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'E-mail для отправки чека' блока задолженность: " + debtEmail);
    }
}