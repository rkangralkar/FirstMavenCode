package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.qa.Base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT = 20;
	
	// public static String Sheetname;

	//public static String SHEET_PATH = "";

	public static void takeScreenShot(String path) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


	public static Object[][] excelData(String SheetName) throws Exception {

		// TestUtil.Sheetname=SheetName;

		File excelSheet = new File("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\src\\main\\java\\com\\qa\\testdata\\ProfileData.xlsx");

		FileInputStream fis = new FileInputStream(excelSheet);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("myprofile");

		Object data[][] = new Object[sh.getLastRowNum()][sh.getRow(0)
				.getLastCellNum()];

		for (int i = 0; i < sh.getLastRowNum(); i++) {
			for (int j = 0; j < sh.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sh.getRow(i + 1).getCell(j).toString();
				System.out.println(data[i][j] = sh.getRow(i + 1).getCell(j).toString());
			}
		}
		//wb.close();
		return data;
	}
	
	
	public static void scrollToElement(WebElement element){
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
		
	}

}
