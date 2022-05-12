package stepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class Login {  HomePage homePage=new HomePage(Hooks.driver);
    LoginPage loginPage=new LoginPage(Hooks.driver);
    @And("user press login link")
    public void click_login_link(){
        homePage.click_login_link();
    }
    @When("user enter valid Email and password")
    public void enter_valid_data(){
        loginPage.enter_valid_Email_Password(stepDefinition.registration.email,
                stepDefinition.registration.password);
    }
    @And("user click on login button")
    public void click_button(){
        loginPage.click_login_button();
    }

    @Then("user could login successfully and go to home page")
    public void userCouldLoginSuccessfullyAndGoToHomePage() {
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(Hooks.driver.findElement
                        (By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2"))
                .getText(),"Welcome to our store");
        softAssert.assertAll();
    }
}
