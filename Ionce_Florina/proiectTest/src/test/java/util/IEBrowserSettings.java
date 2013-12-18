package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * This class BrowserSettings sets the desired browser
 * 
 * @author fionce
 * 
 */
public class IEBrowserSettings {

	public WebDriver driver;

	/**
	 * This method sets the driver InternetExplorer Browser. It uses the
	 * InternetExplorer driver from src/test/resources
	 */
	@Before
	public void setUp() {

		System.setProperty("webdriver.ie.driver",
				"src/test/resources/IEDriverServer.exe");
		DesiredCapabilities capab = DesiredCapabilities.internetExplorer();

		capab.setCapability(
				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				true);
		driver = new InternetExplorerDriver();

	}

	/**
	 * This method is executed after the running of the test and shuts the
	 * browser
	 */
	@After
	public void tearDown() {
		driver.quit();
	}
}
