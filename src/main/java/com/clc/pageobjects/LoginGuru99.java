package com.clc.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clc.base.BaseClass;

public class LoginGuru99 extends BaseClass{
	
	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement userPass;
	
	@FindBy(name="btnLogin")
	WebElement loginbtn;
	
	@FindBy(xpath="//img[@alt='Guru99 Demo Sites']")
	WebElement guruLogo;
	
	
	public LoginGuru99(){
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean guruLogo(){
		return guruLogo.isDisplayed();
	}
	
	public ManageGuru99 login(String uname, String pwd){
		userName.sendKeys(uname);
		userPass.sendKeys(pwd);
		loginbtn.click();
		return new ManageGuru99();
	}

}
