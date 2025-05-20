package selebasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize(); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
				
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
//		for(int i=0;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
//
//		for(int i=4;i<checkboxes.size();i++){
//			checkboxes.get(i).click();
//		}
		
		for(int i=0;i<3;i++) {
			checkboxes.get(i).click();
		}
		Thread.sleep(3000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected()){
				checkboxes.get(i).click();
			}
		}

		
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
