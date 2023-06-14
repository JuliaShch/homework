package homework8;

import org.openqa.selenium.WebDriver;

public class PageFactory {

  public static <T extends BasePage> ShopIntegrityToysPage createPage(Class<ShopIntegrityToysPage> sentClass, WebDriver driver) {
    return org.openqa.selenium.support.PageFactory.initElements(driver, sentClass);
  }
}
