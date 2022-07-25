package code;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SecondSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\class\\src\\Driver\\chromedriver.exe");
		//we are defining which browser should the code to be run
		WebDriver driver = new ChromeDriver();
		//it will act as a driver to run browser
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		WebElement loginurl, username, password, loginButton;
		
		loginurl = driver.findElement(By.id("login2"));
		loginurl.click();
		Thread.sleep(5000);
		username = driver.findElement(By.xpath("//*[@id=\"loginusername\"]"));
		password = driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
		loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		username.sendKeys("testmorning");
		password.sendKeys("test123");
		loginButton.click();
		driver.quit();

	}

}
