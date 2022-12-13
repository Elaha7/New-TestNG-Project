package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class ActitimeLoginPage extends Base{
	
	public ActitimeLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement userName;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement TasksButton;
	
	@FindBy(xpath = "//div[@id='container_reports']")
	private WebElement ReportsButton;
	
	@FindBy(xpath = "//div[@id='container_users']")
	private WebElement UsersButton;
	
	@FindBy(xpath = "//div[@id='container_tt']")
	private WebElement TimeTrackButton;
	
	
	@FindBy(xpath = "(//div[@class='switcherBackground'])[1]")
	private WebElement ToggleButton;
	
	
	
	

	public void singInToActitime(String username, String pass) {
		userName.sendKeys(username);
		password.sendKeys(pass);
		loginBtn.click();
	}
		
		public void clickonTasks() {
			TasksButton.click();
			}
		
		public void clickonReports() {
			ReportsButton.click();
			}
		
		public void clickonUsers() {
			UsersButton.click();
			}
		
		
		public void clickonTimeTrack() {
			TimeTrackButton.click();
			}
		
		public void clickonToggleButton() {
			ToggleButton.click();
			}
	}
