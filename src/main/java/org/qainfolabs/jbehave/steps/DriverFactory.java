package org.qainfolabs.jbehave.steps;

import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	private static WebDriver driver;
	public boolean driverExists = false;

	static {
		get();
	}
	
	
	
	public WebDriver getBrowser() {
			return DriverFactory.driver;
	}
	
	

	@BeforeStory
	public void createBrowser(){
		if(!driverExists){
			FirefoxProfile fp  = new FirefoxProfile();
			fp.setEnableNativeEvents(true);
			driver = new FirefoxDriver(fp);
			//driver = new InternetExplorerDriver();
			driverExists = true;
		}
	}

	@AfterStory
	public void closeBrowser() {
	 if(driverExists){
		 driver.quit();
	 }
	 driverExists = false;
	}




	public static DriverFactory get() {
		return new DriverFactory();
	}
}
