package com.endava.training.amazon;

import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.endava.training.util.FirefoxSettings;
import com.endava.training.util.SettingsAmazon;

/**
 * This class extends FirefoxSettings class and runs the test inside this class
 * on Mozilla Firefox browser only.
 * 
 * @author AnMuresan
 * @version 1.0
 */
public class TestAddProductToCartFirefox extends FirefoxSettings {

	/**
	 * This test method verifies the successful login and add to cart a product
	 * actions on amazon.com website.
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void testAddToCart() throws InterruptedException {

		ResourceBundle bundle1 = ResourceBundle.getBundle("values");

		String AMAZON_URL = bundle1.getString("amazon_url");
		String USERNAME = bundle1.getString("username_login");
		String PASSWORD = bundle1.getString("password_login");
		String SEARCH_INPUT = bundle1.getString("search_input");

		driver.get(AMAZON_URL);
		driver.manage().deleteAllCookies();
		new PageFactory();
		final SettingsAmazon searchPage = PageFactory.initElements(driver,
				SettingsAmazon.class);
		searchPage.signInTitle.click();
		Thread.sleep(10000);
		searchPage.usernameInput.sendKeys(USERNAME);
		Thread.sleep(10000);
		searchPage.passwordInput.sendKeys(PASSWORD);
		Thread.sleep(10000);
		searchPage.signInButton.click();
		Thread.sleep(10000);
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
