package udemy_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSS_locators {

	public static void main(String[] args) {
		
		// CSS Selector 
		// 1) tag id				- tag#element_id 	or	#element_id
		// 2) tag classname			- tag.className		or	.className
		// 3) tag attribute			- tag[attribute=value]	or	[attribute=value]
		// 4) tag class attribute	- tag.className[attribute=value]	or	.className[attribute=value]
		
		// https://automationintesting.online/
		
		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// 2) Open url : https://automationintesting.online/
		driver.get("https://automationintesting.online/");
		
		// Wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// 1) tag id
		// wait till the element is visible, find element using tagname#id 
		//WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#name")));
		// or
		WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
		
		// 2)  tag class
		// wait till the element is visible, find element using tagname#id 
		//WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.text-muted")));
		// or
		WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".text-muted")));
				
		// 2)  tag attribute
		// wait till the element is visible, find element using tagname#id 
		//WebElement element_3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder=Subject]")));
		// or
		WebElement element_3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder=Subject]")));
						
								
		
		// 4)  tag class attribute
		// wait till the element is visible, find element using tagname#id 
		//WebElement element_4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.form-control[data-testid=ContactEmail]")));
		// or
		WebElement element_4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".form-control[data-testid=ContactEmail]")));
		
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		// 4) send name 
		element_1.sendKeys("Rohan");
		
		String txt = element_2.getText();
		System.out.println("Footer : "+txt);
		
		// send subject 
		element_3.sendKeys("Selenium testing");

		// send gmail
		element_4.sendKeys("abc@gmail.com");
		
		
		

	}

}


/*
public class CSS_locators {

	public static void main(String[] args) {
		
		// CSS Selector 
		// 1) tag id				- tag#element_id 	or	#element_id
		// 2) tag classname			- tag.className		or	.className
		// 3) tag attribute			- tag[attribute=value]	or	[attribute=value]
		// 4) tag class attribute	- tag.className[attribute=value]	or	.className[attribute=value]
		
		// https://automationintesting.online/
		
		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// 2) Open url : https://automationintesting.online/
		driver.get("https://automationintesting.online/");
		
		// Wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// 1) tag id
		// wait till the element is visible, find element using tagname#id 
		//WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#name")));
		// or
		WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
		
		// 2)  tag class
		// wait till the element is visible, find element using tagname#id 
		//WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.text-muted")));
		// or
		WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".text-muted")));
				
		// 2)  tag attribute
		// wait till the element is visible, find element using tagname#id 
		//WebElement element_3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder=Subject]")));
		// or
		WebElement element_3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[placeholder=Subject]")));
						
								
		
		// 4)  tag class attribute
		// wait till the element is visible, find element using tagname#id 
		//WebElement element_4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.form-control[data-testid=ContactEmail]")));
		// or
		WebElement element_4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".form-control[data-testid=ContactEmail]")));
		
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		// 4) send name 
		element_1.sendKeys("Rohan");
		
		String txt = element_2.getText();
		System.out.println("Footer : "+txt);
		
		// send subject 
		element_3.sendKeys("Selenium testing");

		// send gmail
		element_4.sendKeys("abc@gmail.com");
		
		
		

	}

}


*/