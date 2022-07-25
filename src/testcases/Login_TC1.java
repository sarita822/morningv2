package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ContactPage;
import pages.HomePage;
import pages.LoginPage;

public class Login_TC1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\class630\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		
		//Creating object of home page
		HomePage home = new HomePage(driver);
		
		//Creating object of Login page
		LoginPage login = new LoginPage(driver);
		
		
		//maximize the window
		home.maximize_window();
		//Click on Login button
		home.clickLogin();
		
		//Enter username & password
		login.enterUsername("testmorning");
		login.enterPassword("test123");
		
		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);
		
		ContactPage contact = new ContactPage(driver);
		contact.conntact();
		contact.enterEmail("bishal@bishal.com");
		contact.enterName("Bishal Karki");
		contact.enterMessage("This is message");
		


               //Close browser instance
               driver.quit();
	}

}