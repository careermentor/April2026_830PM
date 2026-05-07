package org.wipro.auto.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.ecommerce.utilties.ReadProperties;

public class RegsiterPage 
{

	WebDriver driver;
	
	public RegsiterPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}

	
	public void click_newrediffmailid_link() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.readelement("login_newuser_getnewrediffmailid_xpath"))).click();
	}
	
	public void enter_fullname_textbox(String fname) throws Exception
	{
		driver.findElement(By.cssSelector(ReadProperties.readelement("register_fullname_css"))).sendKeys(fname);
	}
	
	public void enter_rediffmail_textbox(String email) throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.readelement("register_emailid_xpath"))).sendKeys(email);
	}
	
	public void select_dob_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.cssSelector(ReadProperties.readelement("register_dob_day_css"))));
		
		dob_day.selectByVisibleText(day);
	}
	
	public void click_gender_female() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.readelement("register_gender_female_xpath"))).click();
	}
	
		
}
