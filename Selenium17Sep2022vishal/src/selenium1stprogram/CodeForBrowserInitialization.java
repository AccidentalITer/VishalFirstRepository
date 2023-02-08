package selenium1stprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author Vishal
 *
 */
public class CodeForBrowserInitialization {
	
	protected static WebDriver driver;
	
	public static WebDriver browserInit(String browser) {
		 System.setProperty("webdriver.edge.driver",
	  "C:\\Users\\Vishal\\Desktop\\selenium instalation\\edgedriver_win64 (1)\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishal\\Desktop\\selenium instalation\\chromedriver_win32\\chromedriver.exe");
        
		if (browser.equals("edge"))
			driver = new EdgeDriver();
		if (browser.equals("chrome"));
		   driver = new ChromeDriver();
		   return driver;
	}

}
