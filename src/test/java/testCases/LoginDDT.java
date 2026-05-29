

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.Basetest;
import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.MyaccountPage;
import utilities.DataProviders;


/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class LoginDDT extends Basetest
{

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email, String password, String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
		
		try {
	
		//Home page
			
			
		    HomePage hm = new HomePage(driver);
	    	hm.myAccountB();
	    	hm.loginb();
				
			//Login page
			
			
			Loginpage lp = new Loginpage(driver);
		    lp.email(email);
		    lp.password(password);
		    lp.login();
//	    	
	    	
	    
				 
			//My Account Page
//			MyAccountPage macc=new MyAccountPage(driver);
//			boolean targetPage=macc.isMyAccountPageExists();
			
			MyaccountPage mp=new MyaccountPage(driver);
	    	boolean t=mp.validate_DashBoard();
	    	//Assert.assertEquals(t, true);
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(t==true)
				{
					mp.logout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(t==true)
				{
					mp.logout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
	}
	
}








