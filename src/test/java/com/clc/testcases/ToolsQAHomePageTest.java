package com.clc.testcases;

import org.testng.annotations.Test;

import com.clc.base.BaseClass;
import com.clc.pageobjects.ToolsQAHomePage;

public class ToolsQAHomePageTest extends BaseClass {

	@Test
	public void toolsQALogin() throws InterruptedException {
		ToolsQAHomePage qa = new ToolsQAHomePage();
		qa.firstName("Sneha");
		qa.lastName("Rathod");
		qa.gender("Female");
		qa.yearOfExp("2");
		qa.date("25/08/2019");
		qa.profession("Automation Tester");
		qa.autoTool("Selenium Webdriver");
		qa.autoTool("Selenium IDE");
		qa.continents("AF");
		qa.multiContinents("AF");
		qa.multiContinents("AUS");
		qa.commands("Navigation Commands");
		qa.commands("Wait Commands");

	}

}
