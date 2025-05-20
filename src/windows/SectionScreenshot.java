package windows;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class SectionScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		
		WebElement targetSection = driver.findElement(By.xpath("//img[@alt='Picture for category Electronics']"));
		File srcFile =   targetSection.getScreenshotAs(OutputType.FILE);
		
		String targetPath = System.getProperty("user.dir")+"\\screenshots\\sectionscreen2.png";
		
		FileHandler.copy(srcFile, new File(targetPath));
		
		driver.quit();


	}

}
