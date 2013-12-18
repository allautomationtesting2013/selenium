package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * 
 * @author larisa
 * this class sets the Firefox browser used to perform the tests
 * containes two methods that will be executed even if the tests fail 
 */
public class BrowserSettFire {

	
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
