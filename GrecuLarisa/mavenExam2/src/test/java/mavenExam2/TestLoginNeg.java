package mavenExam2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSett;
import util.PageReg;

/**
 * 
 * @author larisa the class calls the method 'LoginFail'
 * @parameters: three constants for URL and credentials of the user
 * 
 */

public class TestLoginNeg extends BrowserSett {

	private static final String AMAZON_URL = "https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dgno_signout%26signIn%3D1%26useRedirectOnSuccess%3D1";
	private static final CharSequence EMAIL = "ioa@ioa.com";
	private static final CharSequence PASSWORD = "311289";

	/**
	 * the method tests if an error message is displayed when the user enters
	 * wrong credentials
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void LoginFail() throws InterruptedException {
		driver.get(AMAZON_URL);
		new PageFactory();
		final PageReg login = PageFactory.initElements(driver, PageReg.class);
		login.emailInput.sendKeys(EMAIL);
		login.radioBInput.click();
		login.passwInput.sendKeys(PASSWORD);
		login.submittBInput.click();
		Thread.sleep(5000);
		Assert.assertTrue(driver
				.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/h6"))
				.getText().equals("There was a problem with your request"));
	}

}
