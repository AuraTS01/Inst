package FreshFare.base;

import FreshFare.drivers.webdriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	
	
	
	@Parameters("browser")
	@BeforeMethod
	public static void setup(String browser) throws IOException {
		webdriver.setup(browser);
		
		
	}

	
	@AfterMethod
	public static void teardown() {
		
		webdriver.quitDriver();
	}
}
