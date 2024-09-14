package udemy_1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Dropdown {

	// Dynamic Dropdown
	
	//  for practise -    https://rahulshettyacademy.com/dropdownsPractise/
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
        
        // Set Chrome preferences to block notifications
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
		
		// Launch Chrome Browser
		//WebDriver driver = new ChromeDriver();
				
		// Maximize Browser window
		driver.manage().window().maximize();
								
		// Open url : https://www.spicejet.com/
		driver.get("https://www.spicejet.com/");
		
		// To open dropdown - from
		driver.findElement(By.xpath("//div[text()='From']")).click();
		
	     // Xpath =   //div[text()='Agra']
		
		System.out.println("Selected option : "+driver.findElement(By.xpath("//div[text()='Agra']")).getText());
				

		// Xpath = //div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip']//div[text()='AGR']
		// Xpath = //div[test='BLR']
		
		driver.findElement(By.xpath("//div[text()='AGR']")).click();
        
        Thread.sleep(1000);
        
        // To open second dropdown - To
     	System.out.println("Second drop down click");
     	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement second_dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='To']")));
		
		second_dropdown.click();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].click();", second_dropdown);
		
				
		WebElement second_dropdown_option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='DEL']")));
		
		System.out.println("Selected option : "+second_dropdown_option.getText());
		
		second_dropdown_option.click();
		//System.out.println("Selected option : "+second_dropdown_option.getText());
		
		//js.executeScript("arguments[0].click();", second_dropdown_option);
		
		
		
		
	}

}

/*
 
 // Udemy code
  * 
  import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;



public class Dropdown {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("http://spicejet.com"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='BLR']")).click();

Thread.sleep(2000);

//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

}



}


 
 
 
 */

/*
 
 public class Dropdown {

	// Dynamic Dropdown
	
	public static void main(String[] args) throws InterruptedException {
		
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// Maximize Browser window
		driver.manage().window().maximize();
								
		// Open url : https://www.spicejet.com/
		driver.get("https://www.spicejet.com/");
		
		// To open dropdown - from
		driver.findElement(By.xpath("//div[text()='From']")).click();
		
	     // Xpath =   //div[text()='Agra']
		
		System.out.println("Selected option : "+driver.findElement(By.xpath("//div[text()='Agra']")).getText());
		
		
		
		

		// Xpath = //div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-z2wwpe r-utggzx r-atwnbb r-cfp7ip']//div[text()='AGR']
		// Xpath = //div[test='BLR']
		
		driver.findElement(By.xpath("//div[text()='AGR']")).click();
		
		 // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        // To open second dropdown - To
     	System.out.println("Second drop down click");
     	
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement second_dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='To']")));
		
		//second_dropdown.click();
		
		js.executeScript("arguments[0].click();", second_dropdown);
		
		 // Set implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		// Wait for the alert to be present
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Accept the alert
        alert.accept();
		
		
		
		WebElement second_dropdown_option = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='DEL']")));
		
		//second_dropdown_option.click();
		
		System.out.println("Selected option : "+second_dropdown_option.getText());
		
		
		js.executeScript("arguments[0].click();", second_dropdown_option);
		
		
		
		
	}

}
 
 */


/*
public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// Maximize Browser window
		driver.manage().window().maximize();
								
		// Open url : https://www.spicejet.com/
		driver.get("https://www.spicejet.com/");

		//
		WebElement element = driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div"
				+ "//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']"
				+ "//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"));
		element.click();
		
		//driver.findElement(By.xpath("//div[@class='r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-1aockid css-1dbjc4n']//*[name()='svg']")).click();
		
		for(int i=0 ; i <= 4 ; i++ )
		{
			driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-k8qxaj r-d9fdf6'] div:nth-child(1) div:nth-child(2) div:nth-child(3) svg")).click();
			
		}
		
		
		//driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73.r-1wn9b5e")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//WebElement done_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-k8qxaj r-d9fdf6']//div[text()='Done']")));
		//done_btn.click(); // Interact with the element
		
		
		//WebElement done_btn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-k8qxaj r-d9fdf6']//div//div[1]")));
		//done_btn.click(); // Interact with the element
		
		WebElement done_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-k8qxaj r-d9fdf6']//div//div[1]")));
		done_btn.click(); // Interact with the element
		
		
		
		
		
	}

}

*/



/*
 
 driver.findElement(By.id("divpaxinfo")).click();

   Thread.sleep(2000L);

 int i=1;

while(i<5)

{

driver.findElement(By.id("hrefIncAdt")).click();

i++;

}

   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

for(int i=1;i<5;i++)

{

driver.findElement(By.id("hrefIncAdt")).click();

}

driver.findElement(By.id("btnclosepaxoption")).click();

Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

Syste
 
 
 */




/*

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// Maximize Browser window
		driver.manage().window().maximize();
								
		// Open url : https://rahulshettyacademy.com/dropdownsPractise/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Dropdown with select tag
		WebElement static_dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
		// Using the Select class drop used select tag
		Select dropdown = new Select(static_dropdown);
		
		// select the dropdown option using index 
		dropdown.selectByIndex(3);
		System.out.println("Selected option : "+dropdown.getFirstSelectedOption().getText());
		
		// Implici wait 
		// Set implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// select using visible text
		dropdown.selectByVisibleText("AED");
		System.out.println("Selected option : "+dropdown.getFirstSelectedOption().getText());
		
		// select using value 
		dropdown.selectByValue("INR");
		System.out.println("Selected option : "+dropdown.getFirstSelectedOption().getText());
	
	
	}

}



*/