package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAuctionPage {
	
	private WebDriver driver;
	
	//locators
	private By createButton= By.xpath("(//*[@data-sidebar='menu-button'])[2]");
	private By nameField = By.name("name");
	private By budgetField =By.name("startBudget");
	private By miniBidInc=By.name("minBidIncrement");
	
	 public CreateAuctionPage(WebDriver driver) {
	        this.driver = driver;}
	
	//methods
	public void createButtonfn()
	{
		driver.findElement(createButton).click();
	}
    //Enter name 
	public void enterName(String username)
	{
		driver.findElement(nameField).sendKeys(username);
	}
	//Enter Budget
	public void enterBudget(String budget)
	{
		driver.findElement(budgetField).clear();
		driver.findElement(budgetField).sendKeys("50000");
	}
	
	public void enterMiniBudInc(String bud)
	{
		 WebElement minBid = driver.findElement(miniBidInc);
	        minBid.clear();
	        minBid.sendKeys(bud);
}
}
