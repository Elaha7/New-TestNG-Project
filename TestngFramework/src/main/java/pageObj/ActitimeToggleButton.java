package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.DriverUtility;

public class ActitimeToggleButton extends Base{
	
	public ActitimeToggleButton() {
		PageFactory.initElements(driver, this);
		
	}

	
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement UserName;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement Password;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "(//div[@class='switcherBackground'])[1]")
	private WebElement ToggleButton;
	
	@FindBy(xpath = "//div[@id='FormModifiedDivButton']")
	private WebElement SaveButton;
	
	
	
	
	
	
	
	public void loginToActitimeWeb(String username, String pass) {
		UserName.sendKeys(username);
		Password.sendKeys(pass);
		LoginButton.click();
		DriverUtility.wait(2000);
        DriverUtility.screenShot();
	}
		
		
		
		public void clickonToggleButton() {
			ToggleButton.click();
	    	DriverUtility.wait(2000);
	        DriverUtility.screenShot();
			}
		
		
		public void clickonSaveButton() {
			SaveButton.click();
			DriverUtility.wait(2000);
	        DriverUtility.screenShot();
			}
		
    }
