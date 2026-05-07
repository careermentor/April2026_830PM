package org.xyz.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediffmail_login_registration {

	WebDriver driver;

	
	@BeforeMethod
	public void launchbrowser() {

		driver = new ChromeDriver(); // launch the chrome browser

		// pass the url

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();
	}

	
	@AfterMethod
	public void closebrowser() {
		//driver.close();

	}

	@Test
	public void validat_registration_functionality() {

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();

		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Leo");

		Select con = new Select(driver.findElement(By.id("country")));

		// con.selectByIndex(8); //Argentina
		// con.selectByValue("5"); //Angola
		con.selectByVisibleText("Australia");
		// con.selectByContainsVisibleText("Australia");

		// con.deselectAll(); //if it is list

		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//label[text()='Select a Security Question']")), "Select a Security Question"));
		
		Select hintq = new Select(driver.findElement(By.xpath("//select[contains(@name,'hintq')]")));
		hintq.selectByVisibleText("What is the name of your first school?");

	}

	@Test(enabled=false)
	public void validat_login_functionality() {
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("modisantosh");

		username.clear();

		username.sendKeys("johnleo");

		driver.findElement(By.name("passwd")).sendKeys("pass12345");

		driver.findElement(By.cssSelector("[type='checkbox']")).click();

		// driver.findElement(By.xpath("//button[text()='Log In']")).click();

	}

}
