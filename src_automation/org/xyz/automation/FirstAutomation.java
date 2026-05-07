package org.xyz.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstAutomation
{

	@Test
	public void validat_login_functionality()
	{
		WebDriver driver = new ChromeDriver(); //launch the chrome browser
		
		//pass the url
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("modisantosh");
		
		username.clear();
		
		username.sendKeys("johnleo");
		
		driver.findElement(By.name("passwd")).sendKeys("pass12345");
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		//driver.close();   //close the browser
		
	}
	
}
