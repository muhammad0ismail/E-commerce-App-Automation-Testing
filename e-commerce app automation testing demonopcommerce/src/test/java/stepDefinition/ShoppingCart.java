package stepDefinition;

import Pages.HomePage;
import Pages.ItemPage;
import Pages.ShoppingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class ShoppingCart {
    HomePage homePage=new HomePage(Hooks.driver);
    ItemPage itemPage=new ItemPage(Hooks.driver);
    ShoppingPage shoppingPage=new ShoppingPage(Hooks.driver);
    @Given("user could add items to shoppingCart")
    public void add_items_shoppingCart() throws InterruptedException {
        homePage.ClickAddShoppingButtonButton();

        itemPage.click_on_ShoppingCart_Button();
    }
    @When("user go to Shopping cart")
    public void go_to_shoppingCart() throws InterruptedException {
        itemPage.clickShoppingCartLink();
    }
    @Then("user found the chosen items in shoppingCart")
    public void count_choosen_items() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        System.out.println(HomePage.item1Number);
        System.out.println(HomePage.item2Number);
        softAssert.assertTrue(HomePage.item1Number.contains(shoppingPage.findItemsNum3Choosen()));
        softAssert.assertTrue(HomePage.item2Number.contains(shoppingPage.findItemsNum2Choosen()));
        softAssert.assertAll();
        Thread.sleep(3000);
    }
}
