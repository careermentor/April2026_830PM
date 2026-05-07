package org.wipro.auto.ecommerce.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.ecommerce.base.InitiateBrowser;
import org.wipro.auto.ecommerce.pages.ProductPage;

public class ProductScenario extends InitiateBrowser
{

	@Test
	public void Test_Case_9_Search_Product() throws Exception
	{
		
		ProductPage prod = new ProductPage(driver);
		
		prod.click_product_menu();
		prod.enter_searchProduct_textbox("summer white top");
		prod.click_searchbutton();
		
	}
	
}
