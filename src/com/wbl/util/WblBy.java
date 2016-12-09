package com.wbl.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class WblBy {
	
	private static final String LOCATORS_FILE="C:/Users/Sibi/git/AutomationTalentScreen/Resources/Locators.properties";
	public static Properties prop;
	
	public static void loadProperties()
	{
		prop = new Properties();
		try {
			prop.load(new FileReader(LOCATORS_FILE));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static By getByObject(String locatorkey)
	{
		By by = null;
		
		String value = prop.getProperty(locatorkey);
		
		if(locatorkey.startsWith("css"))
		{
			by = By.cssSelector(value);
		}
		else if(locatorkey.startsWith("id"))
		{
			by = By.id(value);
		}
		else if(locatorkey.startsWith("xpath"))
		{
			by = By.xpath(value);
		}
		else if(locatorkey.startsWith("classname"))
		{
			by = By.className(value);
		}
		else if(locatorkey.startsWith("name"))
		{
			by = By.name(value);
		}
		else if(locatorkey.startsWith("link"))
		{
			by = By.linkText(value);
		}
		else if(locatorkey.startsWith("partial"))
		{
			by = By.partialLinkText(value);
		}
		else if(locatorkey.startsWith("tag"))
		{
			by = By.tagName(value);
		}
		return by;
	}

}
