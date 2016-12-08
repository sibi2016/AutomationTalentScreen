package com.wbl.test;

import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;
import static org.testng.Assert.*;

import org.testng.annotations.*;
public class HomePageTest extends BaseTest {
	
	private HomePage hm;
	
	@BeforeClass
	public void beforeClass()
	{
		hm = new HomePage(driver);
	}
	
	@Test
	public void testLogoPresent()
	{
		assertTrue(hm.isLogoPresent());
	}
	
	@Test
	public void testCurrentUrl()
	{
		assertEquals(hm.checkCurrentUrl(),"https://dev.talentscreen.io/#/website-pages/home");
	}

}
