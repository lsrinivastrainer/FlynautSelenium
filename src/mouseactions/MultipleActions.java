package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class MultipleActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.greenstechnologys.com/"); 
          // Find the element to hover over
        WebElement menu = driver.findElement(By.xpath("//a[@href=\"courses.html\" and .='COURSES']"));
        // Create Actions class instance
        Actions actions = new Actions(driver);
        WebElement mainmenu = driver.findElement(By.xpath("//a[contains(@href,'oracle-training')]"));
        WebElement subbmenu = driver.findElement(By.xpath("//a[contains(@href,'sql') and .='SQL Certification']"));

        actions.moveToElement(menu).moveToElement(mainmenu).moveToElement(subbmenu).click().perform(); 
        //subbmenu.click();
        
        Thread.sleep(5000);

		
		// Close the browser
		driver.quit();

	}

}
