package selebasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SeleDemo {

	public static void main(String[] args) throws InterruptedException {
				
		//System.setProperty("webdriver.chrome.driver", "D:\\Training\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("https://www.facebook.com");
		
		String expTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle(); 
		System.out.println(actualTitle);
		
		if(expTitle.equals(actualTitle)) {
			System.out.println("TC passed");
		}else {
			System.out.println("TC failed");
		}

		
		
		String url = driver.getCurrentUrl(); 
		  System.out.println(url); 

		  
		  
		Thread.sleep(3000);
		driver.quit();// close entire browser and end the driver session
		//driver.close();//close the current tab
		
		
		
	}

}
