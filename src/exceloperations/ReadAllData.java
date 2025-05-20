package exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream("./testdata/TestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
		XSSFSheet sheet= workbook.getSheet("Student");

        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
        for(int i=0;i<=rowCount;i++){
        	int cellcount=sheet.getRow(i).getLastCellNum();
        	   //System.out.println("Row"+ i+" data is :");
        	   
               for(int j=0;j<cellcount;j++){
                   System.out.print(sheet.getRow(i).getCell(j).toString() +"\t");
               }
               System.out.println();

        }
		
	}

}
