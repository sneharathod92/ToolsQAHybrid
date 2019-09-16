package com.clc.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clc.base.BaseClass;

public class ManageGuru99 extends BaseClass{
	
	@FindBy(xpath="//td[contains(text(),'Manger Id : mngr26593')]")
	WebElement managerLabel;
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement Customer;
	
	public ManageGuru99(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyLabel(){
		return  managerLabel.isDisplayed();
	}
	
	public NewCustomer aadCustomer(){
		Customer.click();
		return new NewCustomer();
	}

}
