package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HostAccSignupPage {
	
	private WebDriver driver;
	
	   
	//locators
	private By hostSignup = By.xpath("(//a[@href='/admin/signup'])[2]");
	private By emailId = By.name("email");
	private By passwordId = By.name("password");
	private By submitId = By.xpath("//*[@type='submit']");
	
	 public HostAccSignupPage(WebDriver driver) {
	        this.driver = driver;}
	
	//methods
	
	public void clickSignup()
	{
		driver.findElement(hostSignup).click();
	}
	//enter emailid for the registration
	public void enterEmail(String useremailid)
	{
		driver.findElement(emailId).sendKeys(useremailid);
	}
	//enter password
	public void enterPassword(String userpassword)
	{
		driver.findElement(passwordId).sendKeys(userpassword);
	}
	//Click the signup button for acc creation
	public void signupbutton()
	{
		driver.findElement(submitId).click();
	}
	
	

}
