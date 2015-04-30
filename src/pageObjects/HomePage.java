package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage{
	
	@FindBy(xpath="//html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/ul/li[7]/a")
	public WebElement root;       
	
	
	@FindBy(xpath="html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/ul/li[7]/ul/li[10]/a")
	//@FindBy(xpath="//a[@class='no-border']")
	public WebElement subroot;               
	
	
	public HomePage(WebDriver driver) {
		
		super(driver);
		pageLoad();
	}
	
	
/*	public String username(){
		String str= driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[7]/a")).getText();
		System.out.println(str);
		return str;
	}
	
*/
	
	public MainPage logOut() throws InterruptedException {
		
		//  JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	     // js.executeScript("window.scrollBy(0,1400)", "");
	      Thread.sleep(3000);
	      Actions builder = new Actions(driver);
	      builder.moveToElement(root).build().perform();
	      subroot.click();
		  return PageFactory.initElements(driver,MainPage.class);
	}

}
