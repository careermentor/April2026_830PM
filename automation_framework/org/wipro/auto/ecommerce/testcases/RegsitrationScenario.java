package org.wipro.auto.ecommerce.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.ecommerce.base.InitiateBrowser;
import org.wipro.auto.ecommerce.pages.RegsiterPage;

public class RegsitrationScenario extends InitiateBrowser
{

	@Test
	public void tc02_validate_regsitartion_validdata() throws Exception
	{
		
		RegsiterPage reg = new RegsiterPage(driver);
		
		
		reg.click_newrediffmailid_link();
		reg.enter_fullname_textbox("John Seo");
		reg.enter_rediffmail_textbox("it_john");
		reg.select_dob_day("15");
		reg.click_gender_female();
		
	}
	
}
