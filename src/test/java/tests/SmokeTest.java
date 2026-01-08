package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class SmokeTest extends BaseTest {
  @Test
  public void urlValidate() {
	  String current_url = driver.getCurrentUrl();
	  System.out.println("Current Url : "+current_url);
	  
	  Assert.assertTrue(current_url.contains("auctioneer"),"url is not loaded sucessfully");
	  
	  
  }
}
