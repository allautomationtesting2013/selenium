package amazon;

/**
 * This class implements a negative test for login
 */

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.IExplorerSettings;
import util.PageElements;

public class NegativeTestIExplorer extends IExplorerSettings {

	private static final String PAGE_URL = "https://www.amazon.com";
	private static final CharSequence EMAIL = "email@login.com";
	private static final CharSequence PASSWORD = "wrong";
	
	/**
	 * This is a test method that verifies that if you try to log in to
	 * amazon.com, on InternetExplorer browser, with a valid password and an invalid
	 * password, you will see an error message
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LoginNegative() throws InterruptedException {
		driver.get(PAGE_URL);
		driver.manage().deleteAllCookies();
		new PageFactory();
		final PageElements elem = PageFactory.initElements(driver, PageElements.class);
		elem.signIn.click();
		elem.emailInput.sendKeys(EMAIL);
		elem.checkYes.click();
		elem.passwordInput.sendKeys(PASSWORD);
		elem.passwordInput.submit();
		Thread.sleep(5000);
		Assert.assertTrue(driver
				.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/h6"))
				.getText().equals("There was a problem with your request"));
	}

}
