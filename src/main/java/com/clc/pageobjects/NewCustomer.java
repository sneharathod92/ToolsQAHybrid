package com.clc.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.clc.base.BaseClass;

public class NewCustomer extends BaseClass {
	
	
	@FindBy(name="name")
	WebElement uname;
	
	@FindBy(name="rad1")
	List<WebElement> genders;
	
	@FindBy(id="dob")
	WebElement birthdate;
	
	@FindBy(name="addr")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pin;
	
	@FindBy(name="telephoneno")
	WebElement phone;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="sub")
	WebElement submit;
	
	public NewCustomer(){
		PageFactory.initElements(driver, this);
	}
	
	public void txtname(String unme){
		uname.sendKeys(unme);
	}
	
	public void txtgender(String type){
			System.out.println("inside select Gender method" +type);
			
			for (WebElement gender : genders) {
				if(gender.getAttribute("value").equals(type)){
					gender.click();
					break;
				}
			}
			
	}
	
	public void txtbirthDate(String mm,String dd, String yyyy){
		birthdate.sendKeys(mm);
		birthdate.sendKeys(dd);
		birthdate.sendKeys(yyyy);
	}
	
	public void txtaddress(String addr){
		address.sendKeys(addr);
	}
	
	public void txtcity(String cityy){
		city.sendKeys(cityy);
	}
	
	public void txtstate(String stat){
		state.sendKeys(stat);
	}
	
	public void txtpinNo(String pinno){
		pin.sendKeys(pinno);
	}
	
	public void txtphoneNum(String phoneNum){
		phone.sendKeys(phoneNum);
	}
	
	public void txtemailId(String emailId){
		email.sendKeys(emailId);
	}
	
	public void txtpassword(String pass){
		password.sendKeys(pass);
	}
	
	public void txtsublimt(){
		submit.click();
	}
	public String verifyPageTitle(){
		return driver.getTitle();
	}
	
}
