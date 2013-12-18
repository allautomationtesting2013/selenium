import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import util.BrowserSettingsFireFox;

/**
 * This class is used for a negative test for register on VMware using FireFox
 * browser.
 * 
 * @author Alexandra Perja
 * 
 */
public class TestRegisterVMwareFireFoxNegative extends BrowserSettingsFireFox {

	private static final String FIRST_NAME = "aaaa";
	private static final String LAST_NAME = "aaaa";
	private static final String PHONE = "123456";
	private static final String EMAIL = "aaa@aaa.com";
	private static final String VMWARE_URL = "http://register.vmware.com/content/registration.html";

	@Test
	public void testRegisterNegative() throws InterruptedException {

		driver.get(VMWARE_URL);
		driver.manage().window().maximize();
		driver.findElement(By.id("First_Name")).sendKeys(FIRST_NAME);
		driver.findElement(By.id("Last_Name")).sendKeys(LAST_NAME);
		driver.findElement(By.id("Phone")).sendKeys(PHONE);
		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[2]/input"))
				.click();

		Thread.sleep(1000);

		driver.switchTo().alert().accept();

		Thread.sleep(1000);

		assertTrue(driver.getPageSource().contains(
				"Please complete all required fields"));

	}

}
