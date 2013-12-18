package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class is used for Amazon page registration.
 * 
 * @author Alexandra Perja
 * 
 */
public class RegistrationPageAmazon {

	@FindBy(id = "searchDropdownBox")
	public WebElement searchDropDownInput;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchBoxInput;

	@FindBy(xpath = "/html/body/header/div/div[2]/div[2]/div/form/div[2]/input")
	public WebElement goButtonInput;

	@FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div[4]/div/div/div[2]/div[2]/a/div/img")
	public WebElement computerInput;

	@FindBy(id = "fbt_cartadd_button")
	public WebElement addToCartButtonInput;

	@FindBy(id = "nav-cart")
	public WebElement verifyCartButtonInput;
}
