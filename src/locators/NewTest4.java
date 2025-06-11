package locators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest4 {
	WebDriver driver;
	
  @Test(description="Verify google application")
  public void textone() {
	  driver.get("https://www.google.com");
  }
  
  @Test(enabled=false,priority=2)
  public void texttwo() {
	  driver.get("https://www.facebook.com");
  }

  @Test(priority=1,enabled=true,description="Verify gmail application")
  public void textthree() {
	  driver.get("https://www.gmail.com");
  }
  
  @Test(description="Verify selenium application")
  public void textfour() {
	  driver.get("https://www.selenium.dev");
  }
  
  @Test(priority=0)
  public void textfive() {
	  driver.get("https://www.redmine.org");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
