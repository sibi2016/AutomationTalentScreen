package com.wbl.test;

import org.testng.annotations.*;
import static org.testng.Assert.*;

import org.apache.log4j.Logger;

import com.wbl.base.BaseTest;
import com.wbl.pages.LoginPage;
import com.wbl.util.ExcelUtils;
import com.wbl.util.TakeScreenshotUtil;

public class LoginPageTest extends BaseTest {
	
	private LoginPage lp;
	private static Logger log = Logger.getLogger(LoginPageTest.class);
	
	@BeforeClass
	public void beforeClass()
	{
		lp = new LoginPage(driver);
	}
	
	@DataProvider(name="login-data")
	public Object[][] getLoginData()
	{
		Object[][] data = ExcelUtils.getData("login");
		
		return data;
	}
	
	@Test(dataProvider="login-data")
	public void testLoginButton(String uname,String pwd,String expected)
	{
		log.info("Testing login-data....");
		assertEquals(lp.checkLoginButton(uname,pwd),expected);
		TakeScreenshotUtil.takeScreenshot(driver, "userlogin");
	}

}
