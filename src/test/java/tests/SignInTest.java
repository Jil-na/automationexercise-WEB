package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.SignInPage;

public class SignInTest extends BaseTest {
  @Test
  public void signIn() {
    SignInPage signInPage = new SignInPage(driver);
    signInPage.clickLogin();
    signInPage.enterEmail("jilnakn24@gmail.com");
    signInPage.enterPassword("123456");
    signInPage.clickLoginButton();

    // Wait for navigation to dashboard
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    wait.until(ExpectedConditions.urlToBe("https://auctioneer-umber.vercel.app/host/dashboard"));
    
    String currentUrl = driver.getCurrentUrl();
    String expectedUrl = "https://auctioneer-umber.vercel.app/host/dashboard";
    Assert.assertEquals(currentUrl, expectedUrl, "Test got failed");
  }
}