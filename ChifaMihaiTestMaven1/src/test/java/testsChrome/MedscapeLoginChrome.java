package testsChrome;

//import java.util.ResourceBundle;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSetup;
import util.MedscapeLoginCredentials;

public class MedscapeLoginChrome extends BrowserSetup {
	@Test
	public void loginTest() {
		ChromeDriver();
		driver.get("https://login.medscape.com/login/sso/getlogin?ac=401");
//		ResourceBundle bundle1 = ResourceBundle.getBundle("credentiales");
//		String usern = bundle1.getString("username");
//		String pass = bundle1.getString("password");

		new PageFactory();
		final MedscapeLoginCredentials mlc = PageFactory.initElements(driver,
				MedscapeLoginCredentials.class);

		mlc.userid.sendKeys("AnaPop192");
		mlc.password.sendKeys("pas123");
		mlc.buttonL.click();
	}
}
