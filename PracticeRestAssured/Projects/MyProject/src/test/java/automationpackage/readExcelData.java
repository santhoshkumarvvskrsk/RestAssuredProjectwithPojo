package automationpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class readExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    WebDriverWait wait;
	    HSSFWorkbook workbook;
	    HSSFSheet sheet;
	    HSSFCell cell;
		//System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver.exe");
//WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		
//	     
//	    wait = new WebDriverWait(driver,30);
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
	
	 // Import excel sheet.
	     File src=new File("F:\\readexcel.xls");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load he workbook.
	    workbook = new HSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(1);
	      
	     for(int i=1; i<=sheet.getLastRowNum(); i++)
	     {
//	    	 driver.get("https://www.amazon.in");
	 	    
//	 	    driver.manage().window().maximize();
	         // Import data for Email.
	    	 System.out.println("in loop");
	         cell = sheet.getRow(i).getCell(0);
	         
	         System.out.println(cell.getStringCellValue());
	     //    driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(cell.getStringCellValue());
//	         driver.findElement(By.id("twotabsearchtextbox")).sendKeys(cell.getStringCellValue());
//	         driver.findElement(By.id("nav-search-submit-button")).click();
	         // Write data in the excel.
//	       FileOutputStream foutput=new FileOutputStream(src);
	         
	        // Specify the message needs to be written.
//	        String message = "pass";
//	        String message1 = "not found";

	       // if(driver.findElement(By.xpath("//[text()='Full Name ']")).isDisplayed())
//	        if(driver.getCurrentUrl().contains(cell.getStringCellValue()))
//	         {
	        // Create cell where data needs to be written.
//	        sheet.getRow(i).createCell(1).setCellValue(message);
//	         }
//	        else
//	        {
//		        sheet.getRow(i).createCell(1).setCellValue(message1);
//
//	        }
	        
	        // Specify the file in which data needs to be written.
//	        FileOutputStream fileOutput = new FileOutputStream(src);
	         
	        // finally write content
//	        workbook.write(fileOutput);
	         
	         // close the file
//	        fileOutput.close();
	
	
	
	
	     }
	
	
	





	}

}
