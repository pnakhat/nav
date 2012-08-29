package org.qainfolabs.app;


import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestRemoteWD {

	@Test
	public void test() throws MalformedURLException {
		DesiredCapabilities cp = DesiredCapabilities.internetExplorer();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cp);
		driver.get("http://www.google.co.uk");
		
	}

}
