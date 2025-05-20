package selebasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.name("q")).sendKeys("selenium"); 
		Thread.sleep(2000);
		
		String xp = "//span[contains(text(),'selenium')]"; 
		List<WebElement> allSuggestions = driver.findElements(By.xpath(xp)); 
		
		
		int count = allSuggestions.size(); 
		System.out.println(count);
		

		for (int i = 0; i < count; i++) { 
		WebElement suggestion = allSuggestions.get(i); 
		String text = suggestion.getText(); 
		
		System.out.println(text); 
		}
			allSuggestions.get(count - 1).click(); 
		} 



	

}
