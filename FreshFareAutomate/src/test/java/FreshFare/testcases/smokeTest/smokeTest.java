package FreshFare.testcases.smokeTest;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import FreshFare.pages.login.loginPage;
import FreshFare.pages.login.createAccount;
import FreshFare.base.BaseTest;
import FreshFare.drivers.webdriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import FreshFare.utilities.utility;

public class smokeTest {

	
	static WebDriver driver;
	
	@BeforeTest
	public static void initialize() throws IOException {
		utility.generateReport("Initialize the Browser and other utility items");
		
		BaseTest.setup("chrome");
	
	}
	
	@Test(priority=2)
	public static void TC01() throws IOException {
		
		utility.generateReport("This is TC01 is started for executions");
		loginPage.enter_email(driver, "new@gmail.com");
		loginPage.enter_password(driver, "Password");
		loginPage.Click_loginButton(driver);
		utility.generateReport("This is TC01 Passed");
		utility.takeScreenshot(driver,"TC01");
	}
	
	@Test(priority=1)
	public static void TC02() throws IOException {
		
		loginPage.enter_email(driver, "new@gmail.com");
		loginPage.enter_password(driver, "Password");
		loginPage.Click_loginButton(driver);
	}
	
	
	@AfterTest
	public static void quit() {
		BaseTest.teardown();
	}
	
	
}
