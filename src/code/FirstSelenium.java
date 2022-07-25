package  code;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\class\\src\\Driver\\chromedriver.exe");
		//we are defining which browser should the code to be run
		WebDriver driver = new ChromeDriver();
		//it will act as a driver to run browser
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.quit();
		
		
	}

}
