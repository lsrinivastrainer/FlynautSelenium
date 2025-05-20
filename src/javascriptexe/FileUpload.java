package javascriptexe;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1300)");
        
        WebElement fileInput = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
        
        fileInput.sendKeys("C:\\Users\\Admin\\Desktop\\Shiva.jpeg");
        
        
        String file1="C:\\Users\\Admin\\Desktop\\Test1.txt";
        String file2="C:\\Users\\Admin\\Desktop\\Test2.txt";

        WebElement multifileInput = driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));         
        
        multifileInput.sendKeys(file1+"\n"+file2);
        
        Thread.sleep(5000);
        
        driver.quit();

	}

}
