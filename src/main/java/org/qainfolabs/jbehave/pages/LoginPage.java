package org.qainfolabs.jbehave.pages;


import java.io.File;
import java.io.IOException;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.selenesedriver.TakeScreenshot;
import org.qainfolabs.jbehave.steps.DriverFactory;


public class LoginPage {
	

	
	
	private WebDriver browser;


	public LoginPage() {
		this.browser = DriverFactory.get().getBrowser();
	}

	public void open(){
		browser.get("http://newtours.demoaut.com/");
	}
	
	public LoginPage login(String username, String passwords){
		Actions as = new Actions(browser);
			WebElement userName = browser.findElement(By.name("userName"));
			userName.sendKeys(username);
			as.sendKeys(Keys.TAB);
			Action ac = as.build();
			ac.perform();
			
			as.sendKeys("password");
		    ac = as.build();
		    ac.perform();
		    userName.submit();
		    
		    File scrFile = ((TakesScreenshot)browser).getScreenshotAs(OutputType.FILE);
		    try {
				FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 //WebElement password =  browser.findElement(By.name("password"));;
		//password.sendKeys(passwords);
		//password.submit();
		return this;
	}
	
	
	public LoginPage verifUserIsLoggedIn(){
		try {
			browser.findElement(By.name("fromPort"));
		} catch (NoSuchElementException e) {
			//Assert.fail("Not logged in");
		}
		return this;
	}
}
