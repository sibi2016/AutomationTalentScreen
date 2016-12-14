package com.wbl.util;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static final String DATA_FILE_PATH="C:/Users/Sibi/git/AutomationTalentScreen/Resources/Test-Data/";
	
	public static Object[][] getData(String filename)
	{
		Object[][] data = null;
		
		File file = new File(DATA_FILE_PATH+filename+".xlsx");
		System.out.println("hiiii");
		
		try {
			XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
			XSSFSheet sheet = wb.getSheet("Sheet1");
			System.out.println(sheet.getLastRowNum());
			int noOfRows = sheet.getLastRowNum()+1;
			int k =0;
			int l = 0;
			data = new Object[noOfRows-1][];
			for(int i =1;i<noOfRows;i++){
				
				XSSFRow row = sheet.getRow(i);
				System.out.println(row.getLastCellNum());
				int noOfColumns = row.getLastCellNum()+1;
				for(int j=0;j<noOfColumns;j++){
					XSSFCell cell = row.getCell((short)j);
					data[k][l]= cell.getStringCellValue();
					l++;
				}
			k++;
			}
		wb.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		return data;
	}

}
