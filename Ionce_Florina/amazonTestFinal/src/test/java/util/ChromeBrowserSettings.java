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
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserSettings {
	protected WebDriver driver;
	/**
	 * This method sets the driver Chrome Browser.
	 */
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
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
