package locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckNameLocater {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chromre.driver",
  	"C:\\Users\\Vishal\\Desktop\\selenium instalation\\chromedriver_win32\\chromedriver.exe");
	 
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("admin123");
        
        WebElement btn = driver.findElement(By.cssSelector("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
        btn.click();
	}
}
