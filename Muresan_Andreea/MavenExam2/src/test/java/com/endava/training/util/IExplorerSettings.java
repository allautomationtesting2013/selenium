package com.endava.training.util;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * This class contains the methods to execute before and after any test run with
 * Internet Explorer browser.
 * 
 * @author AnMuresan
 * @version 1.0
 */
public class IExplorerSettings {

	protected WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.ie.driver",
				"src/test/resources/IEDriverServer.exe");
		driver = new InternetExplorerDriver();

	}

	@After
	public void tearDown() {

		driver.quit();

	}

}
