package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Seleniumlocators {
      static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	/*@Test
	void idnameclassname() throws InterruptedException {
		
		driver.get("https://www.techlearn.in/admin");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("user_login")).sendKeys("praveen");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("pwd")).sendKeys("P.royal");
		Thread.sleep(1000);
		
		driver.findElement(By.name("rememberme")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("wp-login-lost-password")).click();
		Thread.sleep(1000);
		
	}*/

	/*@Test
	void cssselector() throws InterruptedException {
		
		driver.get("https://www.techlearn.in/admin");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#user_login")).sendKeys("nirmala");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input#user_login")).sendKeys("nirmala");
		Thread.sleep(1000);
		
		driver.findElement(By.id("user_pass")).sendKeys("Test");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".wp-login-lost-password")).click();
		Thread.sleep(1000);
		
	}*/
   
	/*@Test
	void linktextandpartiallinktext() throws InterruptedException {
		
		driver.get("https://www.techlearn.in/admin");
		
		Thread.sleep(1000);*/
		
		//driver.findElement(By.linkText("Lost your password?")).click();
	
		
		/*driver.findElement(By.partialLinkText("Lost")).click();
		
		}*/
@Disabled
	@Test
	void webelement() throws InterruptedException {
		
		driver.get("https://www.techlearn.in/admin");
		
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.id("user_login"));
		username.sendKeys("Naveen");
	Thread.sleep(1000);
		
		WebElement username1 = driver.findElement(By.id("user_login"));
		username1.clear();
		
		WebElement username2 = driver.findElement(By.id("user_login"));
		username2.sendKeys("Srinivas");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("ABC");
		
		WebElement checkbox = driver.findElement(By.name("rememberme"));
		checkbox.click();
		
		}
	
@Disabled
	@Test
	void tagname() throws InterruptedException {
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(1000);
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		
		System.out.println(totallinks.size());
		
		System.out.println("Total links on Flipkart website"+totallinks.size());
		
		}


  @Test
  void tagname1() throws InterruptedException {
	
	driver.get("https://www.amazon.com");
	
	Thread.sleep(2000);	
	
	List<WebElement> totallinks = driver.findElements(By.tagName("a"));
	
	System.out.println(totallinks.size());
	
	System.out.println("Total links on Amazon website"+totallinks.size());
}
}

