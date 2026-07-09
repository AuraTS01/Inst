package FreshFare.pages.login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import FreshFare.utilities.utility;

import org.openqa.selenium.interactions.Actions;



public class loginPage {
	
	
	
//	Locators --> Identification of Properties --> ID, Name, Class, Xpath, Tagname, CssSelectors
	static String _username_textbox_id = "email";
	static String _password_textbox_name = "password";
	static String _login_button_class = "btn btn-primary w-100";
	static String _reason_dropdown_name = "reason_select";
	static String _EnterReason_textbox_xpath = "//*[@placeholder='Enter reason' and @name='reason_input']";
	static String _update_button_xpath = "//table[contains(@id,'companyTable')]//*[contains(text(),'[%s]')]//parent::tr//*[contains(text(),'Update')]";
	static String _AccountAndList_Mouseover_xpath = "//*[@data-nav-ref='nav_ya_signin']";
	
	
	
//	., *. ./ --> Regular expressions
	
//	. --> Folder
//	* --> text
//	./ --> Folder structure
	
	
//	xpath --> absolute, Relative
//	xpath axes --> Contains, Starts-with, Parent, Following-sibling, ancestor
	
	
//	//*[contains(text(),'RAM BROILER'S')]
	
//	//*[contains(@placeholder, 'reason')]
	
//	absolute (/)--> immediate next to the previous element
//	relative (//)--> where you dont know
	
	
//	//input[@placeholder='Enter reason']
//	static String _createAccount_link_
	
	
	public static void enter_email(WebDriver driver, String email) throws IOException {
		
		
		try {
			WebElement element =  driver.findElement(By.id(_username_textbox_id));
			element.sendKeys(email);
			utility.generateReport("The Element is visible from Enter_email Method and the data is passed to the field");
		}
		catch(Exception e) {
			utility.takeScreenshot(driver,"Enter_email");
			utility.generateReport("The Element is not visible from Enter_email Method");
		}
		
		
	}
	
	public static void enter_password(WebDriver driver, String password) {
		
		
		WebElement element =  driver.findElement(By.name(_password_textbox_name));
		element.sendKeys(password);
		
	}
	
	
	public static void Click_loginButton(WebDriver driver) {
		
		
		WebElement element =  driver.findElement(By.className(_login_button_class));
		element.click();
		
	}
	
	public static void select_Pending(WebDriver driver) {
		
		WebElement element = driver.findElement(By.name(_reason_dropdown_name));
		
		
		Select option = new Select(element);
		
		option.selectByIndex(1);
		option.deselectByValue("Pending");
		option.deselectByVisibleText("Pending");
		option.selectByContainsVisibleText("Accepted");
		
		
	}
	
	
	public static void clickUpdateButton(WebDriver driver) {
		
		String updateButton = String.format(_update_button_xpath, "RAM");
		
		WebElement element = driver.findElement(By.xpath(updateButton));
		
		element.click();
	}
	
	
	public static void mouseHoverAccountsandList(WebDriver driver) {
		
		
		WebElement element = driver.findElement(By.xpath(_AccountAndList_Mouseover_xpath));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
		
		
		
	}
	
	

}
