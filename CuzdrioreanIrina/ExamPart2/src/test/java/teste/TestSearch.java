package teste;

import java.util.ResourceBundle;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import utils.BrowserSettings;
import utils.SearchPage;

public class TestSearch extends BrowserSettings{
	
	ResourceBundle bundle = ResourceBundle.getBundle("values");
	String USER = bundle.getString("USER");
	String PASS = bundle.getString("PASS");
	String SEARCH_WORD = bundle.getString("SEARCH_WORD");
	String RS_URL = bundle.getString("RS_URL");

	@Test
	public void testSearch(){
		
		driver.get(RS_URL);
		
		new PageFactory();
		final SearchPage searchPage = PageFactory.initElements(driver,
				SearchPage.class);
		
		searchPage.usernameInput.sendKeys(USER);
		searchPage.password.sendKeys(PASS);
		searchPage.loginButton.click();
		searchPage.searchInput.sendKeys(SEARCH_WORD);
		searchPage.searchButton.click();
		searchPage.addToCart.click();
		searchPage.signOutButton.click();
		
	}
}
