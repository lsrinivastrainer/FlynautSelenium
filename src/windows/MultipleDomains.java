package windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDomains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/"); 
		
		driver.switchTo().newWindow(WindowType.WINDOW); 
		driver.get("https://www.icicibank.com/"); 
		
		
		Thread.sleep(3000);

	}

}
