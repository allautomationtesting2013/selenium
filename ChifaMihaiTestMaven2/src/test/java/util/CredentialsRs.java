package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CredentialsRs {

		@FindBy(name="username")
		public WebElement userName;
		
		@FindBy(name="j_password")
		public WebElement password;
		
		@FindBy(name="loginBtn")
		public WebElement button;
	
		
}
