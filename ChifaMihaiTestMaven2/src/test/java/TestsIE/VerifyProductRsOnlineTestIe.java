package TestsIE;

import java.util.ResourceBundle;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSetup;
import util.CredentialsRs;

public class VerifyProductRsOnlineTestIe extends BrowserSetup{

	private static final String URL ="https://uk.rs-online.com/web/authHome.html";
	@Test
	public void test() throws InterruptedException{
		ResourceBundle bundle1 = ResourceBundle.getBundle("credentialale");
		IEDriver();
		driver.get(URL);
		
		
		String usern=bundle1.getString("nume");
		String pass=bundle1.getString("password");
		
		new PageFactory();
		final CredentialsRs re = PageFactory.initElements(
				driver, CredentialsRs.class);
		
		new PageFactory();
		
		
		re.userName.sendKeys(usern);
		Thread.sleep(3000);
		re.password.sendKeys(pass);
		Thread.sleep(3000);
		re.button.click();
		Thread.sleep(3000);
		driver.findElement(By.id("basketItemCount")).click();
}
}