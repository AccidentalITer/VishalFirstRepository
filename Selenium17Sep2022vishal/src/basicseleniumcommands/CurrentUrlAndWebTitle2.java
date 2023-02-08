package basicseleniumcommands;

import selenium1stprogram.CodeForBrowserInitialization;

public class CurrentUrlAndWebTitle2 extends CodeForBrowserInitialization {

	public boolean checkInTitleOfPage(String title) {
	 String titleOfPage = driver.getTitle(); // return title of webpage
	 
	 if(titleOfPage.equals(title))
		 return true;
	 else
		 return false; 
	 
	}
	
	public boolean checkUrlOfCurrentPage(String url) {
		String urlOfCurrentWebPage  = driver.getCurrentUrl(); // return title of Webpage
	    
		if(urlOfCurrentWebPage.equals(url))
			return true;
		else 
			return false;
		
	}
	public static void main(String[]args) {
		browserInit("chrome");
		driver.get("http://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	    CurrentUrlAndWebTitle obCheck = new CurrentUrlAndWebTitle();
	 //   System.out.println(obCheck.checkInTitleOfPage("intagram"));   //Test 1
	//    System.out.println(obCheck.checkUrlOfCurrentPage("http://www.instagram.com/")); //test 2
	    driver.quit();
	}
}
