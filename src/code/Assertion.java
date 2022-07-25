package code;


import org.junit.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class Assertion {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\class\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		WebElement loginurl, username, password, loginButton;
		String value, un;
		un = "testmorning";
		String result = "Welcome "+un;
		
		loginurl = driver.findElement(By.id("login2"));
		loginurl.click();
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		username =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginusername\"]")));
		password = driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
		loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		username.sendKeys(un);
		password.sendKeys("test123");
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		value = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nameofuser\"]"))).getText();
		System.out.println(value);
		Assert.assertEquals(result, value);
		driver.quit();
		

	}

}	
