package exceloperations;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class LoginExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	      FileInputStream fis = new FileInputStream(new File("./testdata/Login.xlsx"));
          Workbook workbook = new XSSFWorkbook(fis);
          Sheet sheet = workbook.getSheetAt(0); // Get first sheet
          Row row = sheet.getRow(1); // Read first data row (assuming headers in row 0)
          String username = row.getCell(0).getStringCellValue();
          String password = row.getCell(1).getStringCellValue();
          
          WebDriver driver = new ChromeDriver();
          driver.get("https://practicetestautomation.com/practice-test-login/"); 
          // Perform login using data from Excel
          driver.findElement(By.id("username")).sendKeys(username);
          driver.findElement(By.id("password")).sendKeys(password);
          driver.findElement(By.id("submit")).click();

          Thread.sleep(3000);
          System.out.println("Logged in successfully");
          
          driver.quit();

	}

}
