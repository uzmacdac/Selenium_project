package udemy_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// Javascript  
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		// Alert 
													
		// Maximize Browser window
		driver.manage().window().maximize();
													
		// Open url : https://rahulshettyacademy.com/AutomationPractice/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Enter name in the input using xpath : //input[@id='name'  and @placeholder='Enter Your Name']
		WebElement name = driver.findElement(By.xpath("//input[@id='name'  and @placeholder='Enter Your Name']"));
		name.sendKeys("Priyanka");
		
		// Timw delay
		Thread.sleep(3000);
		
		// Click on Alert button 
		WebElement alert_btn = driver.findElement(By.id("alertbtn"));
		alert_btn.click();
		
		// switch  browser control to alert 
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert text : "+alert.getText());
		
		// Timw delay
		Thread.sleep(3000);
		
		// Accepting the alert
		alert.accept();
		
		// Time delay
		Thread.sleep(3000);
		
		// Confirmation alert using xpath  : //input[@id='confirmbtn'  and @value='Confirm']
		WebElement  confirmation_alert = driver.findElement(By.xpath("//input[@id='confirmbtn'  and @value='Confirm']"));
		confirmation_alert.click();
		
		System.out.println("Alert text : "+alert.getText());
		
		// Time delay
		Thread.sleep(3000);
		
		// Clcik ok on confirmation alert dialog box
		//alert.accept();
		
		// Clcik ok on confirmation alert dialog box
		alert.dismiss();
		
		
		
		
	}

}
