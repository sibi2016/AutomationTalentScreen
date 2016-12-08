package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.wbl.base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		}

	public boolean isLogoPresent()
	{
		
		boolean isLogoPresent = driver.findElement(By.cssSelector(".tslogo")).isDisplayed()? true:false;
		return isLogoPresent;
	}
	
	public String checkCurrentUrl()
	{
		return driver.getCurrentUrl();
		//driver.findElement(By.cssSelector(".navbar-btn.btn.btn-primary")).click();
		//return driver.getCurrentUrl();
	}

}
