package udemy_1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green_Kart_EcommerceApp {

	public static void main(String[] args) {
		
		// https://rahulshettyacademy.com/seleniumPractise/#/
		
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// array of product
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Tomato"}; 
		
		// size of itemsNeeded - 3  but we are using the counter = 0  that's why itemsNeeded.length-1
		int size_itemsNeeded = itemsNeeded.length-1;
		
		// counter to check the item itemsNeeded = {"Cucumber", "Brocolli", "Tomato"};
		int counter = 0;
						
		// Javascript  
		JavascriptExecutor js = (JavascriptExecutor) driver;					
															
		// Maximize Browser window
		driver.manage().window().maximize();
															
		// Open url :  https://rahulshettyacademy.com/seleniumPractise/#/
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		// if we are locating any element in this GreenKart we will get almost 30 item matching 
		//if we have to locate element then we have to traverse through the each element and check the desired item index then locate the element 
		List<WebElement> product_list = driver.findElements(By.cssSelector("h4.product-name"));
		
		// Total 30 item are present on the page total_product = 30
		int total_product = product_list.size();
					
		// Traverse through the each element until find the desired one
		for(int i=0 ; i<total_product ; i++)
		{
			// Cucumber - 1 Kg,  Brocolli - 1 Kg
			// We have to string Brocolli - 1 Kg in such way that only Brocoli is capture, so to capture Brocolli we to have split by - (Brocolli, - 1 Kg)
			// Brocolli - 1 Kg  (spliting by - )
			// after spliting : Brocolli ,  1 Kg
			// Using split() it gives array 
			// product_name = {"Brocolli ", " 1 Kg"} here you can see white spaces also coming so we have to remove it to match with the itemes in
			// the array String[] itemsNeeded = {"Cucumber", "Brocolli"};  
			String[] product_name_arr = product_list.get(i).getText().split("-");
			// trim() removes leading and trailing whitespace (remove whitespaces from left and right side of the string)
			
			String product_name = product_name_arr[0].trim();
			
			// before comparing the product name we have to remove  - 1 Kg from the product_name 
			
			
			// Check whether the product name extracted is present in the array or not
			// Convert array into arraylist 
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			// check the product name contain cucumber 
			if(itemsNeededList.contains(product_name))
			{
				// clcik on the product to add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				counter++;
				
				if(counter == size_itemsNeeded )
				{
					break;
				}
				
			}
			
		}
		

	}

}


/*

public class Green_Kart_EcommerceApp {

	public static void main(String[] args) {
		
		// https://rahulshettyacademy.com/seleniumPractise/#/
		
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
						
		// Javascript  
		JavascriptExecutor js = (JavascriptExecutor) driver;					
															
		// Maximize Browser window
		driver.manage().window().maximize();
															
		// Open url :  https://rahulshettyacademy.com/seleniumPractise/#/
		driver.get(" https://rahulshettyacademy.com/seleniumPractise/");
		
		// if we are locating any element in this GreenKart we will get almost 30 item matching 
		//if we have to locate element then we have to traverse through the each element and check the desired item index then locate the element 
		List<WebElement> product_list = driver.findElements(By.cssSelector("h4.product-name"));
		
		int total_product = product_list.size();
		
		// Traverse through the each element until find the desired one
		for(int i=0 ; i<total_product ; i++)
		{
			String product_name = product_list.get(i).getText();
			
			// check the product name contain cucumber 
			if(product_name.contains("Cucumber"))
			{
				// clcik on the product to add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
			
		}
		

	}

}


*/