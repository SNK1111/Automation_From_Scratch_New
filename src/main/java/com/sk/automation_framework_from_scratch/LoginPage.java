package com.sk.automation_framework_from_scratch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	By userName = By.xpath("//*[@id='userId-text-input-field']");
    By passWord = By.xpath("//*[@id='password-text-input-field']");

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	  public void enterUsername(String username) {
	    	driver.findElement(userName).sendKeys("Username123");
	    }
	    public void enterPassword(String password){
	    	driver.findElement(passWord).sendKeys("Password123");
	    }        

}
