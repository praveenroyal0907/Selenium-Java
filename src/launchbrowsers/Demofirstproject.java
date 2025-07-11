package launchbrowsers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demofirstproject {
   static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		driver.quit();
	}

	@Test
	void test1() throws InterruptedException {
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
	}
    
	@Test
	void test2() throws InterruptedException {
		
		 driver.get("https://www.facebook.com");
		 
		 Thread.sleep(2000);
		
		 driver.navigate().refresh();
	}
	
	@Test
	void test3() {
		
		driver.get("https://www.amazon.com");
		
	}
	
	@Test
	void test4() {
		
		driver.get("https://www.selenium.com");
		
	}
	
	@Test
	void test5() {
		
		driver.get("https://www.flipkart.com");
	}
}
