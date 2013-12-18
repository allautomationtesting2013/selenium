package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * This class is used for Internet Explorer Browser settings.
 * 
 * @author Alexandra Perja
 * 
 */
public class BrowserSettingsIE {
	protected WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.ie.driver",
				"src/test/resources/IEDriverServer.exe");
		driver = new InternetExplorerDriver();

	}

	@After
	public void tearDown() {

		driver.quit();

	}

}
