package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.wbl.util.ConfigUtils;
import com.wbl.util.PageDriver;

public abstract class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		ConfigUtils config = new ConfigUtils();
		this.driver = PageDriver.getDriver(config);
		
	}

}
