package windows;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchWithIndex {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/"); 
		
		driver.findElement(By.xpath("//a[.='Locate us']")).click();
		
		String parentWindowId = driver.getWindowHandle(); 
		System.out.println("Parent Window ID:" + parentWindowId); 

		Set<String> allWindowId = driver.getWindowHandles();
		
		List<String> l=new ArrayList<String>(allWindowId); 
		
		driver.switchTo().window(l.get(1)); 
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(l.get(0)); 
		System.out.println(driver.getTitle());
		

	}

}
