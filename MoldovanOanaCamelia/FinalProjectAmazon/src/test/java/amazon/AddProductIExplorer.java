package amazon;

/**
 * This class logs in to amazon.com from the InternetExplorer browser, using a random email and adds a product to a shopping cart
 */

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import util.IExplorerSettings;
import util.PageElements;

public class AddProductIExplorer extends IExplorerSettings {

	private static final String PAGE_URL = "http://www.amazon.com";
	private static final CharSequence EMAIL = "email@login.com";
	private static final CharSequence PASSWORD = "pass1234";
	private static final CharSequence SEARCH_INPUT = "clock";
	
	/**
	 * This is a test method that logs in with the given email and password,
	 * checks for the given product and adds it to a shopping cart
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void Login() throws InterruptedException {
		driver.get(PAGE_URL);
		driver.manage().deleteAllCookies();
		new PageFactory();
		final PageElements elem = PageFactory.initElements(driver,
				PageElements.class);
		
		elem.signIn.click();
		elem.emailInput.sendKeys(EMAIL);
		elem.passwordInput.sendKeys(PASSWORD);
		elem.submitButton.click();
		Thread.sleep(5000);
		elem.toSearch.sendKeys(SEARCH_INPUT);
		elem.toSearch.submit();
		elem.dealLink.click();
		Thread.sleep(5000);	
		elem.addButton.click();
		
		Assert.assertEquals("Shopping Cart",
			    elem.confirmationMessage.getText().contains("added"), true);
		
	}

}
