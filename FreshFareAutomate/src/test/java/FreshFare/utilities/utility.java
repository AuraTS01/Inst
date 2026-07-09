package FreshFare.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import java.text.SimpleDateFormat;
import java.util.Date;






public class utility {

	
	
	
	
	
	public static String getinput(String sheetname, String file_path) {
		
		String value ="";
		
		try {
			
			File fl = new File(file_path);
			FileInputStream FIS = new FileInputStream(fl);
			XSSFWorkbook wb = new XSSFWorkbook(FIS);
			XSSFSheet sheet = wb.getSheet(sheetname);
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			
			
			for (int i =0; i < rowCount; i++) {
				
				Row row = sheet.getRow(i);
				

				Cell cel = row.getCell(1);
				
				value = cel.getStringCellValue();
			}
			
			
			XSSFCell cell  = sheet.getRow(0).getCell(0);
			
			Row row = sheet.getRow(1);
			

			Cell cel = row.getCell(1);
			
			value = cel.getStringCellValue();
			
			
			Row rows = sheet.createRow(2);
			
			rows.createCell(0).setCellValue("John");
			
			
			FIS.close();
			
			FileOutputStream fos = new FileOutputStream(file_path);
			
			wb.write(fos);
			wb.close();
			fos.close();
			
			
			
			
			
			return value;
			
			
			
		}catch(Exception e) {
			
		}
		
		return value;
		
		
	}
	
	
	
	public static void generateReport(String msg) {
		
		Reporter.log(msg);
		
	}
	
	public static void takeScreenshot(WebDriver driver, String screenshotname) throws IOException{
		
		
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots/" + screenshotname + "_" + timestamp);
		FileUtils.copyFile(source, destination);
		
		System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
	}
	
	
	
}
