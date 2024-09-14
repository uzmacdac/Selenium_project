package udemy_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flight_Booking {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );
							
		// Maximize Browser window
		driver.manage().window().maximize();
											
		// Open url : https://rahulshettyacademy.com/dropdownsPractise/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");		
		
		//************************* Country Selection *********************************************************************
		
		// Select Country using id : autosuggest
		WebElement select_country = driver.findElement(By.id("autosuggest"));
		select_country.sendKeys("ind");
		
		// Delay time 
		Thread.sleep(3000);
		
		// after 'ind' sent in the input-dropdown it automatically suggests the result matches with the character 'ind' then  capture all the element in list
		List<WebElement> list_of_country = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		// traverse through the options list and check the option contain India or not if found then select it (by clicking on the India)
		for(WebElement country : list_of_country)
		{
			// Checking the list of option is equal to "India" or not 
			if(country.getText().equalsIgnoreCase("India"))
			{
				// Option match to "India"
				// Click on that option
				System.out.println("Text : "+country.getText());
				country.click();
				break;
			}
			
			//System.out.println("Text : "+country.getText());
		}
		
		//************************* Departure City Selection ********************************************************
		
		// Click on Departure input (From input ) using id : ctl00_mainContent_ddl_originStation1_CTXT
		WebElement flight_from = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		flight_from.click();
		
		//  Selecting the Departure City using xpath :  //a[@text='Bengaluru (BLR)' and @value='BLR']
		WebElement depature_city = driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)' and @value='BLR']"));
		depature_city.click();
		
		//************************* Arrival City Selection ***********************************************************
		
		// Click on Arrival city input (To input) using id : ctl00_mainContent_ddl_destinationStation1_CTXT
		WebElement flight_to = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		flight_to.click();
		
		// if we are using xpath : //a[@value='MAA']
		//  driver.findElement(By.xpath("//a[@value='MAA']")).click(); will  throw exception ElementNotVisibleException because by default selenium search for
		//  this element in first dropdown (Departure City (from input)dropdown) but it was found that the dropdown is close it is not able to locate the element 
		// which is current not visible (not available ) on the page
		
		
		//  Selecting the Arrival City using xpath :  (//a[@text="Chennai (MAA)" and @value='MAA'])[2]  (here we are using [2] because while locating 
		// the element it is show 2 matches 1 for Departure city and another for Arrival city so need to select for Arrival city that is why we use [2] index second 
		//WebElement arrival_city = driver.findElement(By.xpath(" (//a[@text=\"Chennai (MAA)\" and @value='MAA'])[2]"));
		//arrival_city.click();
		
		// Or Using Parent xpath : //div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']
		WebElement arrival_city = driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']"));
		arrival_city.click();
		
		//************************* Calender Currnet Date **********************************************************
		
		// Time Delay
		Thread.sleep(2000);
		
		// Calender get the today's date : //td[contains(@class,'ui-datepicker-today')]
		WebElement today_date = driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]"));
		String today_date_txt = today_date.getText();
		System.out.println("Current Date : "+today_date_txt);
		today_date.click();
		
		//************************* Passenger count ******************************************************************
		 
		// Click on the Passenger input box using id : divpaxinfo
		WebElement passenger = driver.findElement(By.id("divpaxinfo"));
		passenger.click();
		
		WebElement add_adult_passenger = driver.findElement(By.xpath("//span[@id='hrefIncAdt' and @class='pax-add pax-enabled']"));
		// adding 3 adult
		for(int i=1 ; i<3 ; i++)
		{
			Thread.sleep(2000);
			add_adult_passenger.click();
		}
		
		// Time Delay
		Thread.sleep(2000);
		
		// adding the child passenger using the id : hrefIncChd
		WebElement add_child_passenger = driver.findElement(By.id("hrefIncChd"));		
		add_child_passenger.click();
		
		// Time Delay
		Thread.sleep(2000);
		 
		// hit the Done button using xpath : //input[@id='btnclosepaxoption' and @value='Done']
		WebElement done_btn =driver.findElement(By.xpath("//input[@id='btnclosepaxoption' and @value='Done']"));
		done_btn.click();
		
		//*********************** Currency dropdown using <select> tag ************************************************
		// Currency dropdown element using id : ctl00_mainContent_DropDownListCurrency
		WebElement currency_dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		currency_dropdown.click();
		
		Select select = new Select(currency_dropdown);
		select.selectByVisibleText("INR");
		
		System.out.println("Select option : "+select.getOptions());
		
		//*********************** Search button ************************************************************************
		
		// Time Delay
		Thread.sleep(2000);
		
		// click on Search button using the xpath : 
		WebElement search_btn = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']"));
		search_btn.click();
		
	}

}


/*
// Udemy Code 

Exercise code download
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;



public class e2e {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("http://spicejet.com"); //URL in the browser

driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

driver.findElement(By.xpath("//a[@value='DEL']")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

{

System.out.println("its disabled");

Assert.assertTrue(true);

}

else

{

Assert.assertTrue(false);

}

driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

driver.findElement(By.id("divpaxinfo")).click();

   Thread.sleep(2000L);

for(int i=1;i<5;i++)

{

driver.findElement(By.id("hrefIncAdt")).click();

}

driver.findElement(By.id("btnclosepaxoption")).click();

Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

driver.findElement(By.cssSelector("input[value='Search']")).click();

// driver.findElement(By.xpath("//input[@value='Search']")).click();

// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

}



}



Resources for this lecture


*/