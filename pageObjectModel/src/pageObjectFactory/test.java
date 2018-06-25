package pageObjectFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		/*driver.findElement(By.id("email")).sendKeys("hhhh");
		driver.findElement(By.id("pass")).sendKeys("ff");
		
		//driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
		//driver.findElement(By.id("loginbutton")).click();
		 * 
		 */
		
		LoginPage lp = new LoginPage(driver);
		lp.emailbutton().sendKeys("abc@gmail.com");
		lp.passwordbutton().sendKeys("password");
		lp.loginbutton().click();
		driver.quit();
	}
	

}
