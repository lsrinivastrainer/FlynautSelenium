package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class KeyActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

	      // Opening the webpage where we will identify an element
	      driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");

	      WebElement e = driver.findElement(By.xpath("//*[@id='fullname']"));
	      Actions a = new Actions(driver);
	      a.moveToElement(e).click();
	   // key UP and DOWN action for SHIFT
	      a.keyDown(Keys.SHIFT);  
	      
	      a.sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();
	      
	      System.out.println("Text entered: " + e.getDomProperty("value"));
	      
	      Thread.sleep(5000);

	      // Closing browser
	      driver.quit();

	}

}
