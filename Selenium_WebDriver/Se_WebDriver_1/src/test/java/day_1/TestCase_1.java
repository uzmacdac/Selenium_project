package day_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


/*
 	Test Case :
 	1) Launch browser (chrome).
 	2) Open URL https://demo.opencart.com/
 	3) Validate title should be "Your Store".
 	4) Close browser.
 */

public class TestCase_1{
	
	public static void main(String[] args) {
		System.out.println("Testing...");
	
		// 1) Launch browser (chrome).
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		// 2) Open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		// 3) Validate the Title should be "Your Store
//		String act_title = driver.getTitle();
//		System.out.println("Title : "+act_title);
//		
//		if(act_title.equals("\"Your Store"))
//		{
//			System.out.println("Test Passed.");
//		}
//		else
//		{
//			System.out.println("Test Failed.");
//		}
//		
//		// 4) Close browser
//		//driver.close();
//		driver.quit();
		
	}
}
