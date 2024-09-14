package udemy_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest_Dropdown {

	public static void main(String[] args) throws InterruptedException {
			
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
					
		// Maximize Browser window
		driver.manage().window().maximize();
									
		// Open url : https://rahulshettyacademy.com/dropdownsPractise/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// send ind in the country input text on top left corner on this website https://rahulshettyacademy.com/dropdownsPractise/
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");
		
		// Delay time 
		Thread.sleep(3000);
		
		// after 'ind' sent in the input-dropdown it automatically suggests the result matches with the character 'ind' then  capture all the element in list
		List<WebElement> dropdown_options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a")) ;
		
		// traverse through the options list and check the option contain India or not if found then select it (by clicking on the India)
		for(WebElement option : dropdown_options)
		{
			// Checking the list of option is equal to "India" or not 
			if(option.getText().equalsIgnoreCase("India"))
			{
				// Option match to "India"
				// Click on that option
				System.out.println("Text : "+option.getText());
				option.click();
				break;
			}
		}
			
			
			
			
			
			
			
		
	}

}



/*
 // Udemy code
 import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestive {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

driver.findElement(By.id("autosuggest")).sendKeys("ind");

Thread.sleep(3000);

List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

for(WebElement option :options)

{

if(option.getText().equalsIgnoreCase("India"))

{

option.click();

break;

}

}

}



}


*/
  
