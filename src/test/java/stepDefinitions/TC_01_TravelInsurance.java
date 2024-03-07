package stepDefinitions;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePage;
import pageObjects.insuranceResultPage;
import pageObjects.travelDetailsPage;

public class TC_01_TravelInsurance {
	
	WebDriver driver;
   homePage hp=new homePage(BaseClass.getDriver());
   travelDetailsPage tp=new travelDetailsPage(BaseClass.getDriver());
   

@Given("User clicks on Travel Insurance")
public void user_clicks_on_travel_insurance() throws InterruptedException {
	BaseClass.getLogger().info("CLICKED ON TRAVEL INSURANCE.. ");
	driver = BaseClass.getDriver();
   hp.clickTravel();
  
  
}

@When("user filled an European country in destination details and click on next")
public void user_filled_an_european_country_in_destination_details_and_click_on_next() throws InterruptedException {
	BaseClass.getLogger().info("FILLED COUNTRY DETAILS.. ");
	tp.inputCountryName();
	
	tp.clickCountry();
	tp.clickNext();
   
}

@When("user filled trip date and click on next")
public void user_filled_trip_date_and_click_on_next() throws InterruptedException {
	BaseClass.getLogger().info("FILLED TRIP DATES.... ");	
	tp.selectDate();

}

@When("user filled {int} traveller and ages {int} and {int} and click next")
public void user_filled_traveller_and_ages_and_and_click_next(Integer int1, Integer int2, Integer int3) throws InterruptedException {
	
	BaseClass.getLogger().info("FILLED TRAVELLER DETAILS AGES.. ");
	
	tp.selectPeople();
	tp.selectAge1();
	
	tp.selectAge2();
	tp.clickNext();
}

@When("user filled medical fitness No")
public void user_filled_medical_fitness_no() throws InterruptedException {
	BaseClass.getLogger().info("FILLED MEDICAL FITNESS.. ");
	
	  tp.medicalCondition();  
}

@When("user provideds a valid phone number to get updates and click view plans")
public void user_provideds_a_valid_phone_number_to_get_updates_and_click_view_plans() throws InterruptedException {
	BaseClass.getLogger().info("FILLED PHONE NUMBER.. ");
	
	tp.mobileNumber();
	 
}

@When("user applied the sort by filter low to high")
public void user_applied_the_sort_by_filter_low_to_high() throws InterruptedException {
	BaseClass.getLogger().info("APPLIED FILTERS LOW TO HOGH.. ");
	insuranceResultPage rs=new insuranceResultPage(BaseClass.getDriver());
	rs.selectPlan();
	rs.sorting();
}

@Then("user see the lowest insurance policy details")
public void user_see_the_lowest_insurance_policy_details() throws IOException {
	BaseClass.getLogger().info("GET TOP 3 LOWEST INSURANCE COMPANY.. ");
	insuranceResultPage rs=new insuranceResultPage(BaseClass.getDriver());
	  rs.result();
}

}
