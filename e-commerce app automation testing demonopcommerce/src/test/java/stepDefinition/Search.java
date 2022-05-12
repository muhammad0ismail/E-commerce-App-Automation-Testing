package stepDefinition;

import Pages.HomePage;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
    SearchPage searchPage=new SearchPage(Hooks.driver);
    HomePage homePage=new HomePage(Hooks.driver);
    @When("user press on search field")
    public void clickSearchField(){
        homePage.click_Search_field();
    }
    @And("^user search with Item name\"(.*?)\"")
    public void searchWithItemName(String itemName){

        homePage.Enter_item_Name(itemName);
    }
    @And("user press on search button")
    public void clickSearchButton(){
        homePage.clickSearchButton();
    }
    @Then("user could find relative result")
    public void find_results(){
        searchPage.results();



    }
}
