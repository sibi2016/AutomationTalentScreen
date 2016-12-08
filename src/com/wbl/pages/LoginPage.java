package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wbl.base.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
	public String checkLoginButton()
	{
		//driver.findElement(By.cssSelector(".navbar-btn.btn.btn-primary")).click();
		driver.findElement(By.id("username")).sendKeys("sibi");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		return driver.getCurrentUrl();
	}
	

}
