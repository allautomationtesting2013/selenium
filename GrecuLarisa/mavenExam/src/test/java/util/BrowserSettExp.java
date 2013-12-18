package util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * 
 * @author larisa 
 * this class sets the InternetExplorer browser used to perform
 *         the tests containes two methods that will be executed even if the
 *         tests fail
 */
public class BrowserSettExp {

	protected WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.ie.driver",
				"./src/test/resources/IEDriverServer.exe");
		driver = new InternetExplorerDriver();

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
