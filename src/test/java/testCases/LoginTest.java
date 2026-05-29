package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.Basetest;
import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.MyaccountPage;

// mayujadhav@test.com
// mayu@29 
//1234567890
public class LoginTest extends Basetest{
	
	
	
	
    @Test
    public void verify_login() {
    	
    	logger.info("Logging into account ");
    	
    	try {
    		// home page 
    	HomePage hm = new HomePage(driver);
    	hm.myAccountB();
    	hm.loginb();
    	
    	// login page 
    	Loginpage lp = new Loginpage(driver);
    	lp.email(p.getProperty("Email"));
    	lp.password(p.getProperty("Password"));
    	lp.login();
    	
    	//My account page 
    	MyaccountPage mp=new MyaccountPage(driver);
    	boolean t=mp.validate_DashBoard();
    	Assert.assertEquals(t, true);
    	
    	
    	}
    	catch (Exception e) {
    		
    		logger.error("------ login has been failed -------");
    		Assert.fail();
    	}
    	
    	logger.info("test case finished ");
    	
    }
	
	
	
	
	
	
	
	
	
}
