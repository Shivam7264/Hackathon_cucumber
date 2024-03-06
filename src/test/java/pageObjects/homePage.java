package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.BaseClass;

public class homePage extends BasePage {
 BaseClass base=new BaseClass();
	public homePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	// Elements
	@FindBy(xpath = "//section/div[7]/a")//travel button
	WebElement travelInsurance;
	
	@FindBy(xpath = "//section/div[4]/a")//car button
	WebElement carInsurance;
	
	
	@FindBy(xpath = "//a[text()='Insurance Products ']")//insurance products . button
	WebElement healthInsurance;
	
	@FindBy(xpath = "//div[5]/div[2]/div/ul/li[2]//div[3]/ul/li//span")//health ins menu items list
	List<WebElement>  menuItems;
	
	@FindBy(xpath = "//*[@class='logo']")//home page icon
	WebElement  homePage;	
//	@FindBy(className = "logo")//home page icon
//	WebElement  homePage;
	
	@FindBy(xpath = "//a[text()='Sign in']")//sign in button
	WebElement  signin;
	
	@FindBy(xpath = "(//input[@type='number'])[2]")//input mobile number 
	WebElement  mobile;
	
	@FindBy(xpath = "(//*[@id=\"error-sign-in\"])[2]")//error message number 
	WebElement  err;
	
	@FindBy(xpath = "//*[@id=\"button-label\"]")//sign in with google button 
	WebElement  google;
	
//	@FindBy(id = "button-label")//sign in with google button 
	//WebElement  google;
	
	@FindBy(xpath = "//input[@type=\"email\"]")//sign in with google button 
	WebElement  gmail;
	
	@FindBy(xpath = "//span[text()='Next']")//sign in with google button 
	WebElement  gmailNext;
	
	@FindBy(xpath = "//span[text()='Next']")//sign in with google button 
	WebElement  gmailErr;
		
	// Action Methods
	public void clickTravel() {
		base.clicker(travelInsurance);
	}
	public void clickCar() {
		base.clicker(carInsurance);
	}
	
	
	public void hoverHealth() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(healthInsurance).perform();
		base.printList(menuItems);
	}
	
	public void naviagteHome() {
		base.clicker(homePage);
	}
		
		public void clickSignIn() {
			base.clicker(signin);
		}
		public void mobileNo() {
			mobile.sendKeys("0");
		}
		public String errorMsgg() {
			System.out.println(err.getText());
			return err.getText();
		}
		
			
}
