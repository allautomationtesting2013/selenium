package com.endava.training.util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class contains the methods to execute before and after any test run with
 * Chrome browser.
 * 
 * @author AnMuresan
 * @version 1.0
 */
public class ChromeSettings {

	protected WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void tearDown() {

		driver.quit();

	}

}
