package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for username field
//	WebDriverWait wait=new WebDriverWait(driver, 10);
//	By uName = By.id("loginusername");
	
	//Locator for password field
	By pswd = By.id("loginpassword");
	
	//Locator for login button
	By loginBtn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	
	
	//Method to enter username
	public void enterUsername(String user) {
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement uName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginusername\"]")));
		uName.sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
}