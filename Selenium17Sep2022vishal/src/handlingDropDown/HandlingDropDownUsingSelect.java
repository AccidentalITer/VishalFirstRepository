package handlingDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelect {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishal\\Desktop\\selenium instalation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//year
	WebElement year = driver.findElement(By.id("year"));
	Select y = new Select(year);
	y.selectByVisibleText("1996");
	
	//month
	WebElement month = driver.findElement(By.id("month"));
	Select m = new Select(month);
	m.selectByValue("9");
	
	//day
	WebElement day = driver.findElement(By.id("day"));
	Select d = new Select(day);
	d.selectByIndex(18);

	driver.quit();
	}
}
