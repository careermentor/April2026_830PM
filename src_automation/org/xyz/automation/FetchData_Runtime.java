package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchData_Runtime
{

	
	@Test
	public void fetch_element_state() throws Exception
	{
		WebDriver driver = new EdgeDriver(); //launch the chrome browser
		
		//pass the url
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		boolean remember_me = driver.findElement(By.id("remember")).isSelected();
		System.out.println(remember_me); //true
		
		driver.findElement(By.id("remember")).click();
		
		boolean remember_me_uncheck = driver.findElement(By.id("remember")).isSelected();
		System.out.println(remember_me_uncheck); //false
		
		System.out.println(driver.findElement(By.name("proceed")).isEnabled());  //true
		
		System.out.println(driver.findElement(By.name("proceed")).isDisplayed());  //true
	
	}

	@Test(enabled=false)
	public void fetch_element_browser_information() throws Exception
	{
		WebDriver driver = new EdgeDriver(); //launch the chrome browser
		
		//pass the url
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		Point loc_coordinate = driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).getLocation();
		System.out.println(loc_coordinate);
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		
		String full_username = driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).getAttribute("placeholder");
		System.out.println(full_username);
		
		Assert.assertEquals(full_username, "Enter your full name");
		
		String act_linktext = driver.findElement(By.xpath("//h2[text()='Create a Rediffmail account']")).getText();
		System.out.println(act_linktext);
		
		
		Assert.assertEquals(act_linktext, "Create a Rediffmail account");
		
		
		//System.out.println(driver.getPageSource());
		
	}
	

	@Test(enabled=false)
	public void fetch_browser_information() throws Exception
	{
		WebDriver driver = new EdgeDriver(); //launch the chrome browser
		
		//pass the url
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		
		String act_url = driver.getCurrentUrl();
		System.out.println(act_url);
		
		Assert.assertEquals(act_url, "https://register.rediff.com/register/register.php?FormName=user_details");
		
		String act_title_registration = driver.getTitle();
		System.out.println(act_title_registration);
		
		Assert.assertEquals(act_title_registration, "Rediffmail Free Unlimited Storage");
		
	}
	
}
