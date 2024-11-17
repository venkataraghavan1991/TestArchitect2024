package classroomweek1;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
	public static WebDriver driver = null;
	
	public static WebDriver launchbrowser(BrowserType Btype) {
		
		switch(Btype) {
		case chrome:
			driver = new ChromeBrowser().LaunchBrowser();
			openBrowser();
			return driver;
		case edge:
			driver = new EdgeBrowser().LaunchBrowser();
			openBrowser();
			return driver; 
		default:
			throw new IllegalArgumentException("Wrong Browser");
		}
		 
		
	}
	
	public static WebDriver openBrowser() {
		BHelper.MaximizeBrowser();
		BHelper.Addimplicitwait();
		BHelper.OpenURL();
		return driver;
		
	}
}
