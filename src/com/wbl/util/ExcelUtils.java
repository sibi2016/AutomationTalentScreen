package com.wbl.util;

import java.io.File;

public class ExcelUtils {
	
	private static final String DATA_FILE_PATH="C:/Users/Sibi/git/AutomationTalentScreen/Resources/Test-Data";
	
	public static Object[][] getData(String filename)
	{
		File file = new File(DATA_FILE_PATH+filename);
		
		Object[][] data = null;
		
		return data;
	}

}
