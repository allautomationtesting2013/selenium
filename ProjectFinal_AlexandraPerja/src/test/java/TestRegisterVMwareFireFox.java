import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.BrowserSettingsFireFox;
import util.RandomEmail;
import util.RegistrationPageVMware;

/**
 * This class is used for perform test on VMwareRegistration using FireFox
 * driver. And validate the fields.
 * 
 * @author Alexandra Perja
 * 
 */
public class TestRegisterVMwareFireFox extends BrowserSettingsFireFox {

	private static final String FIRST_NAME = "aaaa";
	private static final String LAST_NAME = "aaaa";
	private static final String PHONE = "123456";
	private static final String COMPANY = "Endava";
	private static final String CITY = "Cluj";
	private static final String STATE = "Romania";
	private static final String ZIP_CODE = "1234";
	private static final String COUNTRY = "Romania";
	private static final String AREA = "QA";
	private static final String ROLE = "Senior Management";
	private static final String SERIAL_NR = "10";
	private static final String EMPLOYEES_NR = "100 - 499";
	private static final String SERVERS_NR = "0 - 19";
	private static final String SERVERS_NR_PLAN = "0 - 4";
	private static final String VM_OPTION = "VMware Player";
	private static final String VMServer_OPTION = "Proof of concept for production use";
	private static final String RESELLER = "R_name";
	private static final String VMWARE_URL = "http://register.vmware.com/content/registration.html";

	@Test
	public void testRegister() {

		driver.get(VMWARE_URL);
		driver.manage().window().maximize();
		RandomEmail randomEmail = new RandomEmail();
		new PageFactory();
		final RegistrationPageVMware registrationPage = PageFactory
				.initElements(driver, RegistrationPageVMware.class);
		registrationPage.firstNameInput.sendKeys(FIRST_NAME);
		registrationPage.lastNameInput.sendKeys(LAST_NAME);
		registrationPage.phoneInput.sendKeys(PHONE);
		registrationPage.emailInput.sendKeys(randomEmail.generateRandomEmail());
		registrationPage.companyInput.sendKeys(COMPANY);
		registrationPage.cityInput.sendKeys(CITY);
		registrationPage.stateInput.sendKeys(STATE);
		registrationPage.zipInput.sendKeys(ZIP_CODE);

		WebElement form_country = driver.findElement(By.name("Country"));
		List<WebElement> options_country = form_country.findElements(By
				.tagName("option"));
		for (WebElement opt : options_country) {
			if (opt.getText().equals(COUNTRY)) {
				opt.click();
			}
		}

		WebElement form_area = driver.findElement(By.name("functional_area"));
		List<WebElement> options_area = form_area.findElements(By
				.tagName("option"));
		for (WebElement opt : options_area) {
			if (opt.getText().equals(AREA)) {
				opt.click();
			}
		}

		WebElement form_role = driver.findElement(By
				.name("organizational_role"));
		List<WebElement> options_role = form_role.findElements(By
				.tagName("option"));
		for (WebElement opt : options_role) {
			if (opt.getText().equals(ROLE)) {
				opt.click();
			}
		}

		registrationPage.serialInput.sendKeys(SERIAL_NR);

		List<WebElement> options_system = driver.findElements(By
				.name("which_OS"));
		for (WebElement opt : options_system) {
			if (opt.isSelected()) {
				System.out.println("Selected radio button: "
						+ opt.getAttribute("value"));
			} else

				opt.click();
			System.out.println("Selected radio: " + opt.getAttribute("value"));
			break;

		}

		WebElement form_employees = driver
				.findElement(By.name("num_employees"));
		List<WebElement> options_employees = form_employees.findElements(By
				.tagName("option"));
		for (WebElement opt : options_employees) {
			if (opt.getText().equals(EMPLOYEES_NR)) {
				opt.click();
			}
		}

		WebElement form_servers = driver.findElement(By.name("num_servers"));
		List<WebElement> options_servers = form_servers.findElements(By
				.tagName("option"));
		for (WebElement opt : options_servers) {
			if (opt.getText().equals(SERVERS_NR)) {
				opt.click();
			}
		}

		WebElement form_servers_plan = driver.findElement(By
				.name("num_servers_plan"));
		List<WebElement> options_servers_plan = form_servers_plan
				.findElements(By.tagName("option"));
		for (WebElement opt : options_servers_plan) {
			if (opt.getText().equals(SERVERS_NR_PLAN)) {
				opt.click();
			}
		}

		WebElement form_VM = driver.findElement(By.name("vmware_products_tmp"));
		List<WebElement> options_VM = form_VM
				.findElements(By.tagName("option"));
		for (WebElement opt : options_VM) {
			if (opt.getText().equals(VM_OPTION)) {
				opt.click();
			}
		}

		WebElement form_VMServer = driver.findElement(By
				.name("how_use_VMS_tmp"));
		List<WebElement> options_VMServer = form_VMServer.findElements(By
				.tagName("option"));
		for (WebElement opt : options_VMServer) {
			if (opt.getText().equals(VMServer_OPTION)) {
				opt.click();
			}
		}

		registrationPage.resellerInput.sendKeys(RESELLER);

		if (!driver.findElement(By.id("First_Name")).getText().isEmpty()
				|| !driver.findElement(By.id("Last_Name")).getText().isEmpty()
				|| !driver.findElement(By.id("Phone")).getText().isEmpty()
				|| (!driver.findElement(By.id("Email")).getText().isEmpty()
						&& driver.findElement(By.id("Email")).getText()
								.contains("@") && driver
						.findElement(By.id("Email")).getText().contains(".com"))
				|| !driver.findElement(By.id("Company")).getText().isEmpty()
				|| !driver.findElement(By.id("City")).getText().isEmpty()
				|| !driver.findElement(By.id("State")).getText().isEmpty()
				|| !driver.findElement(By.id("Zip")).getText().isEmpty()
				|| !driver.findElement(By.name("Country")).getText()
						.contains("Please select")
				|| !driver.findElement(By.name("functional_area")).getText()
						.contains("Please select")
				|| !driver.findElement(By.name("organizational_role"))
						.getText().contains("Please select")
				|| !driver.findElement(By.id("num_serials")).getText()
						.isEmpty()
				|| !driver.findElement(By.name("which_OS")).isSelected()
				|| !driver.findElement(By.name("num_employees")).getText()
						.contains("Please select")
				|| !driver.findElement(By.name("num_servers")).getText()
						.contains("Please select")
				|| !driver.findElement(By.name("num_servers_plan")).getText()
						.contains("Please select")
				|| !driver.findElement(By.name("vmware_products_tmp"))
						.isSelected()
				|| !driver.findElement(By.name("how_use_VMS_tmp")).isSelected()
				|| !driver.findElement(By.id("pref_VMware_reseller")).getText()
						.isEmpty()) {

			registrationPage.submitButton.click();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			(new WebDriverWait(driver, 10))
					.until(new ExpectedCondition<Boolean>() {
						public Boolean apply(WebDriver d) {
							return registrationPage.confirmationMessageText
									.isDisplayed();
						}
					});

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			Assert.assertEquals("Verify reqistration message",
					registrationPage.confirmationMessageText.getText()
							.toLowerCase().contains("registration"), true);

		} else
			System.out.println("At least one field is empty!!!");

	}

}
