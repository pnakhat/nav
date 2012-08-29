package org.qainfolabs.jbehave.pages;


import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.qainfolabs.jbehave.steps.DriverFactory;

public class HomePage {
	
	
	private WebDriver browser;
	
	
	
	public HomePage() {
		this.browser = DriverFactory.get().getBrowser();
	}

	public void open(){
		browser.get("http://newtours.demoaut.com");
	}
	
	public void login(String username, String passwords){
	}
	
	
	public void verifUserIsLoggedIn(){
		try {
			browser.findElement(By.id("navAccount"));
		} catch (NoSuchElementException e) {
			Assert.fail("Not logged in");
		}
	}
}
