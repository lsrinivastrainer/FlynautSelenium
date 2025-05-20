package selebasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
			
		
		driver.get("file:///C:/Users/Admin/Desktop/selenium.html");
		
		//driver.findElement(By.className("information")).clear();
		WebElement firstName =driver.findElement(By.cssSelector("input.information"));
		
		firstName.clear();
		firstName.sendKeys("Flynaut");
	
		Thread.sleep(3000);
		
		//driver.findElement(By.className("information")).sendKeys("Flynaut");
		
		
		//WebElement lastName = driver.findElement(By.id("lname"));
		WebElement lastName = driver.findElement(By.cssSelector("input#lname"));
		
		lastName.clear();
		lastName.sendKeys("Technologies");
		
		//String labelName = driver.findElement(By.xpath("//label[@for='newsletter']")).getText();
		String labelName = driver.findElement(By.cssSelector("label[for='newsletter']")).getText();
		
		System.out.println(labelName);
		
		driver.findElement(By.name("newsletter")).click();
		
		//driver.findElement(By.linkText("Selenium Official Page")).click();
		
		//driver.findElement(By.partialLinkText("Selenium Official")).click();
		
		driver.findElement(By.tagName("a")).click();
		
		Thread.sleep(3000);
		
		
		
		driver.quit();
	}

}
