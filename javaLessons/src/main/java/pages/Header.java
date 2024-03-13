package pages;

import static config.WebDriverSettings.driver;

import org.openqa.selenium.By;

public class Header {

  By basket = By.xpath("//a[@data-wba-header-name='Cart']");

  public void clickBasket() {
    driver.findElement(basket).click();
  }

}
