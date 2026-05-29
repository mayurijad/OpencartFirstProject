package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends Basepage{
	

	public AccountRegistrationPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstnameInput;
	
	@FindBy(xpath="//input[@name='lastname']")
    WebElement lastnameInput;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailInput;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement telephoneInput;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordInput;
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement policyCheckbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmMessage;
	
	public void firstName(String fName) {
		firstnameInput.sendKeys(fName);
	}
	
	public void lastName(String lName) {
		lastnameInput.sendKeys(lName);
	}
	
	public void email(String eMail) {
		emailInput.sendKeys(eMail);
		
	}
	
	public void telephone(String phone) {
		telephoneInput.sendKeys(phone);
	}
	
	public void password(String pass) {
		passwordInput.sendKeys(pass);
	}
	
	public void confirmPassword(String Pass) {
		
		confirmPassword.sendKeys(Pass);
		
		
	}
	
	public void policy() {
		policyCheckbox.click();
	}
	
	public void continueB() {
		continueButton.click();
		
		// sol1: using javaScript 
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",continueButton);
//		
//		// sol2 : using Actions class
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(continueButton).click().perform();
		
		//sol3: using webDriverWait 
		
		//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement eb=mywait.until(ExpectedConditions.elementToBeClickable(continueButton));
		
		//eb.click();
	}
	
	
	
	public String successMessage() {
		
		try {
			return (confirmMessage.getText());
		}catch (Exception e) {
			return (e.getMessage());
		}
		
	}
	
}
