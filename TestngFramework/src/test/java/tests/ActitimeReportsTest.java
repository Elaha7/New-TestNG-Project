package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.Base;
import pageObj.ActitimeReportsPage;
import utilities.DriverUtility;

public class ActitimeReportsTest extends Base{
	ActitimeReportsPage actr;
	
	
	@BeforeTest
	public void lunchBrowser() {
		initializeDriver();
		logger.info("Broswer opened");
	}
	
    @Test(priority = 1)
    public void loginMethod() {
	  actr = new ActitimeReportsPage();
		
	  actr.loginToActitime("admin", "manager");
      actr.clickonReports();
      DriverUtility.wait(2000);
      DriverUtility.screenShot();
      
      
  }
   @Test(priority=2)
    public void testMethod ()  {
    	actr.clickonMonthlyPerformance();
    	actr.seeReport();
    
    	
    }
  
   @AfterTest
	public void closeBrowser() {
	   tearDown();
		logger.info("Broswer Closed");
   }		

}
