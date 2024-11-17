package classroomweek1;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser extends BrowserFactory implements Browser {

	private static final Logger logger = Logger.getLogger(ChromeBrowser.class.getName());

	@Override
	public WebDriver LaunchBrowser(){
		driver = new ChromeDriver();
		logger.info("ChromeBrowser Launched");
		return driver;

	}
}
