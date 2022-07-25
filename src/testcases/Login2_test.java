package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.ContactPage;

public class Login2_test {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\class630\\src\\Driver\\chromedriver.exe");
	WebDriver calls = new ChromeDriver();
	calls.get("https://www.demoblaze.com");
	
	HomePage home = new HomePage(calls);
	home.maximize_window();
	
	ContactPage contact = new ContactPage(calls);
	contact.conntact();
	contact.enterEmail("bishal@bishal.com");
	contact.enterName("Bishal Karki");
	contact.enterMessage("This is message");
	
	
	}
	

}
