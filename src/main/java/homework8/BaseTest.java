package homework8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends PageFactory {

  protected static WebDriver driver;

  @BeforeSuite()
  public void setup(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }

  @AfterSuite()
  public void tearDown() {
    driver.quit();
  }

  public static WebDriver getDriver() {
    return driver;
  }

}
