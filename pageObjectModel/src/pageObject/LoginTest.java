package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageObject.Loginpage;

public class LoginTest {

	
	@Test
	public void dologing() {
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		Loginpage lp = new Loginpage(driver);
		lp.email().sendKeys("mjmolla@gmail.com");
		lp.password().sendKeys("faruq8205");
		lp.login().click();
		
		}
		
	@Test
	public void Google() {
		
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}	
				
				
				
				
				
				
	

}
