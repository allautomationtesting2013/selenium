package testsMoizlla;

import java.util.ResourceBundle;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSetup;
import util.CredentialsRs;

public class VerifyProductRsOnlineTest extends BrowserSetup{

	private static final String URL ="https://uk.rs-online.com/web/authHome.html";
	@Test
	public void test(){
		ResourceBundle bundle1 = ResourceBundle.getBundle("credentialale");
		MozilaDriver();
		driver.get(URL);
		
		
		String usern=bundle1.getString("nume");
		String pass=bundle1.getString("password");
		
		new PageFactory();
		final CredentialsRs re = PageFactory.initElements(
				driver, CredentialsRs.class);
		
		new PageFactory();
		
		
		re.userName.sendKeys(usern);
		re.password.sendKeys(pass);
		re.button.click();
		driver.findElement(By.id("basketItemCount")).click();
}
}