package util;

/**
 * This class BrowserSettings sets the desired browser
 * 
 * @author fionce
 * 
 */
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSettings {

	public WebDriver driver;

	/**
	 * This method sets the driver Firefox Browser.
	 */
	@Before
	public void setUp() {

		driver = new FirefoxDriver();

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
