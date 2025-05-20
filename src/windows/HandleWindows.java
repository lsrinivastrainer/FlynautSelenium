package windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/"); 
		driver.findElement(By.xpath("//a[.='Locate us']")).click();
		
		String parentWindowId = driver.getWindowHandle(); 
		System.out.println("Parent Window ID:" + parentWindowId); 

		

		Set<String> allWindowIds = driver.getWindowHandles();
		
		Iterator<String> iterator = allWindowIds.iterator();
		
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if (!parentWindowId.equalsIgnoreCase(childWindow)) {
	            driver.switchTo().window(childWindow);
	            WebElement text = driver.findElement(By.xpath("//h3[@class='w-heading']"));
	            System.out.println("Heading of child window is: " + text.getText());
			}
			
			
		}
	driver.quit();	
		
		
	}

}
