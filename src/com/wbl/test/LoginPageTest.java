package com.wbl.test;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import com.wbl.base.BaseTest;
import com.wbl.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	private LoginPage lp;
	
	@BeforeClass
	public void beforeClass()
	{
		lp = new LoginPage(driver);
	}
	
	@Test
	public void testLoginButton()
	{
		assertEquals(lp.checkLoginButton(),"https://dev.talentscreen.io/#/login");
	}

}
