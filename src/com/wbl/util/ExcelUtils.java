package com.wbl.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static Logger log = Logger.getLogger(ExcelUtils.class);
	private static final String DATA_FILE_PATH="C:/Users/Sibi/git/AutomationTalentScreen/Resources/Test-Data/";
	
	public static Object[][] getData(String filename)
	{
		Object[][] rowsData = null;
		

		log.info("In ExcelUtils - getData for file::"+filename);
		
		try {
			XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(DATA_FILE_PATH+filename+".xlsx"));
			XSSFSheet sheet = wb.getSheetAt(0);
			int noOfRows = sheet.getLastRowNum()+1;
			rowsData = new Object[noOfRows-1][];
			for(int i =1;i<noOfRows;i++){
				
				Row row = sheet.getRow(i);
				int noOfColumns = row.getLastCellNum();
				String[] colData = new String [noOfColumns];
				for(int j=0;j<noOfColumns;j++){
					Cell cell = row.getCell(j);
					colData[j]= cell.getStringCellValue();
				}
				rowsData[i-1]= colData;
			}
			
		//wb.close();
		} catch (IOException e) {
		
			log.error(e);
		}
			
		return rowsData;
	}

}
