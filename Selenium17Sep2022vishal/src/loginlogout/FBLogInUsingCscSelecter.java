package loginlogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogInUsingCscSelecter {
	
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver,chrome,driver",
	"C:\\Users\\Vishal\\Desktop\\selenium instalation\\chromedriver_win32\\chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://m.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#m_login_email")).sendKeys("vishal");
	driver.findElement(By.cssSelector("#m_login_password")).sendKeys("vishal123");
    driver.findElement(By.cssSelector("._54k8._52jh._56bs._56b_._28lf._9cow._56bw._56bu")).click();	
	}

}
