package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
	
	@FindBy(xpath="//a[@href='https://www.flipkart.com/account/login?from=header']")
	private WebElement loginLink;

	
	public MainPage(WebDriver driver) {
		
		super(driver);
		pageLoad();
	}
	
	
	public LoginPage loginLink() {
		
		
		loginLink.click();
		//return new LoginPage(driver);
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
