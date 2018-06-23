package rose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	WebDriver driver;
	public FacebookLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
WebElement username;
@FindBy(id="pass")
WebElement password;
@FindBy(xpath="//input[starts-with(@id,'u_0')]")  
WebElement login;
public WebElement emailbttn() {
	return username;
}
public WebElement passbuttn() {
	return password;
}
public WebElement logbttn() {
	return login;
}
}
