package FreshFare.drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import FreshFare.utilities.utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import FreshFare.utilities.utility;
import java.io.IOException;


public class webdriver {
	
	
//	static String chromebrowserType = "webdriver.chrome.driver";
//	static String browserPath = "";
//	
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static void setup(String browser) throws IOException{
		
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--start-maximized");
			
			
			driver.set(new ChromeDriver(options));
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			
			EdgeOptions options = new EdgeOptions();
			
			options.addArguments("--start-maximized");
			
			
			driver.set(new EdgeDriver(options));
			
		}
		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public static WebDriver getDriver() {
		
		String URL = "";
		
		return driver.get(URL);
		
	}
	
	
	public static void quitDriver() {
		
		
		if(driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}

}
