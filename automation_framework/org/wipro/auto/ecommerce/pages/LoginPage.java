package org.wipro.auto.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.ecommerce.utilties.ReadProperties;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}

	public void enter_rediffmailid_textbox(String emailid) throws Exception
	{
		driver.findElement(By.id(ReadProperties.readelement("login_rediffmailid_id"))).sendKeys(emailid);
	}
	
	public void enter_password_textbox(String pass) throws Exception
	{
		driver.findElement(By.name(ReadProperties.readelement("login_password_name"))).sendKeys(pass);
	}
	
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadProperties.readelement("login_loginbttn_css"))).click();
	}
	
}
