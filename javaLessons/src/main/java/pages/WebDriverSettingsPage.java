package pages;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverSettingsPage {
    public static WebDriver driver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Zub\\Desktop\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test is starting");

        driver.get("https://www.wildberries.ru/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }

    @AfterAll
    public static void tearDown() {
        // Закрыть браузер после окончания тестов
        System.out.println("Test is closing");
        driver.quit();
    }
}

