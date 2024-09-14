package udemy_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


 






public class LinkTest_Xpath {
  
  // Using Regular expression in cssSelector and XPath

	public static void main(String[] args) throws InterruptedException {
		
		// 1) Launch Chrome Browser
				WebDriver driver = new ChromeDriver();
						
				// 2) Open url : https://automationintesting.online/
				driver.get("https://automationintesting.online/");
				
				// 3) Maximize Browser window
				driver.manage().window().maximize();
				
				// Wait
				WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
				
				// Using XPath regular expression
				//WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, 'Name')]")));
					
				// send name using xpath
				//element_1.sendKeys("Harry Potter");
				
				
				// Using css selector regular expression
				WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder*='Name']")));
				
				// send name using xpath
				element_1.sendKeys("Harry Potter");
				
				
				// Using css selector regular expression
				//WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder*='Email']")));
				
				//element_2.sendKeys("Harry@gmail.com");

				// Using XPath regular expression
				WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, 'Email')]")));
				
				element_2.sendKeys("Harry@gmail.com");
		

		
		
		
		// closed expected Condition browser window but not locator window 
		//driver.close();
		
		// closed both expected condition and locator browser window
		//driver.quit();
						
		
	}

}



/*
 
  public class LinkTest_Xpath {
  
  // XPath

	public static void main(String[] args) throws InterruptedException {
		
		// 1) Launch Chrome Browser
				WebDriver driver = new ChromeDriver();
						
				// 2) Open url : https://automationintesting.online/
				driver.get("https://automationintesting.online/");
				
				// 3) Maximize Browser window
				driver.manage().window().maximize();
				
				// Wait
				WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
				
				// Using XPath
				WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
				
				// send name using xpath
				element_1.sendKeys("Harry Potter");
				
				// Using XPath
				//WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#email")));
						
				// send name using xpath
				//element_2.sendKeys("Harry@gmail.com");
				
				Thread.sleep(2000);				
				driver.findElement(By.id("email")).sendKeys("Harry@gamil.com");

				Thread.sleep(2000);
				driver.findElement(By.id("email")).clear();
				
				Thread.sleep(2000);
				driver.findElement(By.id("email")).sendKeys("HarryPotter@gamil.com");

		

		
		
		
		// closed expected Condition browser window but not locator window 
		//driver.close();
		
		// closed both expected condition and locator browser window
		//driver.quit();
						
		
	}

}

 
 */


/*
 
 public class LinkTest_Xpath {
  
  // XPath

	public static void main(String[] args) {
		
		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// 2) Open url : https://automationintesting.online/
		driver.get("https://automationintesting.online/");
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		// Wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// Using XPath
		WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h1")));
		
		String heading_txt = element_1.getText();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Heading text : "+heading_txt+"');");
		System.out.println("Heading Text : "+heading_txt);
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//
//		Js.executeScript(“alert(‘hello world’);”);
//		
		

		
		
		
		// closed expected Condition browser window but not locator window 
		//driver.close();
		
		// closed both expected condition and locator browser window
		//driver.quit();
						
		
	}

}

  
 */

/*
 
 public class LinkTest_Xpath {
  
  // XPath

	public static void main(String[] args) {
		
		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// 2) Open url : https://automationintesting.online/
		driver.get("https://automationintesting.online/");
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		// Wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// Using XPath
		WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
		
		// send name using xpath
		element_1.sendKeys("Harry Potter");
		
		// Using XPath
		WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#email")));
				
		// send name using xpath
		element_2.sendKeys("Harry@gmail.com");
		
		WebElement element_3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text'][2]")));
		
		element_3.clear();
		
		element_3.findElement(By.id("email")).sendKeys("Harrypotter@gamil.com");
		
		
		
		
		
		
		// closed expected Condition browser window but not locator window 
		//driver.close();
		
		// closed both expected condition and locator browser window
		//driver.quit();
						
		
	}

}
 
 */


/*
public class LinkTest_Xpath {

	// XPath
	public static void main(String[] args) {
		
		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// 2) Open url : https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		// Wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// XPath with single attribute
		//WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
		
		// send name using xpath
		//element_1.sendKeys("TShirts");
		
		
		// XPath with multiple attribute
		//WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='search'][@placeholder='Search']")));
				
		// send name using xpath
		//element_2.sendKeys("TShirts");
		
		
		// XPath with using 'and' operator here both attribute are true then only it locate the element on web page 
		//WebElement element_3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='search'and @placeholder='Search']")));
						
		// send name using xpath
		//element_3.sendKeys("TShirts");
		
		
		// XPath with using 'or' operator here anyone(atleast one ) attribute is true then only it locate the element on web page 
		//WebElement element_4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='search'or @placeholder='nothing']")));
								
		// send name using xpath
		//element_4.sendKeys("TShirts");
				
		
		// XPath with text() method - inner text
		//WebElement element_5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Featured']")));
										
		// send name using xpath
		//boolean displaySataus = element_5.isDisplayed();
		//System.out.println("Text Status : "+displaySataus);
		
		//String webText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Featured']"))).getText();
		//System.out.print("Text : "+webText);
		
		// XPath with text() method - inner text
		//WebElement element_6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='MacBook']")));
					
		//element_6.click();
		
		
		// XPath with contains() method 
		//WebElement element_7 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder, 'Sea')]")));
												
		// send name using xpath
		//element_7.sendKeys("TShirts");
		
		
		// XPath with starts-with() method 
		//WebElement element_8 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[starts-with(@placeholder, 'Sea')]")));
														
		// send name using xpath
		//element_8.sendKeys("TShirts");
		
		
		// Chained XPath 
		WebElement element_9 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='logo']/a/img")));
		
		// send name using xpath
		boolean imgSatus = element_9.isDisplayed();
		System.out.println("Image status : "+imgSatus);
		
		
		
		
		
		
		
		
		// closed expected Condition browser window but not locator window 
		//driver.close();
		
		// closed both expected condition and locator browser window
		//driver.quit();
				
				
		
		
		
		
	}

}
*/



/*
 
  public class LinkTest_Xpath {
  
  // XPath

	public static void main(String[] args) {
		
		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// 2) Open url : https://automationintesting.online/
		driver.get("https://automationintesting.online/");
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		// Wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// Using XPath
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
		
		// send name using xpath
		element.sendKeys("Harry Potter");
		
		// closed expected Condition browser window but not locator window 
		//driver.close();
		
		// closed both expected condition and locator browser window
		//driver.quit();
				
				
		
		
		
		
	}

}

 
 */




/*
public class LinkTest_Xpath {

	public static void main(String[] args) {
		
		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// 2) Open url : https://www.browserstack.com/guide/expectedconditions-in-selenium
		driver.get("https://www.browserstack.com/guide/expectedconditions-in-selenium");
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		// Wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// Using LinkText	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("locator"))).click();
		
		
		
		// closed expected Condition browser window but not locator window 
		//driver.close();
		
		// closed both expected condition and locator browser window
		//driver.quit();
				
				
		
		
		
		
	}

}
*/
