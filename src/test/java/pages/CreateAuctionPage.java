package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAuctionPage {
	
	private WebDriver driver;
	
	//locators
	private By createButton= By.xpath("(//*[@data-sidebar='menu-button'])[2]");
	private By nameField = By.name("name");
	private By budgetField =By.name("startBudget");
	private By miniBidInc=By.name("minBidIncrement");
	private By currencyId = By.xpath("//select");
	private By createAuctionButton = By.xpath("//*[@type='submit']");
	
	 public CreateAuctionPage(WebDriver driver) {
	        this.driver = driver;}
	
	//methods
	public void createButtonfn()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(createButton));
		driver.findElement(createButton).click();
	}
    //Enter name 
	public void enterName(String username)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(nameField));
		driver.findElement(nameField).sendKeys(username);
	}
	//Enter Budget
	public void enterBudget(String budget)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(budgetField));
		driver.findElement(budgetField).clear();
		driver.findElement(budgetField).sendKeys(budget);
	}
	
	public void enterMiniBudInc(String bud)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(miniBidInc));
		WebElement minBid = driver.findElement(miniBidInc);
		minBid.clear();
		minBid.sendKeys(bud);
	}
	
	public void selectCurrency(String currencyvalue)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(currencyId));
		//WebElement currency = driver.findElement(currencyId);
	
	WebElement selectElement =
            wait.until(ExpectedConditions.presenceOfElementLocated(currencyId));
		Select select = new Select(selectElement);
		select.selectByValue(currencyvalue);
	}
	public void clickCreateAuctionButton()
	{
		driver.findElement(createAuctionButton).click();
	}
}
