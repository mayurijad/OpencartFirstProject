package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Basepage{
	
	public Loginpage(WebDriver driver) {
		
		super(driver);
	}
	

	@FindBy (xpath="//input[@id='input-email']")
	WebElement emailInput;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement passInput;
	
	@FindBy (xpath="//input[@value='Login']")
	WebElement loginButton;
	
	
	
	
	public void email(String emailE) {
		emailInput.sendKeys(emailE);
	}
	
	public void password(String passwordP) {
		passInput.sendKeys(passwordP);
	}
	
	public void login() {
		loginButton.click();
	}
	
	

}
