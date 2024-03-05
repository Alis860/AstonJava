package com.aston.java.lesson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasketPage;
import pages.SizeSelectorPage;
import pages.WebDriverSettingsPage;

import java.time.Duration;

import static constans.Constant.TimeoutVariable.EXPLICIT_WAIT;

//Написать автотесты для сайта wildberries.ru, в ходе которых на главной странице несколько товаров кладется в корзину,
// затем осуществляется переход в корзину и происходят проверки на соответствие названия товаров, их количество, цен
// каждого товара в корзине и общей суммы товаров.

public class MainTest extends WebDriverSettingsPage {
    private By sizePopup;
    private By sizeButton;

    public MainTest() {
    }

    @Test
    @DisplayName("Выбор товаров и помещение их в корзину. Проверка на соответствие")
    public void testsMain() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        //Находит и нажимает на элемент product1. Ожидает появления окна выбора размера и выбирает размер с помощью
        // метода selectSize(). Если окно размера не появилось - сообщает об этом.
        WebElement product1 = driver.findElement(By.xpath("//main[@id='body-layout']//div[@id='mainContainer']//article[1]//div[@class='product-card__bottom-wrap']//p[3]/a"));
        product1.click();
        SizeSelectorPage.selectSize(driver, sizePopup, sizeButton);

        //Находит и нажимает на элемент product2. Ожидает появления окна выбора размера и выбирает размер с помощью
        // метода selectSize(). Если окно размера не появилось - сообщает об этом.
        WebElement product2 = driver.findElement(By.xpath("//main[@id='body-layout']//div[@id='mainContainer']//article[2]//div[@class='product-card__bottom-wrap']//p[3]/a"));
        product2.click();
        SizeSelectorPage.selectSize(driver, sizePopup, sizeButton);

        //Находит и нажимает на элемент basket
        WebElement basket = driver.findElement(By.xpath("//a[@data-wba-header-name='Cart']"));
        basket.click();

       //BasketPage basketPage = new BasketPage();
        BasketPage.checkBasket(driver);
    }
}
