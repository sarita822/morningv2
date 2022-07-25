package code;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	
	protected WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\class\\src\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver(); 
	driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();
	WebElement loginurl, username, password, loginButton;
	
	loginurl = driver.findElement(By.id("login2"));
	loginurl.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginusername\"]")));
	//driver.findElement(By.xpath("//*[@id=\"loginusername\"]"));
	password = driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
	loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
	username.sendKeys("testmorning");
	password.sendKeys("test123");
	loginButton.click();
	

}

}	
