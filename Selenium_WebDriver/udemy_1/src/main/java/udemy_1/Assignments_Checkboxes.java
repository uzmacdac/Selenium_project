package udemy_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignments_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		//  https://rahulshettyacademy.com/AutomationPractice/
		//  https://rahulshettyacademy.com/angularpractice/
		
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// Javascript  
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Maximize Browser window
		driver.manage().window().maximize();
		
		
		// Open url :  https://rahulshettyacademy.com/AutomationPractice/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Click or check the first checkbox 
		WebElement checkbox_1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkbox_1.click();
		
		// verify it is checked
		if(checkbox_1.isSelected())
		{
			System.out.println("It's  successfully checked");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("It isn't successfully checked ");
			Assert.assertTrue(false);
		}
		
		// Time Delay
		Thread.sleep(5000);
		
		// Unchecked it 
		checkbox_1.click();
		
		// Verify that is not check
		if(!checkbox_1.isSelected())
		{
			System.out.println("It's  successfully unchecked");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("It isn't successfully unchecked ");
			Assert.assertTrue(false);
		}
		
		// Count the total checkboxes on the page
		int total_checkboxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size();
		System.out.println("Total Checkboxe : "+total_checkboxes);
		
		// dialog box will popup
		js.executeScript("alert('Total Checkboxe : "+total_checkboxes+"')");
		
		// switch to alert
		Alert alert = driver.switchTo().alert();
		
		// Time delay
		Thread.sleep(3000);
		
		// accept alert
		alert.accept();
		
		
		
	}

}
