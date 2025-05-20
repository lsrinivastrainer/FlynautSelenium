package javascriptexe;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class JSExecuter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		//inputbox.sendKeys("John");
		
		Thread.sleep(3000);
		
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		
		js.executeScript("arguments[0].click()", radiobtn);
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
