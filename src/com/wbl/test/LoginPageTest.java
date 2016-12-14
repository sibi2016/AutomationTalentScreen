package com.wbl.test;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import com.wbl.base.BaseTest;
import com.wbl.pages.LoginPage;
import com.wbl.util.ExcelUtils;

public class LoginPageTest extends BaseTest {
	
	private LoginPage lp;
	
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
		assertEquals(lp.checkLoginButton(uname,pwd),expected);
	}

}
