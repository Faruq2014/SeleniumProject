package rose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RediffLoginTest {
	
	@Test
	public void dologintest() {
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage lp= new RediffLoginPage(driver);
		lp.userbutton().sendKeys("faruq");
		lp.passbutton().sendKeys("123");
		lp.gobutton().click();
		System.out.println("this is rediff test");
		driver.close();
		
		
	}
	@Test
	public void fblogin() {
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		FacebookLoginPage fb = new FacebookLoginPage(driver);
		fb.emailbttn().sendKeys("abc@gmail.com");
		fb.passbuttn().sendKeys("password");
		fb.logbttn().click();
		System.out.println("fb test");
		driver.quit();
		
		
	}

}
