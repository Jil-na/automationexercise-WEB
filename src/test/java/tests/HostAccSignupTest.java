package tests;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HostAccSignupPage;

public class HostAccSignupTest extends BaseTest {
  @Test
  public void hostSignup() {
	  HostAccSignupPage signup=new HostAccSignupPage(driver);
	  
	  signup.clickSignup(); 
	  
	  signup.enterEmail("jilnakn24@gmail.com");
	  signup.enterPassword("123456");
	  signup.signupbutton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	  String currentUrl = driver.getCurrentUrl();
	  String expectedUrl ="https://auctioneer-umber.vercel.app/admin/dashboard";
	  Assert.assertEquals(currentUrl, expectedUrl, "Test got failed");
  }
}
