package javascriptexe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
//		
//		js.executeScript("window.scrollBy(0,1000)");
//		System.out.println(js.executeScript("return window.pageYOffset;")); 
//		
//		WebElement bookTable=driver.findElement(By.xpath("//table[@name='BookTable']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();", bookTable);
//		
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
//		Thread.sleep(5000);
//		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		
//		js.executeScript("window.scrollTo(0, 0)");
//		
//		js.executeScript("window.scrollBy(300,0)");
		
		//driver.manage().window().minimize();
		
		//Thread.sleep(5000);
		//driver.manage().window().maximize();
		
		js.executeScript("document.body.style.zoom='50%'"); 
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='80%'"); 
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
