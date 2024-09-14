package udemy_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments_Dropdown_editboxes_error {

	public static void main(String[] args) throws InterruptedException {
		//  https://rahulshettyacademy.com/angularpractice/
		
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
			
		// Javascript  
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Maximize Browser window
		driver.manage().window().maximize();
			
			
		// Open url :  https://rahulshettyacademy.com/angularpractice/
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		// Name
		WebElement name = driver.findElement(By.xpath("//input[@name='name' and @type='text']"));
		name.sendKeys("Priya");
		
		// email xpath : //input[@name='email']   cssSelector  : input[name='email']
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("priya@gmail.com");
		
		// Password using regex cssSelector : input[id*='exampleInputPassword1']
		WebElement password = driver.findElement(By.cssSelector("input[id*='exampleInputPassword1']"));
		password.sendKeys("rahul@123");
		
		// check checkbox
		WebElement check_me = driver.findElement(By.id("exampleCheck1"));
		check_me.click();
		
		// Gender dropdown 
		WebElement gender_dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		gender_dropdown.click();
		
		// dropdown option using <select> tag
		Select select = new Select(gender_dropdown);
		
		// select dropdown options
		//select.selectByVisibleText("Male");
		
		// select dropdown options
		select.selectByVisibleText("Female");
		
		// Select Employ status
		WebElement employee_status = driver.findElement(By.id("inlineRadio1"));
		employee_status.click();
		
		// Select Birthday cssSelector :  input[name='bday']
		WebElement bday = driver.findElement(By.cssSelector("input[name='bday']"));
		bday.click();
		
		// Time delay
		Thread.sleep(3000);
		bday.sendKeys("03-08-1996");
		
		// click on submit button'
		WebElement submit_btn = driver.findElement(By.xpath("//input[@class='btn btn-success' and @type='submit' and @value='Submit']"));
		submit_btn.click();
		
		// capture submit msg xpath : //a[@class='close']     //div[@class='alert alert-success alert-dismissible']
		WebElement submit_msg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		
		String msg = submit_msg.getText();
		
		//System.out.println("Msg : "+msg);
		
		// Remove the unwanted text ('×' character) from the result
        String filteredText = msg.replace("×", "").trim();
        
        //System.out.println("Msg : "+filteredText);

        System.out.println(filteredText);

	}

}
