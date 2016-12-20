package com.wbl.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageDriver {
	
	public PageDriver(ConfigUtils config)
	{
		getDriver(config);
	}
	
	public static WebDriver getDriver(ConfigUtils config)
	{
		WebDriver driver = null;
		
		switch(config.BROWSER){
		
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:/Users/Sibi/git/AutomationTalentScreen/chromedriver.exe");
			driver = new ChromeDriver();
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:/Users/Sibi/git/AutomationTalentScreen/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		default:
			driver = new FirefoxDriver();
			
		}
		driver.get(config.URL);
		return driver;
	}

}
