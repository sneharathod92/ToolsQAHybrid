package com.clc.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.clc.base.BaseClass;
import com.clc.pageobjects.ManageGuru99;
import com.clc.pageobjects.LoginGuru99;

public class LoginGuru99Test extends BaseClass {

	ManageGuru99 dashboard;
	LoginGuru99 loginpg;
	

	public LoginGuru99Test() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		loginpg = new LoginGuru99();

	}
	@Test(priority=1)
	public void verifyLogo(){
		boolean result=loginpg.guruLogo();
		Assert.assertTrue(result);
		
	}
	@Test(priority=2)
	public void loggedIn() {
		
		dashboard = loginpg.login(prop.getProperty("username"), prop.getProperty("userpassword"));

	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}

}
