package config;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static constans.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class WebDriverSettings {
    public static WebDriver driver;

    @BeforeAll
    public static void setup() {
        String driverPath = "drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        System.out.println("Test is starting");

        driver.get("https://www.wildberries.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
    }

    @AfterAll
    public static void tearDown() {
        // Закрыть браузер после окончания тестов
        System.out.println("Test is closing");
        driver.quit();
    }
}

