package udemy_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		// https://rahulshettyacademy.com/AutomationPractice/
		
		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// 2) Open url : https://rahulshettyacademy.com/AutomationPractice/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		// 4) Find the element using id 
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		
		
		
		

	}

}
