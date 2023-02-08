package loginlogout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMUsingCscSelecter {
	public static void main (String[]args) {
		
		System.setProperty("Webdriver.chrome.driver",		
				"C:\\Users\\Vishal\\Desktop\\selenium instalation\\chromedriver_win32\\chromedriver.exe");
  
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("admin");
        driver.findElement(By.cssSelector("[type='submit']")).click();
	}
}
