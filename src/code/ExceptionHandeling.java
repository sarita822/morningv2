package code;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionHandeling {

	public static void main(String[] args) throws ElementNotInteractableException, InterruptedException, NoSuchElementException {
		// TODO Auto-generated method stub
		
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
				
				try {
					System.out.println("This started here");
				
				username = driver.findElement(By.xpath("sss"));
				password = driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
				loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
				username.sendKeys("testmorning");
				password.sendKeys("test123");
				loginButton.click();
				System.out.println("This Ended here");
//				driver.quit();
				}
				catch (ElementNotInteractableException E) {
					System.out.println("Element is not interactable");
					WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
					username =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginusername\"]")));
					password = driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
					loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
					username.sendKeys("testmorning");
					password.sendKeys("test123");
					loginButton.click();
					driver.quit();
				}
				catch (NoSuchElementException E) {
					
					System.out.println("No such elements");
					WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
					username =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginusername\"]")));
					password = driver.findElement(By.xpath("//*[@id=\"loginpassword\"]"));
					loginButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
					username.sendKeys("testmorning");
					password.sendKeys("test123");
					loginButton.click();
					driver.quit();
				}


	}

}
