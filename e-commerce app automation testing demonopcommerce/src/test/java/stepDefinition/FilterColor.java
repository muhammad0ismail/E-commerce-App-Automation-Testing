package stepDefinition;

import Pages.ApparelShoesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterColor {
    ApparelShoesPage apparelShoesPage=new ApparelShoesPage(Hooks.driver);
    @When("user choose the filteration color")
    public void selectColor() throws InterruptedException {
        apparelShoesPage.select_Gray_Color();

    }
    @Then("user found all items in the choosen color")
    public void item_Color() throws InterruptedException {
        apparelShoesPage.itemsColor();
    }
}
