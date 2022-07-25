package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage {
	
	WebDriver driver;
	public ContactPage(WebDriver driver) {
		this.driver = driver;	
		
	}
	
	By contactUrl = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
	By contactname = By.id("recipient-name");
	By messageText = By.id("message-text");
	
	public void conntact() {
		driver.findElement(contactUrl).click();
	}
	
	public void enterEmail(String email) {
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement contactEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recipient-email")));
		contactEmail.sendKeys(email);
	}
	
	public void enterName(String Name) {
	driver.findElement(contactname).sendKeys(Name);
	}

	public void enterMessage(String message) {
		
		driver.findElement(messageText).sendKeys(message);
	}
}
