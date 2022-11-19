package reusableClasses;

import java.io.File;
import java.io.FileInputStream;
 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadInputData {

	XSSFWorkbook wb;
	 XSSFSheet sheet;
	 
	 public ReadInputData(String excelPath)
	 {
		 try
		 {
		 File src = new File(excelPath);
		 FileInputStream fis = new FileInputStream(src);
		 wb = new XSSFWorkbook(fis);
		 }
		 catch(Exception e)
		 {
		 System.out.println(e.getMessage());
		 }
	 }
	 public String getData(int sheetnumber, int row, int column)
	 {
	 sheet = wb.getSheetAt(sheetnumber);
	 try {
	 String data = sheet.getRow(row).getCell(column).getStringCellValue();
	 return data;
	 }catch(Exception e) {
		double data1 =   sheet.getRow(row).getCell(column).getNumericCellValue();
		String s =  String.valueOf(data1);
		return s;
	 }
	 
	 }
	 public int getRowCount(int sheetIndex)
	 {
	 int row = wb.getSheetAt(sheetIndex).getLastRowNum();
	 row = row + 1;
	 return row;
	 }
}
