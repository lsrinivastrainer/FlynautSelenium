package windows;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkedinWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Step 1: Open LinkedIn login page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.linkedin.com/login");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Handle: " + parentWindow);

		driver.findElement(By.xpath("//span[contains(.,'Sign in with Apple')]")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("All Window Handles: " + allWindowHandles);
		
		for (String windowHandle : allWindowHandles) {
		    if (!windowHandle.equals(parentWindow)) {
		        // Switch to Apple login window
		        driver.switchTo().window(windowHandle);
		        System.out.println("Switched to Apple Login Window");
		        driver.findElement(By.xpath("//input[@id='account_name_text_field']")).sendKeys("sreenivas123@yahoo.com");
		        
		        WebElement signin = driver.findElement(By.xpath("//button[@id='sign-in']"));
			    signin.click();
			    driver.findElement(By.xpath("//input[@id='password_text_field']")).sendKeys("sreenivas123");
			    
			    signin = driver.findElement(By.xpath("//button[@id='sign-in']"));
			    
			    signin.click();
			    Thread.sleep(3000);   
		    }


		}
		
		driver.switchTo().window(parentWindow);
		System.out.println("Switched back to Parent Window");
		System.out.println("Parent window title is: "+driver.getTitle());	
		

	}

}
