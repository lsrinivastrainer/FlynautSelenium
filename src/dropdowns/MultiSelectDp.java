package dropdowns;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		driver.manage().window().maximize();

		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@multiple='multiple']"));
		Select drpCountry=new Select(drpCountryEle);

		drpCountry.selectByValue("ms1");
		Thread.sleep(2000);
		drpCountry.selectByIndex(2);
		
		System.out.println("First selected option is: "+drpCountry.getFirstSelectedOption().getText());
		drpCountry.deselectByValue("ms4");
		//drpCountry.deselectByIndex(2);


		List<WebElement> web = drpCountry.getAllSelectedOptions();
		for(WebElement x:web){
			System.out.println(x.getText());
		} 
		Thread.sleep(5000);
		
		driver.quit();

	}

}
