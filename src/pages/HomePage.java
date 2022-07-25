package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	

	//Locator for login button
	By LoginUrl = By.id("login2");
	
	public void maximize_window() {
		driver.manage().window().maximize();
	}
	
	//Method to click login button
	public void clickLogin() {
		driver.findElement(LoginUrl).click();
	}
}
