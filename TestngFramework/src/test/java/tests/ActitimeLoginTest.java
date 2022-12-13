package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import core.Base;
import pageObj.ActitimeLoginPage;
import utilities.DriverUtility;

public class ActitimeLoginTest extends Base{
	
	ActitimeLoginPage acti;
	
	@BeforeMethod
	public void beforeMethod() {
		initializeDriver();
		logger.info("Broswer opened successfully");
	}

	@AfterMethod
	public void afterMethod() {
		tearDown();
		logger.info("Broswer Closed");
	}
	
	
	  @Test(enabled = true)
	
	  @Parameters({ "userName", "password" })
	 
	
	
	public void loginToHotelTestOne(@Optional("admin")String userName, @Optional("manager")String password) throws InterruptedException {
		acti = new ActitimeLoginPage();
		
		acti.singInToActitime(userName, password);
        acti.clickonTasks();
        acti.clickonReports();
        DriverUtility.scrollPageDownWithJS();
        Thread.sleep(2000);
        DriverUtility.screenShot();
        Thread.sleep(2000);
    
        
        
	}

}
