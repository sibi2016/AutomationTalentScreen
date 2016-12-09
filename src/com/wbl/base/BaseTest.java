package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.wbl.util.ConfigUtils;
import com.wbl.util.PageDriver;
import com.wbl.util.WblBy;

public abstract class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		ConfigUtils config = new ConfigUtils();
		WblBy.loadProperties();
		this.driver = PageDriver.getDriver(config);
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		driver.quit();
	}

}
