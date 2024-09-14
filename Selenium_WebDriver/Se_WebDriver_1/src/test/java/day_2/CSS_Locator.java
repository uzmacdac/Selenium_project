package day_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
  1) tag id   				 -> tag#id
  2) tag & Class   			 -> tag.className
  3) tag & attribute  		 -> tag[attribute = "value"]
  4) tag, Class & attribute  -> tag.className[attribute = "value"]
  
 */

public class CSS_Locator {

	public static void main(String[] args) {
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		
		
		// open Url https://www.tutorialspoint.com/index.htm
		//driver.get("https://www.tutorialspoint.com/index.htm");
		try 
		{
			driver.get("https://demo.nopcommerce.com/");
			
			// maximize the chromw window 
			driver.manage().window().maximize();
			
			// tag#id
			//driver.findElement(By.cssSelector("input#mobile-search-strings")).sendKeys("Java");
			//driver.findElement(By.cssSelector("#mobile-search-strings")).sendKeys("Java");
			
			// Create a WebDriverWait instance
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));// Wait for up to 30 seconds
			

            // Wait until the element is visible
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#small-searchterms"))); // Adjust locator as needed

			
			
			element.sendKeys("Java");
			element.sendKeys(Keys.RETURN);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
            // Close the browser
            driver.quit();
        }
		
	
		
		String msg = "Search Java successfully";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('" + msg + "');");

	}

}




/*
public class CSS_Locator {

	public static void main(String[] args) {
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		
		
		// open Url https://www.tutorialspoint.com/index.htm
		//driver.get("https://www.tutorialspoint.com/index.htm");
		try {
			// open Url https://www.tutorialspoint.com/index.htm
			driver.get("https://www.geeksforgeeks.org/courses?source=google&medium=cpc&device=c&keyword=geeksforgeeks&matchtype=e&campaignid=20039445781&adgroup=147845288105&gad_source=1&gclid=EAIaIQobChMI8M_3vIfHhwMV56VmAh0ZUgcAEAAYASAAEgKJw_D_BwE");
							
					
			// maximize the chromw window 
			driver.manage().window().maximize();
			
			// tag#id
			//driver.findElement(By.cssSelector("input#mobile-search-strings")).sendKeys("Java");
			//driver.findElement(By.cssSelector("#mobile-search-strings")).sendKeys("Java");
			
			
			
			//WebElement element = driver.findElement(By.cssSelector(null))
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
            // Close the browser
            driver.quit();
        }
		
	
		
		String msg = "Search Java successfully";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('" + msg + "');");

	}

}


*/