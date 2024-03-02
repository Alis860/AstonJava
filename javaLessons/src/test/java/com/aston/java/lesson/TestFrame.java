package com.aston.java.lesson;

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








        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@app-payment-container/app-header]")));
//        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//            By xpathSelector = By.xpath("//app-payment-container/app-header//div//span[1]");
//            wait.until(ExpectedConditions.presenceOfElementLocated(xpathSelector));
//            WebElement element = driver.findElement(xpathSelector);
//        WebElement frame = null;
//        frame.sendKeys("Тестовые данные" + inputSum);


//        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//
//// Переключение на нужный фрейм (в данном случае, первый найденный фрейм)
//        if (!frames.isEmpty()) {
//            driver.switchTo().frame(frames.get(0)); // Переключение на фрейм с помощью индекса
//            WebElement frameElement = driver.findElement(By.xpath("//app-payment-container/app-header//div//span[1]")); // Пример поиска элемента внутри фрейма
//            frameElement.sendKeys("Тестовые данные"); // Пример взаимодействия с элементом внутри фрейма
//
//        } else {
//            System.out.println("Фреймы не найдены");
//        }



//        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
//
//        int frameIndex = -1;
//        for (int i = 0; i < windowHandles.size(); i++) {
//            driver.switchTo().window(windowHandles.get(i));
//            if (driver.findElements(By.tagName("iframe")).size() > 0) {
//                frameIndex = i;
//                break;
//            }
//        }
//
//        if (frameIndex != -1) {
//            List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//            driver.switchTo().frame(frames.get(frameIndex)); // Переключаемся на фрейм с помощью элемента <iframe>
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
//            // Проверяем, что мы переключены на фрейм
//            WebElement frame = driver.findElement(By.xpath("//app-payment-container"));
//            wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//            By xpathSelector = By.xpath("//app-payment-container/app-header//div//span[1]");
//            wait.until(ExpectedConditions.presenceOfElementLocated(xpathSelector));
//            WebElement element = driver.findElement(xpathSelector);
//            frame.sendKeys("Тестовые данные" + inputSum);
//        } else {
//            System.out.println("Фрейм не найден");
//        }




        //app-payment-container/app-header//div//span[1]
//        driver.switchTo().frame(0);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//app-payment-container/app-header//div/span")));
//
//        WebElement frame = driver.findElement(By.xpath("//app-payment-container/app-header//div/span"));
//        frame.sendKeys("Тестовые данные" + inputSum);




//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'BYN')]"))); // Используйте правильный XPath для поиска элемента во фрейме
//        WebElement element = frame.findElement(By.xpath("//span[contains(text(), 'BYN')]")); // Ищите элемент в найденном фрейме
//        element.sendKeys("Тестовые данные" + inputSum);

//        WebElement cardNumberFiled = driver.findElement(By.xpath("//label[text()='Номер карты']"));
//        String cardNumber = cardNumberFiled.getAttribute("placeholder");
//        System.out.println("Надпись в незаполненном поле 'Номер карты' нового окна: " + cardNumberFiled);
//
//        WebElement validityFiled = driver.findElement(By.xpath("//input[@type='tel']"));
//        String validity = validityFiled.getAttribute("placeholder");
//        System.out.println("Надпись в незаполненном поле 'Срок действия' нового окна: " + validity);
//
//        WebElement cvcFiled = driver.findElement(By.xpath("//input[@name='verification_value']"));
//        String cvc = cvcFiled.getAttribute("placeholder");
//        System.out.println("Надпись в незаполненном поле 'CVC' нового окна: " + cvc);
//
//        WebElement nameHolderFiled = driver.findElement(By.xpath("//input[@autocomplete='cc-name']"));
//        String nameHolder = nameHolderFiled.getAttribute("placeholder");
//        System.out.println("Надпись в незаполненном поле 'Имя держателя (как на карте)' нового окна: " + nameHolder);
    }
}
//div[@class='app-wrapper__content']