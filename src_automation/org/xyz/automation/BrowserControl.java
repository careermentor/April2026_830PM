package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserControl
{

	@Test
	public void browser_control()
	{
		WebDriver driver = new EdgeDriver(); //launch the edge browser
		
		//pass the url
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit(); //will close all the open window
		
		//driver.close();  //will close only one open window
		
	}
	
}
