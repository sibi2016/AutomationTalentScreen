package com.wbl.util;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshotUtil {
	
	public static void takeScreenshot(WebDriver driver, String screenShotName){
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"/Screenshots/"+screenShotName+".png"));
			
		} catch (IOException e) {
			
			System.out.println("Exception while taking screen shot"+e.getMessage());
		}
		
	}

}
