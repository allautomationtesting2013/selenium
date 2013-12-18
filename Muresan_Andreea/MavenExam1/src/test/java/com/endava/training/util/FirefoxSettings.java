package com.endava.training.util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class contains the methods to execute before and after any test run with
 * Mozilla Firefox browser.
 * 
 * @author AnMuresan
 * @version 1.0
 */
public class FirefoxSettings {

	protected WebDriver driver;

	@Before
	public void setUp() throws Exception {

		driver = new FirefoxDriver();

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
