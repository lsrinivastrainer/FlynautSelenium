package windows;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/browser-windows");

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");

	    driver.findElement(By.id("windowButton")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("messageWindowButton")).click();
	    Thread.sleep(3000);
	    
	    
	    String MainWindow = driver.getWindowHandle();
	    System.out.println("Main window handle is " + MainWindow);

	    Set<String> s1 = driver.getWindowHandles();
	    System.out.println("Child window handles are" + s1);
	    
	    Iterator<String> i1 = s1.iterator();
	    
	      while (i1.hasNext()) {
	          String ChildWindow = i1.next();
	          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
	              
	        	  driver.switchTo().window(ChildWindow);
	        	          driver.close();
	        	          Thread.sleep(3000);
	              System.out.println("Child window closed");
	           }
	       }	    
	    
	    driver.quit();

	}

}
