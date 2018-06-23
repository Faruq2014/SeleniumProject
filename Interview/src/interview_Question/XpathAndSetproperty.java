package interview_Question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAndSetproperty {

	public static void main(String[] args) {
 System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
 WebDriver driver =new FirefoxDriver();
 driver.get("https://www.facebook.com/");
 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mollajwel@yahoo.com");
 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("511fourmile");
 driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
// "//input[starts-with(@id,'u_0')]"
		


	}
}