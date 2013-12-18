package testsIE;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSetup;
import util.MedscapeLoginCredentials;

public class MedscapeLoginIE  extends BrowserSetup{
	
	@Test
	public void loginTest() throws InterruptedException{
	IEDriver();
	driver.get("https://login.medscape.com/login/sso/getlogin?ac=401");
	driver.manage().deleteAllCookies();
//	//ResourceBundle bundle1 = ResourceBundle.getBundle("credentiales");
//	String usern=bundle1.getString("AnaPop192");
//	String pass=bundle1.getString("pas192");
//	
	
	
	new PageFactory();
	final MedscapeLoginCredentials mlc = PageFactory.initElements(driver, MedscapeLoginCredentials.class);
	mlc.userid.clear();
	mlc.userid.sendKeys("AnaPop192");
	mlc.password.sendKeys("pas123");
	mlc.buttonL.click();
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]/div/a")).click();
	driver.findElement(By.id("logoutbtn")).click();
	
	
}
}
