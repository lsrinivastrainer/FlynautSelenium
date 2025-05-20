package exceloperations;
import org.apache.poi.xssf.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Workbook -> sheet -> row -> cell
		
		File file = new File("./testdata/TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
		XSSFSheet sheet= workbook.getSheet("Student");
		
		//XSSFSheet sheet= workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(2);
        XSSFCell cell=row.getCell(4);
		
        String address= cell.toString();
        
        System.out.println(address);
        
        
	}

}
