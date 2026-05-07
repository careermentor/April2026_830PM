package org.wipro.auto.ecommerce.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.auto.ecommerce.utilties.ReadProperties;

public class InitiateBrowser
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadProperties.readconfig("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadProperties.readconfig("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ReadProperties.readconfig("BrowserName").equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		
		else 
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadProperties.readconfig("ApplicationURL"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
}
