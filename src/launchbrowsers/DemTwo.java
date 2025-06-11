package launchbrowsers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemTwo {
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
	
	/*@BeforeEach
	static void setup() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}

	@AfterEach
	static void tearDown() {
		driver.quit();
	}*/
	//@Disabled 
	@Test
	void googlet() throws InterruptedException {
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
	}
 
	@Test
void facebook() throws InterruptedException {
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
	}
}
