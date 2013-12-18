package com.endava.training.amazon;

import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.endava.training.util.ChromeSettings;
import com.endava.training.util.SettingsAmazon;

/**
 * This class extends ChromeSettings class and runs the tests inside this class
 * on Chrome browser only.
 * 
 * @author AnMuresan
 * @version
 */
public class TestAddProductToCartChrome extends ChromeSettings {

	/**
	 * This test method verifies the successful login and add to cart a product
	 * actions on amazon.com website.
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testAddToCart() throws InterruptedException {

		ResourceBundle bundle2 = ResourceBundle.getBundle("values");

		String AMAZON_URL = bundle2.getString("amazon_url");
		String USERNAME = bundle2.getString("username_login");
		String PASSWORD = bundle2.getString("password_login");
		String SEARCH_INPUT = bundle2.getString("search_input");

		driver.get(AMAZON_URL);
		driver.manage().deleteAllCookies();
		new PageFactory();
		final SettingsAmazon searchPage = PageFactory.initElements(driver,
				SettingsAmazon.class);
		searchPage.signInTitle.click();
		searchPage.usernameInput.sendKeys(USERNAME);
		searchPage.passwordInput.sendKeys(PASSWORD);
		Thread.sleep(3000);
		searchPage.signInButton.click();
		Thread.sleep(1000);
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
