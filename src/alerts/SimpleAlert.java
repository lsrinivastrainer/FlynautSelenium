package alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		Thread.sleep(5000);
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText()); 
		myAlert.accept();
		
		driver.findElement(By.id("login1")).sendKeys("vasu"); 
		Thread.sleep(5000);
		driver.quit();

	}

}
