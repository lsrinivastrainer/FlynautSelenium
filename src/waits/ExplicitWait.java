package waits;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.manage().window().maximize(); 
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/login-slow.html"); 
		driver.findElement(By.id("username")).sendKeys("Sreenivas"); 
		driver.findElement(By.id("password")).sendKeys("Vasu@123"); 
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebDriverWait myWait =new WebDriverWait(driver, Duration.ofSeconds(20));
//
//		WebElement loginError = myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@id='invalid']"))));
//		String error = loginError.getText();
//		System.out.println(error);

	
		
		WebElement loginMsgEle = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='invalid']")));
		String loginMsgError = loginMsgEle.getText();
		System.out.println(loginMsgError);
		
		driver.quit();	
		
	}

}
