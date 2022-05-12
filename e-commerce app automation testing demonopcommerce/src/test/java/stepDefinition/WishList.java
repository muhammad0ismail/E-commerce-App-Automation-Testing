package stepDefinition;

import Pages.HomePage;
import Pages.ItemPage;
import Pages.WishListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class WishList {
    HomePage homePage=new HomePage(Hooks.driver);
    ItemPage itemPage=new ItemPage(Hooks.driver);
    WishListPage wishListPage=new WishListPage(Hooks.driver);
    @Given("user press wishlist button on specific item")
    public void pressWishlistButton() throws InterruptedException {
        homePage.ClickWishlistButton();
        itemPage.clickOnWishlistButton();
    }
    @When("user click on wishlist link")
    public void pressWishlistLink() throws InterruptedException {
        itemPage.ClickWishlistlink();
    }
    @And("user count numbers of quantities")
    public void theCountOFQuantities() throws InterruptedException {
        wishListPage.findQuantities();
    }
}
