package test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import util.Element;
import util.IEBrowserSettings;

/**
 * This class implements the Buy method that uses InternetExplorer Browser
 * 
 * @author fionce
 * 
 */
public class AddToCartTestIE extends IEBrowserSettings {
	private static final String PAGE_URL = "http://www.amazon.com";
	private static final CharSequence SEARCH_INPUT = "iphone 3";
	private static final CharSequence EMAIL = "florina_melinda@yahoo.com";
	private static final CharSequence PASSWORD = "278257";

	/**
	 * This is a test method that verifies the login option for an existing
	 * account on Amazon.com and adds products to shopping cart, using
	 * InternetExplorer Browser
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void Buy() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.get(PAGE_URL);
		new PageFactory();
		final Element search = PageFactory.initElements(driver, Element.class);
		search.signin.click();
		search.emailInput.sendKeys(EMAIL);
		search.passwordInput.sendKeys(PASSWORD);
		search.submitButton.click();
		Thread.sleep(5000);
		search.search.sendKeys(SEARCH_INPUT);
		search.search.submit();
		search.object.click();
		Thread.sleep(5000);
		search.addButton.click();

	}
}
