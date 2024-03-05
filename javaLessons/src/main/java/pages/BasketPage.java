package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static constans.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class BasketPage {
    private WebDriver driver;

    public static void checkBasket(WebDriver driver) {

        By productNameSelector = By.xpath("//div[@class='list-item__good-info good-info']");
        By productQuantitySelector = By.xpath("//input[@type='number']");
        By productPriceSelector = By.xpath("//div[@class='list-item__price-new wallet']");

        By totalPriceSelector = By.xpath("//span[@class='b-right']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT));

        List<WebElement> productNames = driver.findElements(productNameSelector);
        List<WebElement> productQuantities = driver.findElements(productQuantitySelector);
        List<WebElement> productPrices = driver.findElements(productPriceSelector);
        WebElement totalPriceElement = driver.findElement(totalPriceSelector);

// Проверка количества товаров в корзине
        int actualItemCount = productNames.size();
        Assertions.assertTrue(actualItemCount > 0, "Корзина пуста");
        System.out.println("Проверка наличия товаров в корзине пройдена");

// Проверка соответствия типу данных и значений количества товаров
        List<Integer> actualProductQuantities = new ArrayList<>();
        for (WebElement quantityElement : productQuantities) {
            int quantity = Integer.parseInt(quantityElement.getAttribute("value"));
            Assertions.assertTrue(quantity > 0, "Некорректное количество товара");
            actualProductQuantities.add(quantity);
            System.out.println("Проверка соответствия количества товара пройдена");
        }

// Проверка соответствия типу данных и значений цен товаров
        List<Double> actualProductPrices = new ArrayList<>();
        for (WebElement priceElement : productPrices) {
            double price = Double.parseDouble(priceElement.getText().replaceAll("[^0-9.,]+", "").replace(",", "."));
            Assertions.assertTrue(price > 0, "Некорректная цена товара");
            actualProductPrices.add(price);
            System.out.println("Проверка соответствия цены товара пройдена");
        }

// Проверка общей суммы товаров
        double expectedTotalPrice = actualProductPrices.stream().mapToDouble(Double::doubleValue).sum();
        double actualTotalPrice = Double.parseDouble(totalPriceElement.getText().replaceAll("[^0-9.,]+", "").replace(",", "."));
        Assertions.assertEquals(expectedTotalPrice, actualTotalPrice, 0.01, "Несоответствие общей суммы товаров");
        System.out.println("Проверка общей суммы товаров пройдена");
    }


}