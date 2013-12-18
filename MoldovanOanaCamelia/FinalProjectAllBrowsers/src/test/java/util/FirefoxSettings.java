package util;
/**
 * This class sets the desired browser
 */
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSettings {

	protected WebDriver driver;
	/**
	 * This method sets the driver for Mozilla Firefox browser 
	 */
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
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
