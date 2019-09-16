package com.clc.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.clc.base.BaseClass;

public class ToolsQAHomePage extends BaseClass {

	public ToolsQAHomePage() {
		PageFactory.initElements(driver, this); //this -current class object
//		or
//		PageFactory.initElements(driver, ToolsQAHomePage.class);

	}

	@FindBy(name = "firstname")
	WebElement firstName;

	@FindBy(id = "lastname")
	WebElement lastName;

	@FindBy(name = "sex")
	List<WebElement> genders;

	@FindBy(name = "exp")
	List<WebElement> yearOfExp;

	@FindBy(id = "datepicker")
	WebElement date;

	@FindBy(name = "profession")
	List<WebElement> profession;

	@FindBy(name = "tool")
	List<WebElement> automationTool;

	@FindBy(id = "continents")
	WebElement continents;

	@FindBy(id = "continentsmultiple")
	WebElement multiContinents;

	@FindBy(name = "selenium_commands")
	WebElement commands;

	public void firstName(String fname) {
		firstName.sendKeys(fname);

	}

	public void lastName(String lname) {
		lastName.sendKeys(lname);
	}

	public void gender(String type) {
		for (WebElement gender : genders) {
			if (gender.getAttribute("value").equals(type)) {
				gender.click();
				break;
			}
		}

	}

	public void yearOfExp(String exp) {
		for (WebElement expp : yearOfExp) {
			if (expp.getAttribute("value").equals(exp)) {
				expp.click();
			}

		}

	}

	public void date(String datee) {
		date.sendKeys(datee);
	}

	public void profession(String proff) {
		for (WebElement prof : profession) {
			if (prof.getAttribute("value").equals(proff)) {
				prof.click();
			}
		}

	}

	public void autoTool(String tools) {
		for (WebElement tool : automationTool) {
			if (tool.getAttribute("value").equals(tools)) {
				tool.click();

			}

		}
	}

	public void continents(String conti) {
		Select s = new Select(continents);
		s.selectByValue(conti);
	}

	public void multiContinents(String conti) {
		Select s = new Select(multiContinents);
		s.selectByValue(conti);

	}

	public void commands(String type) {
		Select s = new Select(commands);
		s.selectByVisibleText(type);

	}

}
