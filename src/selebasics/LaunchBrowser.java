package selebasics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser Name:");
		
		String browser = sc.nextLine();

		WebDriver driver = null;
		
		if(browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}else
			if(browser.equals("Chrome"))
			{
				driver = new ChromeDriver();
			}else
				if(browser.equals("Edge"))
				{
					driver = new EdgeDriver();
				}else
				{
					System.out.println("Invalid browser");
				}

		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
