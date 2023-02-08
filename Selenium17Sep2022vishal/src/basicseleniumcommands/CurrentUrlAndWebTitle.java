package basicseleniumcommands;

import selenium1stprogram.CodeForBrowserInitialization;

public class CurrentUrlAndWebTitle extends CodeForBrowserInitialization {
	
public void checkInTitleOfPage(String title) {
	String titleofpage =  driver.getTitle();
	
	if (titleofpage.equals(title))
		System.out.println("Test is pass");
	else
		System.out.println("Test is fail");
}
   public void checkUrlOfCurrentPage(String url) {
	String urlOfCurrentWebPage = driver.getCurrentUrl();   
	
	if (urlOfCurrentWebPage.equals(url))
		System.out.println("Test is pass");
	else
		System.out.println("Test is fail");
   }
   public static void main(String[]args) {
	   browserInit("chrome");
	   driver.get("http://www.instagram.com/");
	   driver.manage().window().maximize();
	   
	   CurrentUrlAndWebTitle obcheck = new CurrentUrlAndWebTitle();
	   obcheck.checkInTitleOfPage("intagram");
	   obcheck.checkInTitleOfPage("http://www.instagram.com/");
	   driver.quit();
   }
}
