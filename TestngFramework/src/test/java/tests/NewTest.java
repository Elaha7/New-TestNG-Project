package tests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Base;
import pageObj.ActitimeLoginPage;
import utilities.DriverUtility;


public class NewTest extends Base{
	ActitimeLoginPage act;
	
	
	@BeforeTest
	public void lunchBrowser() {
		initializeDriver();
		logger.info("Broswer opened");
	}
	
    @Test(priority = 1)
    public void testMethod() {
	  act = new ActitimeLoginPage();
		
	  act.singInToActitime("admin", "manager");
      act.clickonTasks();
      act.clickonReports();
      DriverUtility.wait(2000);
      DriverUtility.screenShot();
      act.clickonUsers();
      
  }
   @Test(priority=2)
    public void testMethod2 ()  {
    	act.clickonTimeTrack();
    	act.clickonToggleButton();
    	DriverUtility.wait(2000);
        DriverUtility.screenShot();
    
    	
    }
  
   @AfterTest
	public void closeBrowser() {
	   tearDown();
		logger.info("Broswer Closed");
   }		
}
