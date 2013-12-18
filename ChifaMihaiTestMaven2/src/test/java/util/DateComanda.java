package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DateComanda {

		@FindBy(xpath="/html/body/div/div/table/tbody/tr/td[4]/div/span/ul/li[2]/a/span")
		public WebElement allProducts;
		
		@FindBy(xpath="/html/body/div[2]/div[3]/div/table/tbody/tr/td/table/tbody/tr[6]/td/div/ul/li/a")
		public WebElement categorie;

		@FindBy(xpath="/html/body/div[2]/div[4]/table/tbody/tr/td/div/div/ul/li[9]/div/a")
		public WebElement subCategorie;

}
