package alerts;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://lsrinivastrainer.github.io/Javapgms/stale-demo.html");
		WebElement button = driver.findElement(By.id("myButton"));
		button.click();
		
		Thread.sleep(2000); 
		
		try {
		    // Try to click again using old reference — will throw StaleElementReferenceException
		    button.click();
		} catch (StaleElementReferenceException e) {
		   System.out.println("Caught stale element. Re-locating...");
		    button = driver.findElement(By.id("myButton")); // re-locate
		    button.click();
		}

		driver.quit();
		


	}

}
