package udemy_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;


class TestResultPopup {

    public static void showPopup(String message, boolean isSuccess) {
        JOptionPane.showMessageDialog(null, message, 
                                      isSuccess ? "Test Passed" : "Test Failed",
                                      isSuccess ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
    }
}


public class Calendar {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// TestResultPopup object
		TestResultPopup obj_TestResultPopup = new TestResultPopup();
		
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// Javascript  
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Robot Class to accept the dialog
		Robot robot = new Robot();
		
		// Maximize Browser window
		driver.manage().window().maximize();
											
		// Open url : https://rahulshettyacademy.com/dropdownsPractise/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Click on Departure City input to open the dropdown
		WebElement departure_city = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		departure_city.click();
		
		// Select the city 
		WebElement from_departure_city =  driver.findElement(By.xpath("//a[@value='BLR']"));
		String departure_city_name = from_departure_city.getText();
		from_departure_city.click();
		
		// Check Departure city is selected
		if(from_departure_city.isSelected())
		{
			System.out.println("Departure City : "+departure_city_name);
		}
		
		// Time Delay
		Thread.sleep(2000);
		
		// Arrival or Destination city 
		//WebElement arrival_city = driver.findElement(By.xpath("(//a[@value='MAA'])[2]"));
		// OR
		WebElement arrival_city = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"));
		String arrival_city_name = arrival_city.getText();
		arrival_city.click();
		
		// Check Departure city is selected
		if(arrival_city.isSelected())
		{
			System.out.println("Departure City : "+arrival_city_name);
		}

		// Calender get the today's date : //td[contains(@class,'ui-datepicker-today')]
		WebElement today_date = driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]"));
		String today_date_txt = today_date.getText();
		today_date.click();
		
		// Time Delay
		Thread.sleep(2000);
		
		try 
		{
			// Check today date is 8
			Assert.assertEquals(today_date_txt, "8", "Text does not match");
			
			 // If assertion passes, show a success popup
			obj_TestResultPopup.showPopup("Test passed successfully.", true);
			
			// Time delay
			Thread.sleep(3000);
			
			// Pressing Enter Key 
			robot.keyPress(KeyEvent.VK_ENTER);
			// Release Enter Key 
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
			System.out.println("Dialog box accepted ");
			
			// Time Delay
			Thread.sleep(2000);
			
			// Check today date is 8
			//Assert.assertEquals(today_date_txt, "10", "Text does not match");
			
		}
		catch(Exception e)
		{
			 // If assertion passes, show a success popup
			obj_TestResultPopup.showPopup("Test failed: " + e.getMessage(), false);
		}
		
		// Delay
		Thread.sleep(5000);
		
		// Click on diable calender 
		WebElement disable_calender = driver.findElement(By.xpath("//div[@id='Div1']//button[@type='button']"));
		System.out.println("Calender in One Way enable or diable : "+disable_calender.isEnabled());
		
		// print :- Style : display: block; opacity: 0.5;
		System.out.println("Style : "+driver.findElement(By.id("Div1")).getAttribute("style"));
		
		// click on Round Trip 
		WebElement round_trip = driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_1"));
		round_trip.click();
		
		
		// print :- Style : display: block; opacity: 1;
		System.out.println("Style : "+driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It's Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

}


/*
 class TestResultPopup {

    public static void showPopup(String message, boolean isSuccess) {
        JOptionPane.showMessageDialog(null, message, 
                                      isSuccess ? "Test Passed" : "Test Failed",
                                      isSuccess ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
    }
}


public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		// TestResultPopup object
		TestResultPopup obj_TestResultPopup = new TestResultPopup();
		
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// Javascript  
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Maximize Browser window
		driver.manage().window().maximize();
											
		// Open url : https://rahulshettyacademy.com/dropdownsPractise/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Click on Departure City input to open the dropdown
		WebElement departure_city = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		departure_city.click();
		
		// Select the city 
		WebElement from_departure_city =  driver.findElement(By.xpath("//a[@value='BLR']"));
		String departure_city_name = from_departure_city.getText();
		from_departure_city.click();
		
		// Check Departure city is selected
		if(from_departure_city.isSelected())
		{
			System.out.println("Departure City : "+departure_city_name);
		}
		
		// Time Delay
		Thread.sleep(2000);
		
		// Arrival or Destination city 
		//WebElement arrival_city = driver.findElement(By.xpath("(//a[@value='MAA'])[2]"));
		// OR
		WebElement arrival_city = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"));
		String arrival_city_name = arrival_city.getText();
		arrival_city.click();
		
		// Check Departure city is selected
		if(arrival_city.isSelected())
		{
			System.out.println("Departure City : "+arrival_city_name);
		}

		// Calender get the today's date : //td[contains(@class,'ui-datepicker-today')]
		WebElement today_date = driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]"));
		String today_date_txt = today_date.getText();
		today_date.click();
		
		// Time Delay
		Thread.sleep(2000);
		
		try 
		{
			// Check today date is 8
			Assert.assertEquals(today_date_txt, "8", "Text does not match");
			
			 // If assertion passes, show a success popup
			obj_TestResultPopup.showPopup("Test passed successfully.", true);
			
			// Time Delay
			Thread.sleep(2000);
			
			// Check today date is 8
			Assert.assertEquals(today_date_txt, "10", "Text does not match");
			
		}
		catch(Exception e)
		{
			 // If assertion passes, show a success popup
			obj_TestResultPopup.showPopup("Test failed: " + e.getMessage(), false);
		}
		
		
		
	}

}
 
 
 
 
 
 */



