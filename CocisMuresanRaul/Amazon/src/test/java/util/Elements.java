package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Elements class localize the elements from page
 * @author rcocismuresan
 * @version 1.0
 */
public class Elements {

	@FindBy(id = "ap_email")
	public WebElement emailInput;

	@FindBy(id = "ap_password")
	public WebElement pass;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement search;

	@FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div[4]/div/div/div/h3/a/span")
	public WebElement select;

	@FindBy(id = "add-to-cart-button")
	public WebElement addToCart;

}
