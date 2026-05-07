package org.xyz.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Caldenar_Demo
{


	@Test
	public void calendar_text() throws Exception
	{
		WebDriver driver = new EdgeDriver(); //launch the chrome browser
		
		//pass the url
		
		driver.get("https://practice-automation.com/calendars/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2007-05-14");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.xpath("//button[text()='14']")).click();
	
	}
	
	
	@Test(enabled=false)
	public void calendar_icon() throws Exception
	{
		WebDriver driver = new ChromeDriver(); //launch the chrome browser
		
		//pass the url
		
		driver.get("https://www.booking.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[aria-label='Dismiss sign-in info.']")).click();
		
		driver.findElement(By.xpath("//span[text()='Check-in date']")).click();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.cssSelector("[aria-label='Sa 25 April 2026']")).click();
		
		driver.findElement(By.cssSelector("[aria-label='Mo 27 April 2026']")).click();
		
	}
	
}
