package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends Basepage{
	
	public MyaccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement text;
	
	@FindBy (xpath="//div[@class='list-group']//a[text()='Logout']")
	WebElement logoutB;
	
	
	public void logout() {
		logoutB.click();
	}
	
    public boolean validate_DashBoard() {
		
		return text.isDisplayed();
		
	}

}
