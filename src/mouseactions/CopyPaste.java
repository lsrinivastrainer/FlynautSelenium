package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();
	      // Opening the webpage where we will identify an element
	      driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

	      // Identify the first input box with xpath locator
	      WebElement e = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	      e.sendKeys("java with selenium");
	      
	      Keys k = Keys.CONTROL;
	      
	      Actions a = new Actions(driver);
	      a.keyDown(k);
	      a.sendKeys("a");
	      a.keyUp(k);
	      a.build().perform();
	      
	      a.keyDown(k);
	      a.sendKeys("c");
	      a.keyUp(k);
	      a.build().perform();

	      //a.sendKeys(Keys.TAB);
	      WebElement caddress =driver.findElement(By.xpath("//textarea[@placeholder='Currend Address']"));
	      a.moveToElement(caddress).click();
	     
	      a.build().perform();
	      
	      a.keyDown(k);
	      a.sendKeys("v");
	      a.keyUp(k);
	      a.build().perform();
	      
	      WebElement s = driver.findElement(By.xpath("//*[@id='lastname']"));

	      String text = s.getDomProperty("value");
	      System.out.println("Value copied and pasted: " + text);
	      
	      Thread.sleep(3000);

	      // Closing browser
	      driver.quit();

	}

}
