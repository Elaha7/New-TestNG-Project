package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class ActitimeReportsPage extends Base{
	
	public ActitimeReportsPage() {
		PageFactory.initElements(driver, this);
		
	}

	
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement UserName;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement Password;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//div[@id='container_reports']")
	private WebElement ReportsTab;
	
	@FindBy(xpath = "//div[text()=\"Monthly Company's Performance Report\"]")
	private WebElement MonthlyCompanyPer;
	
	
	
	
	
	
	
	public void loginToActitime(String username, String pass) {
		UserName.sendKeys(username);
		Password.sendKeys(pass);
		LoginButton.click();
	}
		
		public void clickonReports() {
			ReportsTab.click();
			}
		
		
		public void clickonMonthlyPerformance() {
			MonthlyCompanyPer.click();
			}
		
		
		public void seeReport() {
			DriverUtility.wait(2000);
	        DriverUtility.screenShot();
			}

	
}