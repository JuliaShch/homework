package homework8;

import java.util.logging.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopIntegrityToysPage extends BasePage {
  private final String pageUrl = "https://shop.integritytoys.com/";
  private final By clickDiscoverButton = By.xpath("//a[@id='s-e6e879d1-98c8-4213-b798-1b4483107aa8']");
  private final By clickChooseButton = By.xpath("//article[@data-test='card-262']");
  private final By clickAddToCartButton = By.id("form-action-addToCart");
  private final By itemIsPresent = By.xpath("//td[@class='cart-item-block cart-item-title']//a");

  public ShopIntegrityToysPage(WebDriver driver) {
    super(driver);
  }

  public ShopIntegrityToysPage openPage() {
    logger.log(Level.INFO, "Открываем главную страницу");
    BasePage.openSelectedPage(pageUrl);
    return this;
  }

  public ShopIntegrityToysPage discoverNewDolls() {
    logger.log(Level.INFO, "Смотрим новых кукол");
    driver.findElement(clickDiscoverButton).click();
    return this;
  }

  public ShopIntegrityToysPage chooseTheDoll() {
    logger.log(Level.INFO, "Выбираем куклу");
    driver.findElement(clickChooseButton).click();
    return this;
  }

  public ShopIntegrityToysPage addDollToCart() {
    logger.log(Level.INFO, "Добавляем куклу в корзину");
    driver.findElement(clickAddToCartButton).click();
    return this;
  }

  public String getDollNameFromCart() {
    return driver.findElement(itemIsPresent).getText();
  }
}
