package util;
/**
 * @author Nina
 * this class calls setUp() and tearDown() methods
 */
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	protected WebDriver driver;

	/**
	 * @method set up a Firefox driver
	 */
	@Before
	public void setUp() {

		driver = new FirefoxDriver();
	}

	/**
	 * @method quit the driver
	 */
	@After
	public void tearDown() {

		driver.quit();

	}

}
