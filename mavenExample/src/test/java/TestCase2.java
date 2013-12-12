import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static String GOOGLE_URL = "https://www.google.ro/";
	public static String GOOGLE_TITLE = "Google";

	WebDriver driver;

	@Before
	public void setUp() {

		driver = new FirefoxDriver();

	}

	@Test
	public void testCase2() {

		WebDriver driver = new FirefoxDriver();
		driver.get(GOOGLE_URL);
		String titleOfPage = driver.getTitle();
		assertEquals(GOOGLE_TITLE, titleOfPage);

	}

	@After
	public void tearDown() {

		driver.quit();

	}

}
