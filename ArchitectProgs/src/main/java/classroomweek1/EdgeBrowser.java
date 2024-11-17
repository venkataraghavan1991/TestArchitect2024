package classroomweek1;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser extends BrowserFactory implements Browser{
	
	private static final Logger logger =  Logger.getLogger(EdgeBrowser.class.getName());

	@Override
	public WebDriver LaunchBrowser() {
		driver=new EdgeDriver();
		logger.info("EdgeBrowser Launched");
		return driver;
		
		
	}

}
