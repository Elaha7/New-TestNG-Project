package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Base;
import pageObj.ActitimeToggleButton;
import utilities.DriverUtility;


public class ActitimeToggleTest extends Base{
	
		ActitimeToggleButton actt;
		
		
		@BeforeTest
		public void lunchBrowser() {
			initializeDriver();
			logger.info("Broswer opened");
		}
		
	    @Test(priority = 1)
	    public void loginToAct() {
		  actt = new ActitimeToggleButton();
			
		  actt.loginToActitimeWeb("admin", "manager");
		  DriverUtility.screenShot();
		  actt.clickonToggleButton();
	      DriverUtility.wait(2000);
	      DriverUtility.screenShot();
	        
	  }
	  
	@Test(priority=2)
	    public void testMethod ()  {
	    	actt.clickonSaveButton();
	    	DriverUtility.wait(2000);
	    	DriverUtility.screenShot();
	    
	    	
	    }
	  
	   @AfterTest
		public void closeBrowser() {
		   tearDown();
			logger.info("Broswer Closed");
	   }		

	}
