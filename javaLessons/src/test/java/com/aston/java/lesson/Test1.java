package com.aston.java.lesson;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test1 extends WebDriverSettings {

    @Test
    @Order(1)
    @DisplayName("Поиск и вывод текста надписей в незаполненных полях для каждого варианта оплаты услуг. Домашний интернет")

    public void testHomeInternetBlock() {

        WebElement communicationServiceButton = driver.findElement(By.xpath("//button[@class='select__header']"));
        communicationServiceButton.click();

        WebElement homeInternetField = driver.findElement(By.xpath("//ul[@class='select__list']//li[2]"));
        homeInternetField.click();

        WebElement homeInternetField1 = driver.findElement(By.xpath("//input[@id='internet-phone']"));
        String homeInternetNumber = homeInternetField1.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Номер абонента' блока домашний интернет: " + homeInternetNumber);

        WebElement homeInternetField2 = driver.findElement(By.xpath("//input[@id='internet-sum']"));
        String homeInternetSum = homeInternetField2.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'Сумма' блока домашний интернет: " + homeInternetSum);

        WebElement homeInternetField3 = driver.findElement(By.xpath("//input[@id='internet-email']"));
        String homeInternetEmail = homeInternetField3.getAttribute("placeholder");
        System.out.println("Надпись в незаполненном поле 'E-mail для отправки чека' блока домашний интернет: " + homeInternetEmail);
    }

    public void testMethod() {
    }
}