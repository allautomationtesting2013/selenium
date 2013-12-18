package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	
	@FindBy(name = "username")
	public WebElement usernameInput;

	@FindBy(name = "j_password")
	public WebElement password;
	
	@FindBy(name = "loginBtn")
	public WebElement loginButton;
	
	@FindBy(id = "searchTerm")
	public WebElement searchInput;
	
	@FindBy(xpath = "/html/body/div/div/table/tbody/tr/td[3]/input")
	public WebElement searchButton;
	
	@FindBy(xpath = "//*[@id='j_id573:0:addToCartForm_:addToOrder']")
	public WebElement addToCart;

	@FindBy(xpath = "/html/body/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr/td/div/a")
	public WebElement signOutButton;
	
}

