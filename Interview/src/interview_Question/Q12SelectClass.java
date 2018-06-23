package interview_Question;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Q12SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// how to select a value from dropdown?
		/*by select method. 
		 * how many options are availabe 
		 * select by visible text, select by index and select by value. 
		 * 
		 */
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 
	 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
 
		
		Select oSelect = new Select(driver.findElement(By.id("continents")));
 
		// Step 4:) Select option 'Europe' (Use selectByIndex)
		oSelect.selectByVisibleText("Europe");
 
		// Using sleep command so that changes can be noticed
		Thread.sleep(2000);
 
		// Step 5: Select option 'Africa' now (Use selectByVisibleText)
		oSelect.selectByIndex(2);
		Thread.sleep(2000);
 
		// Step 6: Print all the options for the selected drop down and select one option of your choice
		// Get the size of the Select element
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
 
		// Setting up the loop to print all the options
		for(int i =0; i < iListSize ; i++){
			// Storing the value of the option	
			String sValue = oSelect.getOptions().get(i).getText();
			// Printing the stored value
			System.out.println(sValue);
			// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
			if(sValue.equals("Africa")){
				oSelect.selectByIndex(i);
				break;
				}
			}	    
		// Kill the browser
		driver.quit();
		}

	}


