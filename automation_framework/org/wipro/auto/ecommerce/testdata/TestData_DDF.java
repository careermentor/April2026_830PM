package org.wipro.auto.ecommerce.testdata;

import org.testng.annotations.DataProvider;

public class TestData_DDF 
{

	@DataProvider(name="login")
	public Object[][] logindata()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};  //1-D
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-D
		
		return data3;
		
	}
	
	@DataProvider(name="register")
	public Object[][] regsiterdata()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};  //1-D
		Object[][] data3 = {{"John Seo","it_john","15"},{"David Leo","it_davi","16"},{"Neena Punjabi","it_neena","17"}};  //2-D
		
		return data3;
		
	}
	
}
