package interview_Question;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q5_WaitDriver {

	public static void main(String[] args) {
		Q5_WaitDriver wd = new Q5_WaitDriver();
		wd.implicitwait();
		wd.explicitWait();
		wd.fluentwait();
		
		// what are the wait available in selenium?
		/*there are two types of wait in selenium:
		 * static and dynamic
		 * static wait is 
		 * thread.sleep Which is not recommended. in case emergency or debugging purpose
		 * we can use this method.if you give 5 seconds, your page will pause for whole 5 seconds.  
		 * dynamic wait are
		 * implicit wail
		 * explicit wait
		 * fluent wait
		 * PageLoadTimeOut
		 * 
		 * 
		 *  implicit Wait: implicit wait is a global instance. every method will wait for this 
		 *  command before it throws time out exceptions. if we set for 30 seconds, every elements will 
		 *  wait maximum 30 seconds before throws any exceptions. but as soon as it find the element
		 *   it will move for the next code and will not wait until 30 seconds. the default value is
		 *   o second. 
	
		 * Explicit wait: explicit wait is local instance. it will wait for which command is made 
		 * for.if we set for 30 seconds, every elements will 
		 *  wait maximum 30 seconds before throws any exceptions. but as soon as it find the element
		 *   it will move for the next code and will not wait until 30 seconds. the default value is
		 *   o second. 
		 * fluent wait: fluent wait is mechanism of pulling. the element might load within 10 seconds, 
		 * 20 seconds or even more then that if we declare an explicit wait of 20 seconds.
		 * It will wait till the specified time before throwing an exception. In such scenarios,
		 *  the fluent wait is the ideal wait to use as this will try to find the element 
		 *  at different frequency until it finds it or the final timer runs out. 
	
		 * 
		 *  PageLoadTimeOut: wait until web page upload. 
		 * 
		 */
		
		
		}
	public void implicitwait() {
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mjmolla@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("faruq8205");
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]"));
		
		
	}
	public void explicitWait() {
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		WebElement guru99seleniumlink;
		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		guru99seleniumlink.click();
		}

	
public void fluentwait() {
	//protected WebDriver driver;
	
	System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	WebDriver driver = new FirefoxDriver();
	// launch Chrome and redirect it to the Base URL
	driver.get("http://demo.guru99.com/test/guru99home/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.contentEquals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
		}
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
			.withTimeout(30, TimeUnit.SECONDS) 			
			.pollingEvery(5, TimeUnit.SECONDS) 			
			.ignoring(NoSuchElementException.class);
	WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
	
		public WebElement apply(WebDriver driver ) {
			return driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
		}
	});
	//click on the selenium link
	clickseleniumlink.click();
	//close~ browser
	driver.close() ;
	}

}

