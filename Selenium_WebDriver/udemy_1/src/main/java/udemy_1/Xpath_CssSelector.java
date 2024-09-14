package udemy_1;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Xpath_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		// 1) Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		// 2) Open url : https://rahulshettyacademy.com/locatorspractice/
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// 3) Maximize Browser window
		driver.manage().window().maximize();
		
		//locating Username webElement
		WebElement username_ele = driver.findElement(By.cssSelector("input#inputUsername"));
		
		By username_element_cssSelector = By.cssSelector("input#inputUsername");
		// Send username to the element 
		username_ele.sendKeys("Rahul");
		
		
		// Locating Password web element Using cssSelector Regular Expression
		WebElement password_element = driver.findElement(By.cssSelector("input[type*='pass']"));		
		// sending the password
		password_element.sendKeys("Rahul@123");
		
		// Locating the Remember username checkbox Using Xpath Regular Expression
		WebElement remember_checkBox = driver.findElement(By.xpath("//input[contains(@name, 'chkboxOne')]"));		
		// performing click operation on Remember checkBox
		remember_checkBox.click();
		
		
		WebElement privacy_policy_checkBox = driver.findElement(By.xpath("//input[@id='chkboxTwo']"));
		// performing click operation on privacy policy check Box
		privacy_policy_checkBox.click();
		
		// Delay time
		Thread.sleep(2000);
		
		//Locating sign button element
		WebElement sign_btn = driver.findElement(By.cssSelector("button.submit"));
		// Perform click operation on Sign Button
		sign_btn.click();
		
		
		// Delay time
		Thread.sleep(2000);
		
		// Locating the error element after clicking on the sign button
		WebElement error_ele = driver.findElement(By.className("error"));
		// Getting the error text
		String error_text = error_ele.getText();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		if(error_ele.isDisplayed())
		{
			// Getting the error text
			//String error_text = error_ele.getText();
			try
			{
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("alert('Error "+error_text+" ');");
				
				// Switch to the alert
			    Alert alert = driver.switchTo().alert();
			    
			    // Retrieve alert text
			    String alertText = alert.getText();
			    System.out.println("Alert text: " + alertText);
			    
			    // Delay time
				Thread.sleep(2000);
			    
			    // Accept the alert
			    alert.accept();
			    
			    // If needed, dismiss the alert
			    // alert.dismiss();
				
				System.out.println("Error Occur : "+error_text);
				
			}
			catch(NoAlertPresentException e)
			{
				System.out.println("No alert present.");
			}
			catch (UnhandledAlertException e) 
			{
			    System.out.println("Unhandled alert exception.");
			}
			
		}
		else
		{
			System.out.println("Error is not occur .");
		}
		
		
		// implicit wait 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		// Locating the Forget Password link 
		WebElement forget_pwd_link = driver.findElement(By.linkText("Forgot your password?"));
		// Perform Click operation on Forget Password Link
		forget_pwd_link.click();
		
		
		// Xpath :-    //form[@action='#']/child::input[1]
		// Locating the name element 
		WebElement name_ele = driver.findElement(By.xpath("//form[@action='#']/child::input[1]"));
		// Send Name 
		name_ele.sendKeys("Rahul Shetty");
		
		// Xpath :- //form[@action='#']/child::input[2]
		//Locating the email element 
		WebElement email_ele = driver.findElement(By.xpath("//form[@action='#']/child::input[2]"));
		// send email
		email_ele.sendKeys("rahulShetty@gmail.com");
		
		// Xpath using Regular Expression
		// Locating the phone element
		WebElement phone_no_ele = driver.findElement(By.xpath("//input[contains(@placeholder, 'Phone Number')]"));
		// send phone number
		phone_no_ele.sendKeys("99853214");
		
		
		// implicit wait 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// delay time for 5 second
        Thread.sleep(3000);
				
		
		// Locating the reset btn using Regular Expression
		// using the xpath 
		WebElement reset_pwd_btn = driver.findElement(By.xpath("//button[contains(@class, 'reset-pwd-btn')]"));
		reset_pwd_btn.click();
		
		// After click on reset password button store the text
		// Locating the element using cssSelector 
		WebElement info_msg = driver.findElement(By.cssSelector(".infoMsg"));
		String msg = info_msg.getText();
		System.out.println("Information msg : "+msg);
		
		
		// rahulshettyacademy
		// regex - '(\W*.\w*.)'  or   password\s+'([^']*)'
		String regex_pwd = "password\\s+'([^']*)'";
		// Extracted Text from the msg string 
		String extractedText = "";
		
		// Compile the pattern
        Pattern pattern = Pattern.compile(regex_pwd);

        // Create a matcher for the input text
        Matcher matcher = pattern.matcher(msg);

        // Find matches and extract the captured group
        if (matcher.find()) {
            // The first capturing group contains the extracted text
            extractedText = matcher.group(1);
            System.out.println("Extracted text: " + extractedText);
        } else {
            System.out.println("No match found.");
        }
		
        
        // implicit wait 
     	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	
        // delay time for 3 second
        Thread.sleep(3000);
        
        // Locating the web element goToLogin
        // Using Xpath 
        WebElement goToLogin = driver.findElement(By.xpath("//button[@class='go-to-login-btn']"));
        goToLogin.click();
        
        // send Rahul as username 
        username_ele.sendKeys("Rahul");
        
        // send password that is extracted from the info_msg
        password_element.sendKeys(extractedText);
        
        
        // delay time for  second
        Thread.sleep(3000);
        		
        // Perform click operation on Sign Button
     	sign_btn.click();
     	
     	
        // delay time for  second
        Thread.sleep(3000);
        
     // Locate element to pop up log out msg 
        WebElement log_out_msg = driver.findElement(By.tagName("p")); 
        
        // Store msg 
        String log_out_msg_txt = log_out_msg.getText();
        
        System.out.println("Log out msg : "+log_out_msg_txt);
        
        try
        {
        	js.executeScript("alert('"+log_out_msg_txt+" ')");
        	
        	// Switch to the alert
		    Alert alert = driver.switchTo().alert();
		    
		    // Retrieve alert text
		    String alertText = alert.getText();
		    System.out.println("Alert text: " + alertText);
		    
		    // Delay time
			Thread.sleep(2000);
		    
		    // Accept the alert
		    alert.accept();
        }
     	catch(NoAlertPresentException e)
        {
     		System.out.println("No alert present.");
        }
        catch(UnhandledAlertException e)
        {
        	System.out.println("Unhandled alert exception.");
        }

        String logOut_msg ="You are successfully logged in.";
        
        
        // Check log in msg
        Assert.assertEquals(log_out_msg_txt, logOut_msg);
        //Assert.assertEquals(log_out_msg_txt, "You are logged in");
        
        // To verify that the same user logged in using the password - simply to usernam used to login and logged in user
        WebElement logged_in_user = driver.findElement(By.xpath("//div[@class='login-container']/child::h2"));
        // get the text 
        String username_check = logged_in_user.getText() ;
        
        // regex to extract usrname 
        String regex_username = "Hello\\s*([^']*),";
        
        //// Compile the pattern
        Pattern pattern_username = Pattern.compile(regex_pwd);

        // Create a matcher for the input text
        Matcher matcher_username = pattern_username.matcher(msg);

        // Find matches and extract the captured group
        if (matcher_username.find()) {
            // The first capturing group contains the extracted text
            extractedText = matcher_username.group(1);
            System.out.println("Extracted text: " + extractedText);
        } else {
            System.out.println("No match found.");
        }
        
        System.out.println("Username  : "+username_check);
        
        //Assert.assertEquals(extractedText, driver.findElement(By.cssSelector("input#inputUsername")).getText());
        
        
     	
     	// Locating logOut web element  
     	// Using the cssSelector regular expression
     	WebElement log_out = driver.findElement(By.cssSelector("button[class*='logout-btn']")); 
     	log_out.click();
     	
 /*
  
     
     	// delay time for  second
        Thread.sleep(2000);
        
        try
        {
        	js.executeScript("alert('"+log_out_msg_txt+" ')");
        	
        	// Switch to the alert
		    Alert alert = driver.switchTo().alert();
		    
		    // Retrieve alert text
		    String alertText = alert.getText();
		    System.out.println("Alert text: " + alertText);
		    
		    // Delay time
			Thread.sleep(2000);
		    
		    // Accept the alert
		    alert.accept();
        }
     	catch(NoAlertPresentException e)
        {
     		System.out.println("No alert present.");
        }
        catch(UnhandledAlertException e)
        {
        	System.out.println("Unhandled alert exception.");
        }
        
   
  	
  */
     	
	}

}


/*
  
  import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;





public class Locators2 {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

String name = "rahul";

System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

// System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

// WebDriver driver = new EdgeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

String password = getPassword(driver);

driver.get("https://rahulshettyacademy.com/locatorspractice/");

driver.findElement(By.id("inputUsername")).sendKeys(name);

driver.findElement(By.name("inputPassword")).sendKeys(password);

driver.findElement(By.className("signInBtn")).click();

Thread.sleep(2000);

System.out.println(driver.findElement(By.tagName("p")).getText());

Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

driver.findElement(By.xpath("//*[text()='Log Out']")).click();

driver.close();





}



public static String getPassword(WebDriver driver) throws InterruptedException



{

driver.get("https://rahulshettyacademy.com/locatorspractice/");

driver.findElement(By.linkText("Forgot your password?")).click();

Thread.sleep(1000);

driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

String passwordText =driver.findElement(By.cssSelector("form p")).getText();

//Please use temporary password 'rahulshettyacademy' to Login.

String[] passwordArray = passwordText.split("'");

// String[] passwordArray2 = passwordArray[1].split("'");

// passwordArray2[0]

String password = passwordArray[1].split("'")[0];

return password;

//0th index - Please use temporary password

//1st index - rahulshettyacademy' to Login.



//0th index - rahulshettyacademy

//1st index - to Login.





}


 
 */






/*
 
 import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;





public class Locators {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

//implicit wait - 2 seconds time out

System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.get("https://rahulshettyacademy.com/locatorspractice/");

driver.findElement(By.id("inputUsername")).sendKeys("rahul");

driver.findElement(By.name("inputPassword")).sendKeys("hello123");

driver.findElement(By.className("signInBtn")).click();

System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

driver.findElement(By.linkText("Forgot your password?")).click();

Thread.sleep(1000);//

driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

System.out.println(driver.findElement(By.cssSelector("form p")).getText());

driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

Thread.sleep(1000);

driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

driver.findElement(By.id("chkboxOne")).click();

driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

}



}


 
 */

