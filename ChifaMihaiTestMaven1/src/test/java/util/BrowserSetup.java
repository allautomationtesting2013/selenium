package util;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSetup {

		public WebDriver driver;
		public void FirefoxBrowser(){
			driver=new FirefoxDriver();
		}
		public void ChromeDriver(){
			System.setProperty("webdriver.chrome.driver",
					"src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();

		}
		public void IEDriver(){
			System.setProperty("webdriver.ie.driver",
				    "src/test/resources/IEDriverServer.exe");
			// assumeTrue(isSupportedPlatform());
			  driver = new InternetExplorerDriver();
		}
		
		@After
		public void quit(){
			driver.quit();
		}
}
