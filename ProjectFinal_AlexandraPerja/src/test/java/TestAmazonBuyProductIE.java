import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSettingsIE;
import util.ConstantsAmazon;
import util.RegistrationPageAmazon;

/**
 * This class is used for perform tests on Amazon using Internet Explorer
 * driver.
 * 
 * @author Alexandra Perja
 * 
 */
public class TestAmazonBuyProductIE extends BrowserSettingsIE {
	public static String AMAZON_URL = "http://www.amazon.com/ref=gno_logo";

	@Test
	public void testBuyProduct() throws InterruptedException {

		driver.get(AMAZON_URL);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		new PageFactory();
		final RegistrationPageAmazon registrationPage = PageFactory
				.initElements(driver, RegistrationPageAmazon.class);

		WebElement form = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> options = form.findElements(By.tagName("option"));
		for (WebElement opt : options) {
			if (opt.getText().equals(ConstantsAmazon.OPTIUNE_COMPUTERS)) {
				opt.click();
			}
		}

		registrationPage.searchBoxInput
				.sendKeys(ConstantsAmazon.COMPUTERS_MODEL);
		Thread.sleep(2000);
		registrationPage.goButtonInput.click();
		Thread.sleep(2000);
		registrationPage.computerInput.click();
		Thread.sleep(2000);
		registrationPage.addToCartButtonInput.click();
		Thread.sleep(2000);
		registrationPage.verifyCartButtonInput.click();
		Thread.sleep(2000);
		System.out.println("One product added");

	}

}
