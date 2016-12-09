package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wbl.base.BasePage;
import com.wbl.util.WblBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
	public String checkLoginButton()
	{
		//driver.findElement(By.cssSelector(".navbar-btn.btn.btn-primary")).click();
		driver.findElement(WblBy.getByObject("id-username")).sendKeys("sibi");
		driver.findElement(WblBy.getByObject("id-password")).sendKeys("test123");
		driver.findElement(WblBy.getByObject("css-talentscreenbutton")).click();
		return driver.getCurrentUrl();
	}
	

}
