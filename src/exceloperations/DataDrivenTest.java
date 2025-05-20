package exceloperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream inputStream = new FileInputStream("./testdata/RegisterForm.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=wb.getSheet("Student");
        
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Identify the WebElements for the student registration form
        WebElement firstName=driver.findElement(By.id("firstName"));
        WebElement lastName=driver.findElement(By.id("lastName"));
        WebElement email=driver.findElement(By.id("userEmail"));
        WebElement genderMale= driver.findElement(By.id("gender-radio-1"));
        WebElement mobile=driver.findElement(By.id("userNumber"));
        WebElement address=driver.findElement(By.id("currentAddress"));

        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(300);
        WebElement submitBtn=driver.findElement(By.id("submit"));

        for(int i=1;i<=rowCount;i++) {
            //Enter the values read from Excel in firstname,lastname,mobile,email,address
            firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
            lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
            mobile.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
            address.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());

            js.executeScript("arguments[0].click();", genderMale);
            Thread.sleep(5000);
            //Click on submit button
            submitBtn.click();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Thanks for submitting the form']")));
    		WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));

    		XSSFCell cell = sheet.getRow(i).createCell(5);
    		
            if (confirmationMessage.isDisplayed()) {
                // if the message is displayed , write PASS in the excel sheet
                cell.setCellValue("PASS");
                
            } else {
                //if the message is not displayed , write FAIL in the excel sheet
                cell.setCellValue("FAIL");
            }
            
            FileOutputStream outputStream = new FileOutputStream("./testdata/RegisterForm.xlsx");
            wb.write(outputStream);

            WebElement closebtn = driver.findElement(By.xpath("//button[@id='closeLargeModal']"));

            js.executeScript("arguments[0].click();", closebtn);
        }
        //Close the workbook
        wb.close();
        
        //Quit the driver
        driver.quit();

    		
	}

}
