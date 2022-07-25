package newpackagefortestion;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewTest {
	
	

	
	//we are defining which browser should the code to be run
	WebDriver driver;
	@Test
	  public void f() throws InterruptedException {
		  System.out.println("Here test is running");
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
		  Assert.assertFalse(true);
		  Thread.sleep(5000);
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("This is before test");
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\class\\src\\Driver\\chromedriver.exe");
			//it will act as a driver to run browser
		  driver = new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("This is After test test");
		  driver.quit();
		  
	  }
}
