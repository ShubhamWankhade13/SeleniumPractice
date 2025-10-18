package SeleniumAllMethods;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/DataSheet/Employee_Details.numbers");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int TotalRows=sheet.getLastRowNum();
		
		int TotalCell =sheet.getRow(1).getLastCellNum();
		
		System.out.println(TotalRows);
		System.out.println(TotalCell);
		
	}

}
