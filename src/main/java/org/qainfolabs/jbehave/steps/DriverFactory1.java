package org.qainfolabs.jbehave.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverFactory1 {

	private static  WebDriver driver;
	private enum browser {firefox, ie, chrome}
	public DriverFactory1() {
		this.setBrowser();
		this.getBrowser();
	}

	public void setBrowser() {
		String b = System.getProperty("browser", "firefox");
		DriverFactory1.driver = new FirefoxDriver();
	}

	
	public synchronized WebDriver getBrowser() {
		return driver;
	}
	
}
