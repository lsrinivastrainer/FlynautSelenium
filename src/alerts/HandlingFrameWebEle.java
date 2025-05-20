package alerts;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class HandlingFrameWebEle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

		driver.switchTo().frame(frame1); 
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		driver.switchTo().defaultContent();
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);

		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[1]")).click();
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}
