package day_2;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Locator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		// Open URL https://www.flipkart.com/
//		driver.get("https://www.flipkart.com/");
//		
//		// Maximize Browser window
//		driver.manage().window().maximize();
//		
//		// name 
//		driver.findElement(By.name("q")).sendKeys("Jeans");
//		
		// open Url https://www.netflix.com/
		driver.get("https://mvnrepository.com/");
		
		// maximize the chromw window 
		driver.manage().window().maximize();
		
		// by class name
		
		List<WebElement> web_ele = driver.findElements(By.className("im"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Total Number : "+web_ele.size()+"');");
		System.out.println("Total Number : "+web_ele.size());
		
		// tag name
		
		List<WebElement> all_a = driver.findElements(By.tagName("a"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Total Number of a tag : "+all_a.size()+"');");
		System.out.println("Total Number : "+all_a.size());
		
		
		

	}

}





/*
public class Locator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		// Open URL https://www.flipkart.com/
//		driver.get("https://www.flipkart.com/");
//		
//		// Maximize Browser window
//		driver.manage().window().maximize();
//		
//		// name 
//		driver.findElement(By.name("q")).sendKeys("Jeans");
//		
		// open Url https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		
		// maximize the chromw window 
		driver.manage().window().maximize();
		
		// by LinkedText
		driver.findElement(By.linkText("Top Offer")).click();
		
		
		

	}

}
*/

/*
 public class Locator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		// Open URL https://www.flipkart.com/
//		driver.get("https://www.flipkart.com/");
//		
//		// Maximize Browser window
//		driver.manage().window().maximize();
//		
//		// name 
//		driver.findElement(By.name("q")).sendKeys("Jeans");
//		
		// open Url hhttps://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_EAIaIQobChMIhqLxiNq3hwMVhaRmAh2vKAOlEAAYASAAEgKA9vD_BwE_k_
		driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_EAIaIQobChMIhqLxiNq3hwMVhaRmAh2vKAOlEAAYASAAEgKA9vD_BwE_k_");
		
		// maximize the chromw window 
		driver.manage().window().maximize();
		
		// find element by id
		boolean logoDisplay = driver.findElement(By.id("nav-logo")).isDisplayed();
		if(logoDisplay == true)
		{
			String msg = "Has a Logo";
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("alert('" + msg + "');");	
		}
		

	}

}
*/
