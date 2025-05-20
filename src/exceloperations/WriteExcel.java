package exceloperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("./testdata/TestData2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("TestData");
//        XSSFRow row = sheet.createRow(0);
//        	row.createCell(0).setCellValue("Username");
//        	row.createCell(1).setCellValue("Password");
//        	
//         XSSFRow row1 = sheet.createRow(1);
//            row1.createCell(0).setCellValue("admin");
//            row1.createCell(1).setCellValue("admin123");

        XSSFRow row=sheet.createRow(3);
        XSSFCell cell=row.createCell(4);
        cell.setCellValue("WELCOME");

        
            workbook.write(fos);
            System.out.println("Excel file written successfully!");
	}

}
