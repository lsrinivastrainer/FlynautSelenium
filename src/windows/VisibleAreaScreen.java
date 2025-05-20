package windows;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VisibleAreaScreen {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		
		String targetPath = ".screenshots/fullpage3.png";
		
		//String targetPath = System.getProperty("user.dir")+"\\screenshots\\visiblepage1.png";
		//String targetPath = "C:\\Users\\Admin\\Desktop\\Flynaut\\JavaClass\\FlynautSelenium\\screenshots\\visblesh2.png";
		
		File targetfile=new File(targetPath);
		
		sourcefile.renameTo(targetfile); 
		
		driver.quit();
		
		
	}

}
