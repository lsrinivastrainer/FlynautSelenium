package selebasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNavigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
			
		driver.manage().window().maximize();
		//driver.get("https://www.makemytrip.com/");
		
		driver.navigate().to("https://www.facebook.com/"); 
		
		Thread.sleep(3000);
		
	
		
		 
		Thread.sleep(1000); //To navigate to next page
		driver.navigate().forward();
		 
		//To navigate to previous page
		driver.navigate().back();
		 
		Thread.sleep(1000); //Refresh current web page
		driver.navigate().refresh();
		
		Thread.sleep(3000);

		
		driver.quit();

	}

}
