package org.xyz.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo_WebElements
{


	@Test
	public void webelements_demo() throws Exception
	{
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");  // Launch in incognito mode
		
		 // Launch browser
        WebDriver driver = new ChromeDriver(options);

        // Open application URL
        driver.get("https://www.saucedemo.com/");   // Replace with actual URL

        // Maximize browser
        driver.manage().window().maximize();

        // Enter Username
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        // Enter Password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        // Click Login button
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        //org.openqa.selenium.NoSuchElementException: no such element
        loginBtn.click();

        // Close browser
       // driver.quit();
		
        
        //list of product:
        
       List<WebElement> productlist =  driver.findElements(By.cssSelector("[class='inventory_item_name _text1234']"));
       
       /*
       0
       FAILED: org.xyz.automation.Demo_WebElements.webelements_demo
       java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
       */
       System.out.println(productlist.size());  //6
       
       
      System.out.println(productlist.get(1).getText());  //print the second product name
       
       //print all the product list
      /* 
       for(WebElement list: productlist)
       {
    	   System.out.println(list.getText());
       }
	*/
	}
	
	}
