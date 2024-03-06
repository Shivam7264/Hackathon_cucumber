package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.carDetails;
import pageObjects.homePage;

public class TC_02_CarInsurance {
	WebDriver driver;
	   homePage hp=new homePage(BaseClass.getDriver());
	   carDetails cp=new carDetails(BaseClass.getDriver());
	   
	   
	   @Given("User clicks on car Insurance")
	   public void user_clicks_on_car_insurance() throws InterruptedException {
		   BaseClass.getLogger().info("CLICKS ON CAR INSURANCE.. ");
	       hp.clickCar();
	   }

	   @When("user clicked do not know car number")
	   public void user_clicked_do_not_know_car_number() {
	      hp.noNumber();
	   }

	   @When("user choose city and city number")
	   public void user_choose_city_and_city_number() {
	       cp.chooseCity();
	       cp.chooseCityCode();
	   }

	  @When("user choose a Car Brand")
	   public void user_choose_a_car_brand() {
	      cp.chooseCarBrand();
	   }

	   @When("user choose a Car model")
	   public void user_choose_a_car_model() {
	      cp.chooseCarModel();
	   }

	   @When("user select fuel type as petrol")
	   public void user_select_fuel_type_as_petrol() {
	     cp.selectFuelType(); 
	   }

	   @When("user select a variant of car")
	   public void user_select_a_variant_of_car() {
	     cp.chooseCarVariant();
	   }

	   @Then("user filled all his details with invalid email")
	   public void user_filled_all_his_details_with_invalid_email() {
	   cp.fillDetails();
	   }

	   @Then("user can see the error message")
	   public void user_can_see_the_error_message() {
		   BaseClass.getLogger().info("CAN SEE ERROR MESSAGE.. ");
	      cp.getErrorMsg();
	   }
}
