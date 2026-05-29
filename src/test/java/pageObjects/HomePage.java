package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Basepage{
	
	
	
	public HomePage(WebDriver driver){
		super(driver);
		
		
	}
	
	@FindBy (xpath="//span[text()='My Account']") 
	WebElement myAccountDropDown;
	
	@FindBy (xpath="//a[text()='Register']")
	WebElement registerButton;
	
	@FindBy(xpath="(//a[text()='Login'])[1]")
	WebElement loginButton;
	
	
	
	public void myAccountB() {
		myAccountDropDown.click();
	}
	
	public void registerB() {
		registerButton.click();
	}
	
	public void loginb() {
		loginButton.click();
	}
	
	

}
