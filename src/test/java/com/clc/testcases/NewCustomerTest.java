package com.clc.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.clc.base.BaseClass;
import com.clc.pageobjects.LoginGuru99;
import com.clc.pageobjects.ManageGuru99;
import com.clc.pageobjects.NewCustomer;
import com.clc.utility.Utility;

public class NewCustomerTest extends BaseClass {
	LoginGuru99 loginpg;
	ManageGuru99 manage99;
	NewCustomer newCust;
	Utility util;

	public NewCustomerTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpg = new LoginGuru99();
		manage99 = new ManageGuru99();
		newCust = new NewCustomer();
		util = new Utility();
		manage99 = loginpg.login(prop.getProperty("username"), prop.getProperty("userpassword"));
	}

	@Test(priority = 1)
	public void verifyManagerPgtitle() {
		String str = manage99.verifyTitle();
		Assert.assertEquals(str, "Guru99 Bank Manager HomePage");
	}

	@Test(priority = 2)
	public void verifyTitle() {
		newCust = manage99.aadCustomer();
		String str = newCust.verifyPageTitle();
		Assert.assertEquals(str, "Guru99 Bank New Customer Entry Page");
	}

	@Test(priority = 3)
	public void addNewCustomer() {
		newCust.txtname("Sneha");
		newCust.txtgender("f");
		newCust.txtbirthDate("09", "20", "1992");
		newCust.txtaddress("karve nagar");
		newCust.txtcity("pune");
		newCust.txtstate("maharashtra");
		newCust.txtpinNo("411052");
		newCust.txtphoneNum("7709352463");
		String email = util.randomStringGenerator()+"@gmail.com";
		newCust.txtemailId(email);
		newCust.txtpassword("abc@342");
		newCust.txtsublimt();
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		Assert.assertTrue(res);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
