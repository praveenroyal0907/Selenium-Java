package locators;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest7 {
	WebDriver driver;
	
  @Test
  public void method1() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//input[@id=\'user_login\']")).sendKeys("vikram");
	  driver.findElement(By.xpath("//input[@id=\'user_pass\']")).sendKeys("khadi");
	  driver.findElement(By.xpath("//input[@id=\'rememberme\']")).click();
  }
  
  @Test(invocationCount=5)
  public void method2() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//input[@id=\'user_login\']")).sendKeys("leo");
	  driver.findElement(By.xpath("//input[@id=\'user_pass\']")).sendKeys("coolie");
	  driver.findElement(By.xpath("//input[@id=\'wp-submit\']")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
