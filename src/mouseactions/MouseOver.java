package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
      

	      // Opening the webpage 
	       driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
	       WebElement m = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
	       
	       
	       Actions a = new Actions(driver);
	       a.moveToElement(m).click().build().perform();

	       WebElement t = driver.findElement(By.xpath("//*[@id='welcomeDiv']"));
	       System.out.println("Text after click: " + t.getText());

	       WebElement n = driver.findElement(By.xpath("(//button[@type='button'])[8]"));
	       a.moveToElement(n).doubleClick().build().perform();
	       
	       WebElement x = driver.findElement(By.xpath("//*[@id='doublec']"));
	       System.out.println("Text after double click: " + x.getText());
	       
	       WebElement y = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
	       a.moveToElement(y).contextClick().build().perform();
	       
	       Thread.sleep(3000);
	       driver.quit();
	       
        
	}

}
