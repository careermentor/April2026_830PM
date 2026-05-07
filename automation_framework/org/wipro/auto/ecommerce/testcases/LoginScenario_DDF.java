package org.wipro.auto.ecommerce.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.ecommerce.base.InitiateBrowser;
import org.wipro.auto.ecommerce.pages.LoginPage_PF;
import org.wipro.auto.ecommerce.testdata.TestData_DDF;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="login",dataProviderClass=TestData_DDF.class)
	public void tc01_validate_login_crednetails_valid_data(String username, String password) throws Exception
	{
		
		LoginPage_PF login = new LoginPage_PF(driver);
		
		login.enter_rediffmailid_textbox(username);
		login.enter_password_textbox(password);
		//login.click_loginbttn();
		
			
	}
	
	

	
}
