package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.carDetails;
import pageObjects.homePage;

public class TC_03_HealthInsurance {
	WebDriver driver;
	   homePage hp=new homePage(BaseClass.getDriver());
	   @Given("user policy bazar website")
	   public void user_policy_bazar_website() {
	      System.out.println("navigated to home page");
	   }

	   @When("user hovers to insuarance products")
	   public void user_hovers_to_insuarance_products() throws IOException {
		     hp.hoverHealth();

	   }

	   @Then("user can see menu list Items")
	   public void user_can_see_menu_list_items() {
		      System.out.println("ALL LIST PRINTED");

	   }
	}
