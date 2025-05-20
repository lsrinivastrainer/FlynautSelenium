package tables;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WithoutTableTag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");

List<WebElement> tRows = driver.findElements(By.xpath("//div[@class=\"rt-tr\"]"));
	for(int i=0;i<tRows.size();i++){
		List<WebElement> tData = driver.findElements(By.xpath("//div[@class=\"rt-td\"]"));
			
			for(int j=0;j<tData.size();j++){
				if(tData.get(j).getText().equals("Vega")){
					System.out.println(tData.get(j).getText()); 
				}
			}}



			}

}
