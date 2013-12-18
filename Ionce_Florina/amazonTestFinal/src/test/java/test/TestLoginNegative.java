package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSettings;
import util.Element;

/**
 * This class implements the Login method that uses Firefox Browser
 * 
 * @author fionce
 * 
 */
public class TestLoginNegative extends BrowserSettings {

	private static final String PAGE_URL = "https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dgno_signout%26signIn%3D1%26useRedirectOnSuccess%3D1";
	private static final CharSequence EMAIL = "florina_melinda@yahoo.com";
	private static final CharSequence PASSWORD = "123213";

	/**
	 * This is a test method that verifies that if try to log in amazon.com with
	 * Firefox Browser, using an invalid password
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void Login() throws InterruptedException {
		driver.get(PAGE_URL);
		new PageFactory();
		final Element login = PageFactory.initElements(driver, Element.class);
		login.emailInput.sendKeys(EMAIL);
		login.passwordInput.sendKeys(PASSWORD);
		login.passwordInput.submit();
		Thread.sleep(5000);
		Assert.assertTrue(driver
				.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/h6"))
				.getText().equals("There was a problem with your request"));
	}
}
