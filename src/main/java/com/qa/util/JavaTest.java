package com.qa.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class JavaTest {
	
	int a;
	String str;
	
	public static void main(String arg[]) throws Exception{
		
		JavaTest jt = new JavaTest();
		jt.a = 20;
		jt.str = "rahul";
		System.out.println(jt.a);
		System.out.println(jt.str);
		
		//TestUtil test = new TestUtil();
		
		Object getdata[][]= TestUtil.excelData("myprofile");
		
		System.out.println(getdata.length);
		
		
		for (Object objects : getdata) {
			System.out.println(objects.toString());
		}
		

	/*	File excelSheet = new File("C:\\Users\\9kangr2\\Desktop\\SimpleMaven\\src\\main\\java\\com\\qa\\testdata\\ProfileData.xlsx");

		FileInputStream fis = new FileInputStream(excelSheet);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("myprofile");

		Object data[][] = new Object[sh.getLastRowNum()][sh.getRow(0)
				.getLastCellNum()];

		for (int i = 0; i < sh.getLastRowNum(); i++) {
			for (int j = 0; j < sh.getRow(0).getLastCellNum(); j++) {
				System.out.println(data[i][j] = sh.getRow(i + 1).getCell(j).toString());
			}
		}*/


		
		
		
	}

}
