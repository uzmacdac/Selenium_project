package udemy_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Se_Introduction {

	public static void main(String[] args) {
		System.out.println("Testing...");
		
		// 1) Launch browser (chrome).
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new EdgeDriver();
		
		// 2) Open URL
		driver.get("https://www.tutorialspoint.com/testng/index.htm");
		
		// print the title and url
		System.out.println("Title : "+driver.getTitle());
		System.out.println("URL : "+driver.getCurrentUrl());
		
		
		driver.close();

	}

}


/*
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class SelIntroduction {



public static void main(String[] args) {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

         ChromeOptions options = new ChromeOptions();

         options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

WebDriver driver = new ChromeDriver(options);



//Firefox

System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

WebDriver driver1 = new FirefoxDriver();

//Microsoft Edge

System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

WebDriver driver2 = new EdgeDriver();

driver.get("https://rahulshettyacademy.com");

System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

driver.close();

//driver.quit();



}

}
*/






/*
 
class HelloWorld {
    public static void main(String[] args) {
         double[] arr = new double[5];
    
    for(int i =0 ; i< arr.length ; i++)
    {
        arr[i] = 2*i;
    }
    
    System.out.println("First element : "+arr[0]);
    System.out.println("Last element : "+arr[arr.length-1]);
    
    System.out.println("Reverse Order : ");

    
    for(int i=arr.length-1 ; i>=0 ; i--)
    {
        System.out.print(arr[i]+" ");
    }
    }
}
 */






/*
 public class CoreJavaBrushUp1 {



public static void main(String[] args) {

// TODO Auto-generated method stub





int myNum = 5;

String website = "Rahul Shetty Academy";

char letter = 'r';

double dec = 5.99;

boolean myCard = true;



System.out.println(myNum+"is the value stored in the myNum variable");

System.out.println(website);

//Arrays -

int[] arr = new int[5];// 5, 10

arr[0] = 1;

arr[1] = 2;

arr[2]= 4;

arr[3]= 5;

arr[4]= 6;





int[] arr2 = {1,2,4,5,6};



System.out.println(arr2[0]);















//for loop arr.length - 5

for(int i = 0; i< arr.length; i++) //4

{



System.out.println(arr[i]);

}



for (int i =0;i<arr2.length; i++)

{

System.out.println(arr2[i]);

}



String[] name = {"rahul", "shetty", "selenium"};



for(int i =0; i<name.length;i++)

{

System.out.println(name[i]);

}



for( String s: name)

{

System.out.println(s);

}



}





}
 */


}


*/