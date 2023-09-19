package com.sk.automation_framework_from_scratch;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}

}
