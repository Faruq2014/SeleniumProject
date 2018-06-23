package rose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

WebDriver driver;
public RediffLoginPage(WebDriver driver) {
	this.driver=driver;
}

  By username=By.xpath(".//*[@id='login1']");
  By Password=By.name("passwd");
  By go= By.name("proceed");


public WebElement userbutton() {
	return driver.findElement(username);
	
}
public WebElement passbutton() {
	return driver.findElement(Password);
}
public WebElement gobutton() {
	return driver.findElement(go);
}
}