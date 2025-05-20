package waits;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
public class FluentWaitEx2 {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
        driver.findElement(By.xpath("//input[@id='delay']")).clear();
        driver.findElement(By.xpath("//input[@id='delay']")).sendKeys("10");
        driver.findElement(By.xpath("//span[text()='8']")).click();
        driver.findElement(By.xpath("//span[.='+']")).click();
        driver.findElement(By.xpath("//span[.='4']")).click();
        driver.findElement(By.xpath("//span[.='=']")).click();
        
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class);
        

//        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.xpath("//div[.='12']"));
//            }            
//        });
        
        
        WebElement element = wait.until(myDriver -> driver.findElement(By.xpath("//div[.='12']")));
        
        System.out.println(element.getText());        

        driver.quit();
	}

}
