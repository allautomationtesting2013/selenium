package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class is used for FireFox Browser settings.
 * 
 * @author Alexandra Perja
 * 
 */
public class BrowserSettingsFireFox {

	protected WebDriver driver;

	@Before
	public void setUp() {

		driver = new FirefoxDriver();

	}

	@After
	public void tearDown() {

		driver.quit();

	}

}
