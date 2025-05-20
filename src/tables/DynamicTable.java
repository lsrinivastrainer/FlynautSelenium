package tables;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicTable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//1) find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size(); //
		System.out.println("Number of rows: "+rows);
				
		//2) find total number of columns in a table
		int cols=driver.findElements(By.xpath("//table[@id='taskTable']//th")).size(); //single table
		System.out.println("Number of Columns: "+cols);
		
		for(int c=1; c<=cols-1; c++) {
			String process = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+c+"]//td[1]")).getText();
			//System.out.println(process);
			
			if(process.equals("Chrome")) {
				for (int m=1; m<=cols; m++) {
				String columnName = driver.findElement(By.xpath("//table[@id='taskTable']//tr[1]//th["+m+"]")).getText();
				//System.out.println(columnName);
				
					if(columnName.contains("CPU")) {
						String actualCPUPercentage = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+c+"]//td["+m+"]")).getText();
						System.out.println("Actual CPU% is: "+actualCPUPercentage);
						
						//6. Get the expected CPU% from the message
						String expCPUPercentage=driver.findElement(By.xpath("//strong[@class=\"chrome-cpu\"]")).getText();
						System.out.println("Exp CPU% is: "+expCPUPercentage);
						
						if(actualCPUPercentage.equals(expCPUPercentage)) {
							System.out.println("TC passed");
						}else {
							System.out.println("TC is failed");
						}


					}
				}
			}

		
		}

		
		
		
		
		
		
		
		//driver.quit();
		
	}

}
