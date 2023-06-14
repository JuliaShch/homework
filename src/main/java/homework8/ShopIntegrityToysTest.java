package homework8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopIntegrityToysTest extends BaseTest{
  @Test
  public void resultAddDollToCartTest(){
    ShopIntegrityToysPage shopIntegrityToysPage = PageFactory.createPage(ShopIntegrityToysPage.class, getDriver());
    shopIntegrityToysPage.openPage();
    shopIntegrityToysPage.discoverNewDolls();
    shopIntegrityToysPage.chooseTheDoll();
    shopIntegrityToysPage.addDollToCart();
    Assert.assertEquals(shopIntegrityToysPage.getDollNameFromCart(), "Pose Like an Egyptian Amirah Majeed Basic Doll",
        "Добавленной куклы нет в корзине");

  }
}
