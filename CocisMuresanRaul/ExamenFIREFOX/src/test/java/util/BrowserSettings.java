package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * BrowserSettings class implements setUp and tearDown methods
 * @author rcocismuresan
 * @version 1.0
 */
public class BrowserSettings {

	public WebDriver driver;

	/**
	 * setUp() method set the driver for Firefox Browser and it's called before
	 * every test inainte de fiecare test
	 */
	@Before
	public void setUp() {

		// System.setProperty("webdriver.chrome.driver",
		// "src/test/resources/chromedriver.exe");
		driver = new FirefoxDriver();

	}
	
	/**
	 * tearDown() method close the browser and it's called after every test
	 * 
	 */
	@After
	public void tearDown() {

		driver.quit();

	}

}
