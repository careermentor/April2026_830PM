package org.xyz.automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKeyboardMouseWindowsFramesAlerts 
{

	WebDriver driver;
	
	
	@Test
	public void handle_frames() throws Exception
	{
		
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		CaptureScreenshot.testresult(driver,"handle_frames_1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		CaptureScreenshot.testresult(driver,"handle_frames_2");
		
	}
		
	@Test(enabled=true)
	public void handle_alerts() throws Exception
	{
		
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.testresult(driver,"handle_alerts");
		
	}
	
	
	@Test(enabled=false)
	public void handleMouse_MultipleWindows() throws Exception
	{
		
		driver = new ChromeDriver();
		
		driver.get("https://www.mphasis.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//driver.findElement(By.xpath("//a[text()='Our Approach']")).click();
		
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		//act.click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowsid = driver.getWindowHandles();
		
		System.out.println(windowsid);
		
		Iterator<String> itr = windowsid.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		driver.switchTo().window(win1);
	
	}
	
	@Test(enabled=false)
	public void handleKeyboard()
	{
		
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys("it_john").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
	
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass1234").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		WebElement element1 = driver.findElement(By.id("element1"));
		WebElement element2 = driver.findElement(By.id("element2"));
		
		act.dragAndDrop(element1, element2).perform();
		
		
		
	}
	
}
