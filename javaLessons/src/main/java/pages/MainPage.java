package pages;

import static config.WebDriverSettings.driver;

import org.openqa.selenium.By;

public class MainPage {
  private By product1 = By.xpath("//main[@id='body-layout']//div[@id='mainContainer']//article[1]//div[@class='product-card__bottom-wrap']//p[3]/a");
  private By product2 = By.xpath("//main[@id='body-layout']//div[@id='mainContainer']//article[2]//div[@class='product-card__bottom-wrap']//p[3]/a");

  public void clickProduct1() {
    driver.findElement(product1).click();
  }

  public void clickProduct2() {
    driver.findElement(product2).click();
  }
}
