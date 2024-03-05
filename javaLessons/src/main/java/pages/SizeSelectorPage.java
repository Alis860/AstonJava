package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constans.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class SizeSelectorPage {
    public static void selectSize(WebDriver driver, By sizePopup, By sizeButton) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICIT_WAIT));

        //выбирает первый доступный размер
        sizePopup = By.xpath("//div[@class='popup popup-list-of-sizes shown slideUp']");
        sizeButton = By.xpath("//div[@class='popup popup-list-of-sizes shown slideUp']//div//ul/li[1]");

        try {
            // Ожидание появления окна выбора размера
            wait.until(ExpectedConditions.visibilityOfElementLocated(sizePopup));

            // Если окно появилось, выбрать размер
            if (driver.findElements(sizePopup).size() > 0) {
                WebElement firstSizeButton = driver.findElement(sizeButton);
                firstSizeButton.click();
            }
        } catch (TimeoutException exception) {
            // Обработка исключения при отсутствии окна выбора размера
            System.out.println("Окно выбора размера не появилось");
        }
    }
}

