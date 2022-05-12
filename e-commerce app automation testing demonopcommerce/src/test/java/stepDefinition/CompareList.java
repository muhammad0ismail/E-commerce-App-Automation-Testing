package stepDefinition;

import Pages.CellPhonesPage;
import Pages.CompareListPage;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class CompareList {
    HomePage homePage=new HomePage(Hooks.driver);
    CellPhonesPage cellPhonesPage=new CellPhonesPage(Hooks.driver);
    CompareListPage compareListPage=new CompareListPage(Hooks.driver);
    @Given("user could add items to compare list")
    public void add_items_compareList() throws InterruptedException {
        homePage.compareList_button();
        cellPhonesPage.ClickCompareButton();
    }
    @When("user go to compare list")
    public void go_to_comparelist() throws InterruptedException {
        cellPhonesPage.goToCompareList();
    }
    @Then("user found the chosen items in compare list")
    public void founditems(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(CellPhonesPage.item1Number.contains(compareListPage.item1_Num_Name()));
        System.out.println(CellPhonesPage.item1Number);
        System.out.println(compareListPage.item1_Num_Name());
        softAssert.assertAll();
    }
}
