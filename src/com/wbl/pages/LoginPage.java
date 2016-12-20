package com.wbl.pages;


import org.openqa.selenium.WebDriver;

import com.wbl.base.BasePage;
import com.wbl.util.WblBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
	public String checkLoginButton(String uname,String pwd)
	{
		//driver.findElement(By.cssSelector(".navbar-btn.btn.btn-primary")).click();
		driver.navigate().refresh();
		driver.findElement(WblBy.getByObject("id-username")).sendKeys(uname);
		driver.findElement(WblBy.getByObject("id-password")).sendKeys(pwd);
		driver.findElement(WblBy.getByObject("css-talentscreenbutton")).click();
		return driver.getCurrentUrl();
	}
	

}
