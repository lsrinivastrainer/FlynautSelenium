package dropdowns;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class BootstrapDP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); 
		
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		//driver.findElement(By.xpath("//input[@value='Python']")).click();
		
		
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
//		System.out.println("Number of options:"+options.size()); 
//		
//		for(WebElement op:options) {
//			System.out.println(op.getText());
//			}


		for(WebElement op:options) {
			String option=op.getText();
			if(option.equals("Java")|| option.equals("Python")|| option.equals("MySQL")) {
			op.click();
			}
		}

		
		
		
		
		
		Thread.sleep(5000);
		
		driver.quit();


	}

}
