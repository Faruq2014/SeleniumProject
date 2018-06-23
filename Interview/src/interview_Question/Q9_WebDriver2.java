package interview_Question;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q9_WebDriver2 {

	public static void main(String[] args) {
		// how to refresh web browser or how many ways you can refresh your web browser?
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mollajwel@yahoo.com");
		driver.navigate().refresh();
		//driver.get("https://www.facebook.com/"); will refresh you page. 
		//driver.navigate().to(driver.getCurrentUrl()); this another method to refresh web page. 
		//driver.findElement(By.id("email")).sendKeys(Keys.F5);
		//driver.findElement(By.xpath("https://www.facebook.com/")).sendKeys(Keys.F5);
		
		 //what is the difference between driver.findElement(arg0); and driver.findElements(arg0); 
		//driver.findElement(arg0); will return single web element. the first element find on the web page. 
		//driver.findElements(arg0); will return multiple elements. 
		//driver.findElement(By.id("email")).sendKeys("asgghhhh");
		String st=driver.findElement(By.id("email")).getAttribute("type");
		System.out.println(st);
		
		 driver.findElements(By.tagName("a"));
		 List<WebElement> list=driver.findElements(By.tagName("a"));
		 System.out.println("total number of tag name is "+" "+list.size());
		 // with this above command we can find out how many links, images,text box in the web page.
		// driver.findElements(By.id("email")). can not perform any actions like send or click etc. 
		 
		// how to find whether an element is displayed on the web page or not?
		 List<WebElement> dynamicElement = driver.findElements(By.id("email"));
		 if(dynamicElement.size() != 0){
		 	//If list size is non-zero, element is present
		 	System.out.println("Element present");
		 }
		 else{
		 	//Else if size is 0, then element is not present
		 	System.out.println("Element not present");
		 	
		 	/*// how to find more than one elements in the list. 
		 	driver.findElements(By.tagName("a"));
			 List<WebElement> elist=driver.findElements(By.tagName("a"));
			 int listSize=elist.size();
			 for (int i=0; i<elist.size(); i++) {
				 elist.get(i).click();
				 System.out.println("total number of tag name is "+" "+list.size());
			 }*/
			

		 }
		 
		 
		 
		
		
		

	}

}
