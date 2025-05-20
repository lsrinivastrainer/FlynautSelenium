package selebasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize(); 
		
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		
		// To find the count of the link 
				System.out.println(links.size()); 

				
				for (WebElement x1 : links) { 
					System.out.println(x1.getDomAttribute("href")); 
					} 

		
		driver.quit();
	}

}
