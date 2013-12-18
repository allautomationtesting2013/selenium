package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageReg {
	
	@FindBy(id = "ap_email")
	public WebElement emailInput;
	
	
	@FindBy(id = "ap_signin_existing_radio")
	public WebElement radioBInput;

	@FindBy(id = "ap_password")
	public WebElement passwInput;

	@FindBy(id = "signInSubmit-input")
	public WebElement submittBInput;

	@FindBy(name = "field-keywords")
	public WebElement searchInput;

	@FindBy(xpath = "/html/body/header/div/div[2]/div[2]/div/form/div[2]/input")
	public WebElement link1Input;
	
	@FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div[4]/div/div/div[2]/h3/a/span")
	public WebElement link2Input;
	
	@FindBy(xpath = "/html/body/div[2]/div[4]/div[2]/div/div/form/div[2]/div/div/div/div/i")
	public WebElement radioB2Input;
	
	
	@FindBy(name = "submit.add-to-cart")
	public WebElement addInput;
	

	@FindBy(xpath = "html/body/div[2]/div/div/div[2]/div[2]/div/div/div[2]/form/input[4]")
	public WebElement editInput;
	
	@FindBy(xpath = "html/body/div[2]/div[2]/div[4]/form/div[2]/div/div/div[4]/div[2]/div[4]/a")
	public WebElement deleteInput;
	
//	
//   @FindBy(id = "confirm-text")
//	public WebElement confirmationMsgText;
	

}
