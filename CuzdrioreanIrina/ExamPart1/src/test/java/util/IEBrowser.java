package util;
/**
 * @author Nina
 * this class calls setUp() and tearDown() methods
 */
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	protected WebDriver driver;

	/**
	 * @method set up an InternetExplorer driver
	 */
	@Before
	public void setUp() {

		System.setProperty("webdriver.ie.driver",
				"src/test/resources/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	/**
	 * @method quit the driver
	 */
	@After
	public void tearDown() {

		driver.quit();
	}

}
