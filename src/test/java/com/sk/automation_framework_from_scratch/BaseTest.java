package com.sk.automation_framework_from_scratch;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	private WebDriver driver;
	protected String fileInputStream = "D://Eclips Data//Maven2//AutomationFromScratch//src//main//resources//data.properties";
	
	@BeforeSuite
	public void beforeSuite() throws IOException{
		Properties properties=new Properties();
		FileInputStream fis=new FileInputStream(fileInputStream);
		properties.load(fis);
		String browserName=properties.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", properties.getProperty("chromePath"));
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")) 
		{
			
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equals("IE"))
		{
		    driver=new InternetExplorerDriver();
		}
		
		
	}
	@AfterTest
	public void afterSuite() {
		if(null!=driver)
		{
			driver.close();
			driver.quit();
		}
	}
	public WebDriver getDriver()
	{
		return driver;
	}

}
