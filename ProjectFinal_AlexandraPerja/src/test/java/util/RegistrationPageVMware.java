package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class is used for VMware page registration.
 * 
 * @author Alexandra Perja
 * 
 */
public class RegistrationPageVMware {

	@FindBy(id = "First_Name")
	public WebElement firstNameInput;

	@FindBy(id = "Last_Name")
	public WebElement lastNameInput;

	@FindBy(id = "Phone")
	public WebElement phoneInput;

	@FindBy(id = "Email")
	public WebElement emailInput;

	@FindBy(id = "Company")
	public WebElement companyInput;

	@FindBy(id = "City")
	public WebElement cityInput;

	@FindBy(id = "State")
	public WebElement stateInput;

	@FindBy(id = "Zip")
	public WebElement zipInput;

	@FindBy(name = "Country")
	public WebElement countryInput;

	@FindBy(name = "functional_area")
	public WebElement areaInput;

	@FindBy(id = "num_serials")
	public WebElement serialInput;

	@FindBy(name = "num_employees")
	public WebElement employeesInput;

	@FindBy(name = "num_servers")
	public WebElement serversInput;

	@FindBy(name = "num_servers_plan")
	public WebElement servers_planInput;

	@FindBy(name = "vmware_products_tmp")
	public WebElement vmware_productsInput;

	@FindBy(id = "pref_VMware_reseller")
	public WebElement resellerInput;

	@FindBy(xpath = "/html/body/div/div/div/form/div[2]/input")
	public WebElement submitButton;

	@FindBy(xpath = "/html/body/div/div/div/h1")
	public WebElement confirmationMessageText;

}
