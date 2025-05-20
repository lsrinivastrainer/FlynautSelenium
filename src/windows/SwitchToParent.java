package windows;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchToParent {

	public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        
        driver.findElement(By.id("windowButton")).click();
        
        String mainwindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        
        while (i1.hasNext()) {
            String childWindow = i1.next();
            if (!mainwindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
                String childTitle = driver.getTitle();
                System.out.println(childTitle);
                
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
                driver.close();
                System.out.println("Child window closed");
                Thread.sleep(3000);

        }
        }
        
        driver.switchTo().window(mainwindow);
      
        String parentTitle = driver.getTitle();
        System.out.println(parentTitle);

        
        driver.quit();

	}

}
