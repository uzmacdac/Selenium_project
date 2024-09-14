package udemy_1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// Javascript  
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Alert 
		
		
							
		// Maximize Browser window
		driver.manage().window().maximize();
											
		// Open url : https://rahulshettyacademy.com/dropdownsPractise/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']"));
		checkbox.click();
		
		String txt_chkbox ="";
		
		if(checkbox.isSelected())
		{
			txt_chkbox = driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_friendsandfamily']")).getText();
			
			System.out.println("Check box is selected : "+txt_chkbox);
			
			//js.executeScript("alert('"+txt_chkbox+"');");
			
			//Thread.sleep(5000);
			// Switch to the alert
	       // Alert alert = driver.switchTo().alert();
			
			// Accept the alert (click "OK")
           // alert.accept();
		}
		
		// Assert the element text
        Assert.assertEquals("Family and Friends", txt_chkbox);

        // Assert the element text
        //Assert.assertEquals("Family & Friends", txt_chkbox);
        
        // Count the number of checkboxes on the page
        List<WebElement> list_chkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total Checkboxes on the page : "+list_chkboxes.size());
        
        System.out.println("Text : "+txt_chkbox);
        
        // Create a formatted string for the alert
        String alertText = String.format("Text: %s\nTotal Checkboxes: %d", txt_chkbox, list_chkboxes.size());

        // Trigger the alert with the formatted text
        js.executeScript("alert(arguments[0]);", alertText);

        
        Thread.sleep(5000);
		// Switch to the alert
        Alert alert = driver.switchTo().alert();
		
		// Accept the alert (click "OK")
        alert.accept();
	}

}



/*
 
 public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// Javascript  
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Alert 
		
		
							
		// Maximize Browser window
		driver.manage().window().maximize();
											
		// Open url : https://rahulshettyacademy.com/dropdownsPractise/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']"));
		checkbox.click();
		
		String txt_chkbox ="";
		
		if(checkbox.isSelected())
		{
			txt_chkbox = driver.findElement(By.cssSelector("label[for='ctl00_mainContent_chk_friendsandfamily']")).getText();
			
			System.out.println("Check box is selected : "+txt_chkbox);
			
			//js.executeScript("alert('"+txt_chkbox+"');");
			
			//Thread.sleep(5000);
			// Switch to the alert
	       // Alert alert = driver.switchTo().alert();
			
			// Accept the alert (click "OK")
           // alert.accept();
		}
		
		// Assert the element text
        Assert.assertEquals("Family and Friends", txt_chkbox);

        // Assert the element text
        //Assert.assertEquals("Family & Friends", txt_chkbox);
        
        // Count the number of checkboxes on the page
        List<WebElement> list_chkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total Checkboxes on the page : "+list_chkboxes.size());
        
        System.out.println("Text : "+txt_chkbox);
        
        // Create a formatted string for the alert
        String alertText = String.format("Text: %s\nTotal Checkboxes: %d", txt_chkbox, list_chkboxes.size());

        // Trigger the alert with the formatted text
        js.executeScript("alert(arguments[0]);", alertText);

        
        Thread.sleep(5000);
		// Switch to the alert
        Alert alert = driver.switchTo().alert();
		
		// Accept the alert (click "OK")
        alert.accept();
	}

}

 
 */





/*
 // Udemy code
  System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("http://spicejet.com"); //URL in the browser

Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
 
 
 
 */
