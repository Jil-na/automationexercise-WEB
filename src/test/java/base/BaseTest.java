package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {
  
	protected WebDriver driver;
  @BeforeMethod
  public void setUp() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https:auctioneer-umber.vercel.app/");
	  
  }

  @AfterMethod
  public void tesrDown() {
	 // if(driver!=null)
		 // driver.quit();
  }

}
