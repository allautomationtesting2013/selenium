package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class is used for Chrome Browser settings.
 * 
 * @author Alexandra Perja
 * 
 */
public class BrowserSettingsChrome {

	protected WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void tearDown() {

		driver.quit();

	}

}
