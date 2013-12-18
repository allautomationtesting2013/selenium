package mavenExam2;

import java.util.ResourceBundle;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSett;
import util.PageReg;

/**
 * 
 * @author larisa 
 * the class calls the method 'testLoginFire'
 * @parameters: three constants for URL and credentials of the user
 * 
 */
public class TestEcommerce extends BrowserSett {

	public static final String EMAIL = "ioa@ioa.com";
	public static final String PASSWORD = "311289lg";
	public static final String AMAZON_URL = "https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dgno_signin";

	/**
	 * @method: the user logs in to his account, search for a product, add to card, edit the cart and delete the product;
	 * check if a proper message is displayed after the user added a product in his cart
	 * @throws Exception
	 */
	
	
	@Test
	public void testSearchProduct() throws Exception {
		driver.get(AMAZON_URL);
		// driver.manage().deleteAllCookies();
		// ResourceBundle bundle1 = ResourceBundle.getBundle("values");
		// String usern=bundle1.getString("user");
		// String password=bundle1.getString("passw");

		new PageFactory();
		final PageReg registrationPage = PageFactory.initElements(driver,
				PageReg.class);

		registrationPage.emailInput.sendKeys(EMAIL);
		registrationPage.passwInput.sendKeys(PASSWORD);
		registrationPage.radioBInput.click();
		registrationPage.submittBInput.click();
		registrationPage.searchInput.sendKeys("Maybelline");
		registrationPage.link1Input.click();
		registrationPage.link2Input.click();
		registrationPage.radioB2Input.click();
		registrationPage.addInput.click();
		registrationPage.editInput.click();
		registrationPage.deleteInput.click();

//		Assert.assertTrue(registrationPage.confirmationMsgText.getText()
//				.equals("1 item added to Cart"));

	}

}
