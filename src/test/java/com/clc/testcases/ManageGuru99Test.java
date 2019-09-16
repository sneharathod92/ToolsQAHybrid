package com.clc.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.clc.base.BaseClass;
import com.clc.pageobjects.LoginGuru99;
import com.clc.pageobjects.ManageGuru99;
import com.clc.pageobjects.NewCustomer;

public class ManageGuru99Test extends BaseClass {
	LoginGuru99 loginpg;
	NewCustomer newcust;
	ManageGuru99 manage99;

	public ManageGuru99Test() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpg = new LoginGuru99();
		newcust = new NewCustomer();
		manage99 = new ManageGuru99();
		manage99 = loginpg.login(prop.getProperty("username"), prop.getProperty("userpassword"));
	}

	@Test(priority = 1)
	public void verifyPgTitle() {
		String result = manage99.verifyTitle();
		Assert.assertEquals(result, "Guru99 Bank Manager HomePage", "title not matched");
	}

	@Test(priority = 2)
	public void verifyManagerLabel() {
		Assert.assertTrue(manage99.verifyLabel());
	}

	@Test(priority = 3)
	public void newCustomer() {
		newcust = manage99.aadCustomer();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
