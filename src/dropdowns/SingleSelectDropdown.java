package dropdowns;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Select drpCountry=new Select(drpCountryEle);
		
		//drpCountry.selectByIndex(2);
		//drpCountry.selectByValue("france");
		//drpCountry.selectByVisibleText("India");
		drpCountry.selectByContainsVisibleText("Kingdom");
		
//		List<WebElement> web = drpCountry.getAllSelectedOptions();
//		for(WebElement x:web){
//			System.out.println(x.getText());
//		} 

		
		List<WebElement> options=drpCountry.getOptions();
		System.out.println("Number of options in a drop down:"+options.size()); 

		for(int i=0;i<options.size();i++)
		{
			//System.out.println(options.get(i).getText());
			System.out.println(options.get(i).getDomAttribute("value"));

		}
		
		
		System.out.println("is multiple dropdown?  "+drpCountry.isMultiple());
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
