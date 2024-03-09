package stepDefinitions;

import org.junit.Assert;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.homePage;

public class TC_04_login {
    @Given("User navigated to home Page")
    public void user_navigated_to_home_page() {
        homePage hp=new homePage(BaseClass.getDriver());
        hp.naviagteHome();
    }

    @When("user clicked on sign in button")
    public void user_clicked_on_sign_in_button() {
        homePage hp=new homePage(BaseClass.getDriver());
        hp.clickSignIn();
    }

    @When("user filled inavlid mobile number")
    public void user_filled_inavlid_mobile_number() {
        homePage hp=new homePage(BaseClass.getDriver());
        hp.mobileNo();
    }

    @Then("user can see error message Invalid number")
    public void user_can_see_error_message_invalid_number() {
    	homePage hp=new homePage(BaseClass.getDriver());
        String str=hp.errorMsgg();
        Assert.assertEquals(str,"Invalid number");
    }
    
    

}
