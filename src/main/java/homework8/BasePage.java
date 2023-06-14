package homework8;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

public class BasePage extends PageFactory {
  static WebDriver driver;
  public static Logger logger = Logger.getLogger(String.valueOf(BasePage.class));

  public BasePage(WebDriver driver) {
    WebDriverManager.chromedriver().setup();
    BasePage.driver = driver;
  }

  public static void openSelectedPage(String url) {
    driver.get(url);
  }
}
