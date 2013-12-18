import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSettings;
import util.Elements;

/**
 * AddToCart class implements Login() method which realize login and adding
 * products to shopping cart
 * @author rcocismuresan
 * @version 1.0
 */
public class AddToCart extends BrowserSettings {

	private static final String USER = "qwe22@qwe22.com";
	private static final String PASS = "123456";
	private static final String PAGE_URL = "https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dgno_signout%26signIn%3D1%26useRedirectOnSuccess%3D1";
	private static final String EMAIL = "asdqwe@yahoo.com";
	private static final String SEARCH_INPUT = "gheorghe hagi";

	/**
	 * Login() method realize login and adding products to shopping cart
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void Login() throws InterruptedException {
		driver.get(PAGE_URL);
		new PageFactory();
		final Elements elem = PageFactory.initElements(driver, Elements.class);
		elem.emailInput.sendKeys(EMAIL);
		elem.pass.sendKeys(PASS);
		elem.pass.submit();
		elem.search.sendKeys(SEARCH_INPUT);
		elem.search.submit();
		elem.select.click();
		Thread.sleep(2000);
		elem.addToCart.click();
		Thread.sleep(5000);

	}

}
