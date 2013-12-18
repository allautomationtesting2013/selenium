package util;

/**
 * This class sets the desired browser
 */

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IExplorerSettings {

	protected WebDriver driver;
	
	/**
	 * This method sets the driver for InternetExplorer browser 
	 * It uses the internet explorer driver
	 * from src/test/resources/
	 */
	@Before
	public void setUp() {
		System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	/**
	 * This method is executed after the running of the test and shuts down the
	 * browser
	 */
	@After
	public void tearDown() {
		driver.quit();
	}
}
