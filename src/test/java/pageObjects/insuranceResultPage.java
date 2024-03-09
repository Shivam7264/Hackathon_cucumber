package pageObjects;

import java.io.IOException;
import java.time.Duration;
//import java.time.Duration;
//import java.util.ArrayList;
import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;
//import utilities.WriteData;

public class insuranceResultPage extends BasePage {
BaseClass base=new BaseClass();
	public insuranceResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Elements
	@FindBy(id = "studentTrip")//student plan radio button
	WebElement studentPlan;
	
	@FindBy(id = "Traveller_1")//student 1 
	WebElement student1;
	
	@FindBy(id = "Traveller_2")//student 2 
	WebElement student2;
	
	@FindBy(id = "feet")//trip duration dropdown
	WebElement tripDuration;
	
	@FindBy(xpath = "//button[text()='Apply']")//apply plan button
	WebElement applyPlan;
	
	@FindBy(xpath = "//p[text()='Sort by']")
	WebElement sortBy;//driver.findElement(By.xpath("//summary/p")).click();
	
	@FindBy(xpath = "(//input[@name='sort'])[2]")
	WebElement lowToHigh;
	
//	@FindBy(xpath = "//*[@class='quotesCard--insurerName']")//NAME OF INSURANCE COMPANY
//	List<WebElement> companyName;
//
//	@FindBy(xpath = "//*[@class='premiumPlanPrice']")//PRICE OF INSURANCE COMPANY
//	List<WebElement> price;
	
	@FindBy(className = "quotesCard--insurerName")//NAME OF INSURANCE COMPANY
	List<WebElement> companyName;

	@FindBy(className = "premiumPlanPrice")//PRICE OF INSURANCE COMPANY
	List<WebElement> price;
		
	
	// Action Methods
	public void selectPlan() throws InterruptedException {
//		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(studentPlan));
		base.clicker(studentPlan);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(student1));
		base.clicker(student1);
		wait.until(ExpectedConditions.visibilityOf(student2));
//		Thread.sleep(2000);
		base.clicker(student2);				
		Select select =new Select(tripDuration);		
		select.selectByIndex(1);	
		base.clicker(applyPlan);
	}
	
	public void sorting() throws InterruptedException {
		Thread.sleep(5000);
//		Wait<WebDriver> wait = new FluentWait<>(driver)
//			    .withTimeout(Duration.ofSeconds(20))
//			    .pollingEvery(Duration.ofMillis(5000));
		// wait.until(ExpectedConditions.elementToBeClickable(sortBy));
		 base.clicker(sortBy);
		// wait.until(ExpectedConditions.elementToBeClickable(lowToHigh));
		 base.clicker(lowToHigh);
		
	}
	
	public void result() throws IOException {
	
		for(int i=0;i<3;i++) {
			// ANSI escape code for red color
	        String redColor = "\u001B[31m";
			 // ANSI escape code for green color
	        String greenColor = "\u001B[32m";
	        // ANSI escape code for reset color
	        String resetColor = "\u001B[0m";
			String name=companyName.get(i).getText();
			String cost=price.get(i).getText();
			System.out.println(redColor+name+": "+greenColor+cost+resetColor);
				}
		
				}
			}
