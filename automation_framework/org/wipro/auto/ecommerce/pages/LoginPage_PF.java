package org.wipro.auto.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.ecommerce.utilties.ReadProperties;

public class LoginPage_PF 
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login1")
	WebElement username_textbox;
	
	@FindBy(name="passwd")
	WebElement password_textbox;
	
	@FindBy(css="[class='signin-btn']")
	WebElement click_loginbttn;

	public void enter_rediffmailid_textbox(String emailid) throws Exception
	{
		//WebElement username_textbox = driver.findElement(By.id(ReadProperties.readelement("login_rediffmailid_id")));
		username_textbox.sendKeys(emailid);
	}
	
	public void enter_password_textbox(String pass) throws Exception
	{
		//driver.findElement(By.name(ReadProperties.readelement("login_password_name"))).sendKeys(pass);
		password_textbox.sendKeys(pass);
	}
	
	
	public void click_loginbttn() throws Exception
	{
		//driver.findElement(By.cssSelector(ReadProperties.readelement("login_loginbttn_css"))).click();
		click_loginbttn.click();
	}
	
}
