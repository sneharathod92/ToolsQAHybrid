package com.clc.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public BaseClass(){
		File file=new File("E:\\New EclipseWorkspace\\Hybrid-ToolsQA\\src\\main\\java\\com\\clc\\config\\config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			 prop=new Properties();
				prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void initialization(){
		String chroPath=prop.getProperty("chromePath");
		System.setProperty("webdriver.chrome.driver",chroPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("guru99"));
		
	}
	
	

}
