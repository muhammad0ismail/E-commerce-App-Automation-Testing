package stepDefinition;

import Pages.HomePage;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class registration {
    RegistrationPage registrationPage=new RegistrationPage(Hooks.driver);;
    HomePage homePage=new HomePage(Hooks.driver);
    public static String email="testing@example.com ";
    String fierstName="username";
    String lastNmae="test";
    public static String password="P@ssw0rd";
    public static String company="Automation Company";


    @Given("user navigate to home page")
    public void navigate_home() {
        homePage.navigateToHomePage();
    }
    @And("user press registration link")
    public void clickRegis_link(){
        homePage.click_regis_link();
    }
    @When("user fills Personal Details with valid data and password")
    public void personal_info(){

        registrationPage.enter_valid_date(email,password,fierstName,lastNmae,company);

    }
    @And("user press on register button")
    public void press_register_button(){
        registrationPage.click_button();
    }
    @Then("user register successfully")
    public void register_successfully()  {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(registrationPage.successfullyMessage());
        softAssert.assertAll();
    }
}
