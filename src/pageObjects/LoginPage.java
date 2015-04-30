package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends AbstractPage {
	
	@FindBy (id= "login_email_id")
	public WebElement username;
	
	@FindBy (id= "login_password")
	public WebElement password;
	
	@FindBy (xpath= "//input[@class='btn btn-blue']")
	public WebElement submitBtn;
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		pageLoad();
	}
	
	
public LoginPage fillLoginDetails(String email, String passwordData){
		
		username.sendKeys(email);
		password.sendKeys(passwordData);
		
		return PageFactory.initElements(driver, LoginPage.class);
		
	}


public HomePage submitLogin() {
	
	submitBtn.click();
	return PageFactory.initElements(driver, HomePage.class);
}
	
}
