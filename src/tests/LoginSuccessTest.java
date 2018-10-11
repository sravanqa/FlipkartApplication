package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MainPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.AbstractPage;

public class LoginSuccessTest extends AbstractTestDriver{

		
	@Test
	public void loginSuccess() throws InterruptedException {
		
		MainPage onMainPage = new MainPage(driver);
		HomePage onHomePage=onMainPage.navigateHomePage().loginLink().fillLoginDetails("sravansan18@gmail.com","ssskmr18").submitLogin();
		onMainPage= onHomePage.logOut(); //edit text
	}
	
	
}
