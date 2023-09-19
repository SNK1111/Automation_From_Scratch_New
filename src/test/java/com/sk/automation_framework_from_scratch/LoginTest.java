package com.sk.automation_framework_from_scratch;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sk.automation_framework_from_scratch.LoginPage;

public class LoginTest extends BaseTest {

	private WebDriver driver;
    private LoginPage loginPage;

    @BeforeTest
    public void setUp() throws IOException {
    	driver = getDriver();
        driver.get("https://secure02ea.chase.com/web/auth/#/logon/logon/chaseOnline?treatment=chase&lang=en");
    	//driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void validLoginTest() {
    	
    	loginPage.enterUsername("user123");
    	loginPage.enterPassword("password123");

        // Add assertions and verifications for a successful login
    }

    @AfterTest
    public void discontinueBrowser() {
        if (driver != null) 
    	{
            driver.quit();
        }
    }

}
