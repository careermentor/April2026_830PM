package org.wipro.auto.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.ecommerce.utilties.ReadProperties;

public class ProductPage 
{

	WebDriver driver;
	
	public ProductPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	
	public void click_product_menu() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.readelement("home_menu_products_xpath"))).click();
	}
	
		public void enter_searchProduct_textbox(String productname) throws Exception
	{
		driver.findElement(By.id(ReadProperties.readelement("product_search_textbox_id"))).sendKeys(productname);
	}
	
	public void click_searchbutton() throws Exception
	{
		driver.findElement(By.id(ReadProperties.readelement("product_search_button_id"))).click();
	}
	
}
