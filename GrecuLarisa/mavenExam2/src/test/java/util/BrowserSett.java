package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author larisa
 *the class sets the browser that is used to perform the tests
 *@parameters: WebDriver object
 *@method: two methods that will be executed even if the tests fail
 */

public class BrowserSett {
	

	protected WebDriver driver;

	
	/**
	 * the method instantiates a WebDriver object
	 */
	
	@Before
	public void setUp() {

	
		driver = new FirefoxDriver();

	}

	
	/**
	 * waits for 3 seconds  after the last action is performed then closes the browser
	 * @throws InterruptedException
	 */
	
	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
        driver.quit();
	}
}
