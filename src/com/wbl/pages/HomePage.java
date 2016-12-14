package com.wbl.pages;

import org.openqa.selenium.WebDriver;
import com.wbl.base.BasePage;
import com.wbl.util.WblBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		}

	public boolean isLogoPresent()
	{
		
		boolean isLogoPresent = driver.findElement(WblBy.getByObject("css-logo")).isDisplayed()? true:false;
		return isLogoPresent;
	}
	
	public String checkCurrentUrl()
	{
		return driver.getCurrentUrl();
		//driver.findElement(By.cssSelector(".navbar-btn.btn.btn-primary")).click();
		//return driver.getCurrentUrl();
	}

}
