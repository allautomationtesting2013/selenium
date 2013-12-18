package com.endava.training.amazon;

import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.endava.training.util.IExplorerSettings;
import com.endava.training.util.SettingsAmazon;

/**
 * This class extends IESettings class and runs the test inside this class on
 * Internet Explorer browser only.
 * 
 * @author AnMuresan
 * @version 1.0
 */
public class TestAddProductToCartIE extends IExplorerSettings {

	/**
	 * This test method verifies the successful login and add to cart a product
	 * actions on amazon.com website.
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testAddToCart() throws InterruptedException {

		ResourceBundle bundle3 = ResourceBundle.getBundle("values");

		String AMAZON_URL = bundle3.getString("amazon_url");
		String USERNAME = bundle3.getString("username_login");
		String PASSWORD = bundle3.getString("password_login");
		String SEARCH_INPUT = bundle3.getString("search_input");

		driver.get(AMAZON_URL);
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		new PageFactory();
		final SettingsAmazon searchPage = PageFactory.initElements(driver,
				SettingsAmazon.class);
		searchPage.signInTitle.click();
		searchPage.usernameInput.sendKeys(USERNAME);
		searchPage.passwordInput.sendKeys(PASSWORD);
		Thread.sleep(3000);
		searchPage.signInButton.click();
		Thread.sleep(3000);
		searchPage.searchBox.sendKeys(SEARCH_INPUT);
		searchPage.searchButton.click();
		Thread.sleep(3000);
		searchPage.firstResult.click();
		searchPage.addToCartButton.click();
		searchPage.editCartButton.click();
		Thread.sleep(3000);
		Assert.assertEquals("Shopping Cart",
				searchPage.confirmationMessage.getText());

	}

}
