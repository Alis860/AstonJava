package com.aston.java.lesson;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasketPage;
import pages.Header;
import pages.MainPage;
import pages.SizeSelectorPage;
import config.WebDriverSettings;

import java.time.Duration;

import static constans.Constant.TimeoutVariable.EXPLICIT_WAIT;

//Написать автотесты для сайта wildberries.ru, в ходе которых на главной странице несколько товаров кладется в корзину,
// затем осуществляется переход в корзину и происходят проверки на соответствие названия товаров, их количество, цен
// каждого товара в корзине и общей суммы товаров.

public class MainTest extends WebDriverSettings {
    private By sizePopup;
    private By sizeButton;

    public MainTest() {
    }

    MainPage mainPage = new MainPage();
    SizeSelectorPage sizeSelectorPage = new SizeSelectorPage();
    Header header = new Header();
    BasketPage basketPage = new BasketPage();


    @Test
    @DisplayName("Выбор товаров и помещение их в корзину. Проверка на соответствие")
    public void testsMain() {
        mainPage.clickProduct1();
        sizeSelectorPage.selectSize();
        mainPage.clickProduct2();
        sizeSelectorPage.selectSize();
        header.clickBasket();
        basketPage.checkBasket();
    }
}
