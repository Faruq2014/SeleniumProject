package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	
public Loginpage(WebDriver driver) {
	this.driver=driver;
	
}
	WebDriver driver;
	By username=By.id("email");
	By Password = By.id("pass");
	By login = By.cssSelector("input[id^=u_0]");
	
	
public WebElement email() {
return driver.findElement(username);
}
public WebElement password() {
	return driver.findElement(Password);
	
}
public WebElement login() {
	return driver.findElement(login);
}
}
