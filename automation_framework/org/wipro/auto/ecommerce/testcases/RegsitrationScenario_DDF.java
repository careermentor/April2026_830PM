package org.wipro.auto.ecommerce.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.ecommerce.base.InitiateBrowser;
import org.wipro.auto.ecommerce.pages.RegsiterPage;
import org.wipro.auto.ecommerce.testdata.TestData_DDF;

public class RegsitrationScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="register",dataProviderClass=TestData_DDF.class)
	public void tc02_validate_regsitartion_validdata(String fullname, String emailid, String day) throws Exception
	{
		
		RegsiterPage reg = new RegsiterPage(driver);
		
		
		reg.click_newrediffmailid_link();
		reg.enter_fullname_textbox(fullname);
		reg.enter_rediffmail_textbox(emailid);
		reg.select_dob_day(day);
		reg.click_gender_female();
		
	}
	
}
