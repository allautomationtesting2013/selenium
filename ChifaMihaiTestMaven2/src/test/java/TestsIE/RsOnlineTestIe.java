package TestsIE;

import java.util.ResourceBundle;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import util.BrowserSetup;
import util.CredentialsRs;
import util.DateComanda;


public class RsOnlineTestIe extends BrowserSetup{
		
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
			final DateComanda com = PageFactory.initElements(
					driver, DateComanda.class);
			
			re.userName.sendKeys(usern);
			re.password.sendKeys(pass);
			re.button.click();
			Thread.sleep(5000);
			com.allProducts.click();
			com.categorie.click();
			com.subCategorie.click();
			driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div/span/form/div[2]/ul/li[2]/div")).click();;
			driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/div/div/span/form/div[2]/ul/li[2]/ul/li[3]/a/span/span")).click();;
			driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[2]/span/div/div/div/table/tbody/tr[4]/td/div/div/div/a/img")).click();
			driver.findElement(By.name("addToCartForm_24563475:qtyWeb")).clear();
			driver.findElement(By.name("addToCartForm_24563475:qtyWeb")).sendKeys("2");
			driver.findElement(By.name("addToCartForm_24563475:addToOrder")).click();
		
	}
}
