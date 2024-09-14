package day_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locators {

	public static void main(String[] args) {
		
		// https://automationintesting.online/
		
				// 1) Launch Chrome Browser
				WebDriver driver = new ChromeDriver();
				
				// 2) Open url : https://automationintesting.online/
				driver.get("https://automationintesting.online/");
				
				// Wait
				WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
				
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
				
				
				// 3) Maximize Browser window
				driver.manage().window().maximize();
				
				// 4) send name 
				element.sendKeys("Rohan");
				
				

	}

}
