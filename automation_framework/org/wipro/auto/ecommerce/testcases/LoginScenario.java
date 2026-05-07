package org.wipro.auto.ecommerce.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.ecommerce.base.InitiateBrowser;
import org.wipro.auto.ecommerce.pages.LoginPage_PF;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_validate_login_crednetails_valid_data() throws Exception
	{
		
		LoginPage_PF login = new LoginPage_PF(driver);
		
		login.enter_rediffmailid_textbox("it_john");
		login.enter_password_textbox("pas1234");
		login.click_loginbttn();
		
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
		
	}
	
}
