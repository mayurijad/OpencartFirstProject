package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.Basetest;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class AccountRegistrationTest extends Basetest

{
	
	@Test
	public void verify_account_registration() {
		logger.info("------------Started test --------------------");
		
		
		try {
		HomePage hm= new HomePage(driver);
		hm.myAccountB();
		hm.registerB();
		
		logger.info("----- login details entered");
		AccountRegistrationPage ac = new AccountRegistrationPage(driver);
		ac.firstName(randomeString());
		ac.lastName(randomeString());
		ac.email(randomeString()+"@gmail.com");
		ac.telephone(randomNumber());
		String an = randomNumbericAlpha();
		ac.password(an);
		ac.confirmPassword(an);
		ac.policy();
		ac.continueB();
		String msg=ac.successMessage();
		
		
		
		if (msg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}
		
		else {
			logger.error("----- test failed");
			logger.debug("debug logs");
			Assert.assertTrue(false);
		}
		
	} // try 
		
		catch (Exception e) {
		Assert.fail();
	}
		
		
		logger.info("----- test case finished ");
		
	}
	
	
	public String randomeString() {
		
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
		
		
	}
	
	public String randomNumber() {
		String generatedNumeric=RandomStringUtils.randomNumeric(10);
		return generatedNumeric;
	}
	
	public String randomNumbericAlpha() {
		String alpha=RandomStringUtils.randomAlphabetic(5);
		String numeric= RandomStringUtils.randomNumeric(5);
		return alpha+"@"+numeric;
	}

}
