package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


//Abstract classasdfasfd
public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver) {
		
		this.driver= driver;
		
		
	}
	
	public WebDriver getDriver(){
		
		return driver;
	}
	
	
public void pageLoad(){
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	



public MainPage navigateHomePage() {
	driver.navigate().to("https://flipkart.com/");
	return PageFactory.initElements(driver, MainPage.class);
}

}
