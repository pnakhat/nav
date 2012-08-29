package org.qainfolabs.jbehave.pages;


public class Pages {
	
	
	static {
		new Pages();
	}
	
	
	public static LoginPage loginPage(){
		return new LoginPage();
	}
	
	public static HomePage homePage(){
		return new HomePage();
	}

}
