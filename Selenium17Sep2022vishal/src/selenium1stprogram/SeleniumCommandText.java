package selenium1stprogram;

import static selenium1stprogram.CodeForBrowserInitialization.driver;

public class SeleniumCommandText extends CodeForBrowserInitialization {
	public static void main(String[]args) {
		browserInit("chrome");
		driver.get("https://www.instagram.com");
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");	
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	  //  driver.close(); //close only browser current tab
	   driver.quit(); // close entire browser
	}

}
