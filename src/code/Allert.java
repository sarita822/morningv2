package code;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Allert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\class\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		driver.switchTo().alert().sendKeys("Bishal");
		driver.switchTo().alert().accept();
		
	}

}
