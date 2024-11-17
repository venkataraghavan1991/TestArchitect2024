package classroomweek1;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

public class BHelper extends BrowserFactory {
	
	private static final Logger logger = Logger.getLogger(BHelper.class.getName());
	
	public static WebDriver MaximizeBrowser() {
		
		driver.manage().window().maximize();
		logger.info("Maximize the window ... ");
		return driver;
	}

	public static WebDriver Addimplicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Add implicit wait for 30 sec ... ");
		return driver;
	}

	public static WebDriver OpenURL() {
		driver.get("https://leafground.com/");
		logger.info("Open the URL ... ");
		return driver;
	}
	

}
