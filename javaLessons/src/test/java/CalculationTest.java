import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {
    private AndroidDriver driver;

    @BeforeEach
    @DisplayName("Подключение capabilities для проверки функционала мобильного приложения")
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 4a API 33");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    @DisplayName("Тест на сложение")
    public void testAddition() {
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();

        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "12");
    }

    @Test
    @DisplayName("Тест на вычитание")
    public void testSubtraction() {
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_sub"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "6");
    }

    @Test
    @DisplayName("Тест на умножение")
    public void testMultiplication() {
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_mul"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "27");
    }

    @Test
    @DisplayName("Тест на деление")
    public void testDivision() {
        driver.findElement(By.id("com.google.android.calculator:id/digit_9"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/op_div"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3"))
                .click();
        driver.findElement(By.id("com.google.android.calculator:id/eq"))
                .click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        assertEquals(result, "3");
    }
}