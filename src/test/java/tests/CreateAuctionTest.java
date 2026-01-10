package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CreateAuctionPage;
import pages.SignInPage;

public class CreateAuctionTest extends BaseTest {
  
  @BeforeMethod
  public void loginBeforeAuction() {
    SignInPage signInPage = new SignInPage(driver);
    signInPage.clickLogin();
    signInPage.enterEmail("jilnakn24@gmail.com");
    signInPage.enterPassword("123456");
    signInPage.clickLoginButton();

    // Wait for navigation to dashboard
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.urlToBe("https://auctioneer-umber.vercel.app/host/dashboard"));
  }
  
  @Test
  public void CreateAuction() {
	  
	  //object creation
	  CreateAuctionPage auctionCreate = new CreateAuctionPage(driver);

      auctionCreate.createButtonfn();
	  
	  // Wait for form to be visible
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
	  
	  auctionCreate.enterName("Test1");
	  auctionCreate.enterBudget("5000");
	  auctionCreate.enterMiniBudInc("50");
	  auctionCreate.selectCurrency("INR");		
     auctionCreate.clickCreateAuctionButton();
	  
	  By auctionIdText = By.xpath("//*[contains(text(),'Auction ID')]");

	  String auctionText = driver.findElement(auctionIdText).getText();

	  Assert.assertFalse(auctionText.trim().equals("Auction ID:"),
        "Auction ID value is empty");

  }
}
