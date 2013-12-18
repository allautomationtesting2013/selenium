package com.endava.training.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class contains the web elements from Login and Search page on amazon.com
 * web site.
 * 
 * @author AnMuresan
 * 
 */
public class SettingsAmazon {

	@FindBy(id = "nav-signin-title")
	public WebElement signInTitle;

	@FindBy(id = "ap_email")
	public WebElement usernameInput;

	@FindBy(id = "ap_password")
	public WebElement passwordInput;

	@FindBy(id = "signInSubmit-input")
	public WebElement signInButton;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchBox;

	@FindBy(xpath = "/html/body/header/div/div[2]/div[2]/div/form/div[2]/input")
	public WebElement searchButton;

	@FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div[4]/div/div/div/h3/a")
	public WebElement firstResult;

	@FindBy(id = "add-to-cart-button")
	public WebElement addToCartButton;

	@FindBy(name = "editCart")
	public WebElement editCartButton;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[4]/form/div/h2")
	public WebElement confirmationMessage;

}
