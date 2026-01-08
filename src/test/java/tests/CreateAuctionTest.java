package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CreateAuctionPage;

public class CreateAuctionTest extends BaseTest {
  @Test
  public void CreateAuction() {
	  
	  //object creation
	  CreateAuctionPage auctionCreate = new CreateAuctionPage(driver);

	  auctionCreate.enterName("Test1");
	  auctionCreate.enterBudget("5000");
	  auctionCreate.enterMiniBudInc("50");
	  
  }
}
