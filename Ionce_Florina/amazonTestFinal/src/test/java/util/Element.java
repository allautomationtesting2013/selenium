package util;

/** 
 * This class Element localizes the elements from the page
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Element {

	@FindBy(id = "nav-signin-text")
	public WebElement signin;
	@FindBy(id = "ap_email")
	public WebElement emailInput;

	@FindBy(id = "ap_password")
	public WebElement passwordInput;

	@FindBy(id = "signInSubmit-input")
	public WebElement submitButton;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement search;

	@FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div[4]/div/div/div/h3/a/span")
	public WebElement object;

	@FindBy(id = "add-to-cart-button")
	public WebElement addButton;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div/div/div[2]/a")
	public WebElement editCart;

}
