package selebasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 

		driver.get("file:///C:/Users/Admin/Desktop/selenium.html");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		
		driver.findElement(By.cssSelector("button.login-btn")).click();

	}

}
