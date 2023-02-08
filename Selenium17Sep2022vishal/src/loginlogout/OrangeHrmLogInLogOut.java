package loginlogout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogInLogOut {
	
	public static void main( String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome,driver",
		"C:\\Users\\Vishal\\Desktop\\selenium instalation\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		boolean verifyDashbordPgeIsOpen = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText().equals("Dashbord");
	    if(verifyDashbordPgeIsOpen==true)
	    	System.out.println("Test is pass - DashBoard page is appeared");
	    else
	    	 System.out.println("Test is fail- DashBoard page has not appeared");
	    driver.findElement(By.xpath("//*[]text()='Paul Collings']//parent::span//i")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    Thread.sleep(2000);
	    
	    driver.close();
	}

}
