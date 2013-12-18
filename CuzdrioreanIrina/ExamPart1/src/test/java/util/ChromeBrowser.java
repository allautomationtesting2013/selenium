package util;
/**
 * @author Nina
 * this class calls setUp() and tearDown() methods
 */
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	protected WebDriver driver;

	/**
	 * @method set up a Chrome driver
	 */
	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

	/**
	 * @method quit the driver
	 */
	@After
	public void tearDown() {

		driver.quit();

	}

}
