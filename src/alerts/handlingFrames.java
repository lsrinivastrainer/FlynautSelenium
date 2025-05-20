package alerts;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class handlingFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Admin/Desktop/Frames/index.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("topLeftFrame");//shift foucus from webpage to frame 
		
		driver.findElement(By.xpath("//input[@id='input1']")).sendKeys("Sreenivas");
		
		driver.switchTo().defaultContent(); //shift foucus from frame to webpage
		
		driver.switchTo().frame("topRight");
		
		driver.findElement(By.xpath("//input[@id='input2']")).sendKeys("Java@gmail.com");
		
		Thread.sleep(3000);
		
		driver.quit();


	}

}
