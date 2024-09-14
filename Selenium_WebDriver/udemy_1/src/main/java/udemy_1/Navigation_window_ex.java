package udemy_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_window_ex {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize Browser window
		driver.manage().window().maximize();
						
		// Open url : https://google.com
		driver.get("https://google.com");
		
		// time delay
		Thread.sleep(3);
		
		System.out.println("Navigate to https://rahulshettyacademy.com/ ");
		
		// Navigate to https://rahulshettyacademy.com/
		driver.navigate().to("https://rahulshettyacademy.com/");
		
		// time delay
		Thread.sleep(3);
		
		System.out.println("Navigate to google ");
		
		// Navigate back to goole 
		driver.navigate().back();
		
		// time delay
		Thread.sleep(3);
		
		System.out.println("Navigate to https://rahulshettyacademy.com/ ");
		
		// Navigate to forward https://rahulshettyacademy.com/
		driver.navigate().forward();
				
		

	}

}


/*

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Locators3 {



public static void main(String[] args) {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

// Sibling - Child to parent traverse

//header/div/button[1]/following-sibling::button[1]

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());



System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());









}



}





*****************************************************************

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class WindowActivities {



public static void main(String[] args) {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://google.com");

driver.navigate().to("https://rahulshettyacademy.com");

driver.navigate().back();

driver.navigate().forward();

}



}



*/