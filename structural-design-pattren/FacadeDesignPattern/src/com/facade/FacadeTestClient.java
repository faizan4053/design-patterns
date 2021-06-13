package com.facade;
import java.sql.Driver;

class Firefox{
	public static Driver getFireFoxDreiver() {
		return null;
	}
	
	public static void generateHTMLReport(String test,Driver driver) {
		System.out.println("Generating HTML report for firefox driver");
	}
	
	public static void generateJUnitReport(String test,Driver driver) {
		System.out.println("Generating JUnit report for firefox driver");
	}
}

class Chrome{
	public static Driver getChromeDreiver() {
		return null;
	}
	
	public static void generateHTMLReport(String test,Driver driver) {
		System.out.println("Generating HTML report for chrome driver");
	}
	
	public static void generateJUnitReport(String test,Driver driver) {
		System.out.println("Generating JUnit report for chrome driver");
	}
}


//facade

class BrowserHelperFacade {
	public void generateReports(String browser,String report,String test) {
		Driver driver=null;
		switch(browser) {
		case "firefox":
			driver=Firefox.getFireFoxDreiver();
			switch(report) {
			case "html":
				Firefox.generateHTMLReport(test,driver);
				break;
			case "junit":
				Firefox.generateJUnitReport(test, driver);
				break;
			}
		break;
		case "chrome":
			driver=Chrome.getChromeDreiver();
			switch(report) {
			case "html":
				Chrome.generateHTMLReport(test, driver);
				break;
			case "junit":
				Chrome.generateJUnitReport(test, driver);
				break;
			}
		}
	}
}

public class FacadeTestClient {

	public static void main(String[] args) {
		String test="check element present";
		BrowserHelperFacade obj=new BrowserHelperFacade();
		
		obj.generateReports("firefox","html", test);
		obj.generateReports("firefox","junit", test);
		obj.generateReports("chrome","html", test);
		obj.generateReports("chrome","junit", test);
		
	}

}
