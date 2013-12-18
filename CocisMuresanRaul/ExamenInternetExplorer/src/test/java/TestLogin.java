import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSettings;
import util.LoginPage;
import util.RegistrationPage;

/**
 * TestLogin class implements Login() method
 * 
 * @author rcocismuresan
 * @version 1.0
 */

public class TestLogin extends BrowserSettings {

	public static final String USER = "qwe22@qwe22.com";
	public static final String PASS = "123456";
	private static final String PAGE_URL = "http://www.authentichappiness.sas.upenn.edu/register.aspx";

	/**
	 * Login() method realize login to site
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void Login() throws InterruptedException {
		driver.get(PAGE_URL);
		new PageFactory();
		final LoginPage loginPage = PageFactory.initElements(driver,
				LoginPage.class);
		loginPage.userName.sendKeys(USER);
		loginPage.pass.sendKeys(PASS);
		loginPage.submit.click();
		Thread.sleep(2000);
	}

}
