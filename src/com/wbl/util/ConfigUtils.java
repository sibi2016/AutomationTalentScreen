package com.wbl.util;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
	private static final String CONFIG_FILE="D:/Projects/AutomationTalentScreen/Resources/Config.properties";
	
	
	public String BROWSER;
	public String URL;
	
	public ConfigUtils()
	{
		Properties prop = new Properties();
		try {
			prop.load(new FileReader(CONFIG_FILE));
			BROWSER = (String)prop.get("browser");
			URL = (String)prop.get("url");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
