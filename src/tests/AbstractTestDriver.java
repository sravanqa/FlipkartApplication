package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AbstractTestDriver {

	protected WebDriver driver;
	
	@BeforeTest
	
	public void startUpDriver() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver and Java\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver= new FirefoxDriver();
	}
	
	
	
	@AfterTest
	public void closeDriver() {
		
		//driver.close();
	}
	
}
