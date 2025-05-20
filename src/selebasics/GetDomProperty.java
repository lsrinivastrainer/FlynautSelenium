package selebasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetDomProperty {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("http://www.adactin.com/HotelApp/index.php"); 
		driver.findElement(By.id("username1")).sendKeys("Sreenivas"); 
		driver.findElement(By.id("password")).sendKeys("pass123"); 

		String actualName = driver.findElement(By.id("username")).getDomProperty("value"); 
		String actualPwd = driver.findElement(By.id("password")).getDomProperty("value");
		
		String expName ="Sreenivas";
		System.out.println("Actual name is: "+actualName);

		if(actualName.equals(expName)) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}		
		
		
		String impMessage= driver.findElement(By.xpath("//td[@class='build_title']")).getText();
		System.out.println("Actual message is: "+impMessage);
		
		driver.quit();
		
	}
}
