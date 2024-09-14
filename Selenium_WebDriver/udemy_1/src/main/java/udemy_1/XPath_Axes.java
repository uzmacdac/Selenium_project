package udemy_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Axes {

	public static void main(String[] args) {

		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// 2) Open url : https://rahulshettyacademy.com/AutomationPractice/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		// Parent to child - following sibling 
		String txt_1 = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println("Button Text : "+txt_1);
		
		// Child to Parent 
		String txt_2 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		System.out.println("Button Text : "+txt_2);

	}

}
