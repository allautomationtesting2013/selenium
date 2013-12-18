import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.BrowserSettingsChrome;
import util.ConstantsAmazon;

/**
 * This class is used for creating a negative test for Amazon using Chrome
 * browser.
 * 
 * @author Alexandra Perja
 * 
 */
public class TestAmazonBuyProductChromeNegative extends BrowserSettingsChrome {

	public static String AMAZON_URL = "http://www.amazon.com/ref=gno_logo";

	@Test
	public void testBuyNegative() throws InterruptedException {

		driver.get(AMAZON_URL);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement form = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> options = form.findElements(By.tagName("option"));
		for (WebElement opt : options) {
			if (opt.getText().equals(ConstantsAmazon.OPTIUNE_COMPUTERS)) {
				opt.click();
			}
		}

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(
				"xxxxyyyyyyyy");
		driver.findElement(
				By.xpath("/html/body/header/div/div[2]/div[2]/div/form/div[2]/input"))
				.click();
		Assert.assertEquals(
				"Your search xxxxyyyyyyyy did not match any products.", driver
						.findElement(By.id("noResultsTitle")).getText()
						.contains("did not match any products"), true);

	}
}
