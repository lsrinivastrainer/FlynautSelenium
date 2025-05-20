package windows;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class FullPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		HasFullPageScreenshot fullPage = (HasFullPageScreenshot) driver;
		File sourcefile = fullPage.getFullPageScreenshotAs(OutputType.FILE);

		String targetPath = System.getProperty("user.dir")+"\\screenshots\\fullpagescreen1.png";
		
		FileHandler.copy(sourcefile, new File(targetPath));
		
		driver.quit();

	}

}
