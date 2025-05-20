package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();

	      // URL launch for accessing drag and drop elements
	      driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
	      
	      WebElement sourceElement= driver.findElement(By.id("draggable"));
	      WebElement targetElement= driver.findElement(By.id("droppable"));
	      
	      Actions a = new Actions(driver);
	      a.dragAndDrop(sourceElement, targetElement).build().perform();
	      
	      WebElement text = driver.findElement(By.xpath("//*[@id='droppable']/p"));
	      System.out.println("Text is : " + text.getText());

	      Thread.sleep(5000);

	      // quitting browser after drag and drop operations completed
	      driver.quit();

	      


	}

}
