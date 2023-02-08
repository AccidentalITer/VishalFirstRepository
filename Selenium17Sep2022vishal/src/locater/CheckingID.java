package locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingID {
	
	public static void main(String[]args) {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Vishal\\Desktop\\selenium instalation\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://m.facebook.com/");
     driver.manage().window().maximize();
     
     WebElement username = driver.findElement(By.id("m_login_email"));
     username.sendKeys("vishal");
     
     WebElement password = driver.findElement(By.id("m_login_password"));
     password.sendKeys("vishal123");
     
     WebElement clicklogin = driver.findElement(By.name("login"));
     clicklogin.click();
	
}
	}


