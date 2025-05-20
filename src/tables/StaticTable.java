package tables;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows: "+rows);
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //single table
		System.out.println("Number of cols: "+cols);
		
		/*
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
			String value =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value+"\t");
			}
			System.out.println();
		}
		*/
		
		
		
		int total=0;
		for(int r=2; r <= rows; r++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total=total+Integer.parseInt(price);
		}
		System.out.println("Total Price of the books: "+total);
		
		
		driver.quit();
	}

}
