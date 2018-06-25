package pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	
	/*By username=By.id("email");
	By Password = By.id("pass");
	By login = By.cssSelector("input[id^=u_0]");
	*/
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement Password;
	
	//@FindBy(By.cssSelector="input[id^=u_0]") find by css locator does not work.
	//driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
	//driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
	//driver.findElement(By.id("loginbutton")).click();
	
	@FindBy(xpath="//input[contains(@id,'u_0')]")
	WebElement login;
	
	
public WebElement emailbutton() {
return username ;
}
public WebElement passwordbutton() {
	return Password;
	
}
public WebElement loginbutton() {
	return login;
}
}
