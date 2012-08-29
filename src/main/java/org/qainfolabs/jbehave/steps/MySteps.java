package org.qainfolabs.jbehave.steps;

import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.qainfolabs.app.Calculator;
import org.qainfolabs.jbehave.converter.StudentBean;
import org.qainfolabs.jbehave.pages.Pages;

public class MySteps {
		
	
	private int aa;
	private int bb;
	

		
	@Given("I login to newtour as $userName")
	public void login(String userName){
		Pages.loginPage().open();
		Pages.loginPage().login(userName, userName).verifUserIsLoggedIn();
	}
	
	@Given("I have <number1> oranges and <number2> apple")
	public void readFruits(@Named("number1") int a, @Named("number2")int b){
		this.aa = a;
		this.bb = b;
		System.out.println("Number 1: " + a);
		System.out.println("Number 2: " + b);
	}
	
	@Then("I should have <total> fruits")
	public void doSum(@Named("total") int total){
		Assert.assertEquals(total, aa+bb);
	}
	
	@When("I read the data $exampleTable")
	public void readData(ExamplesTable et){
		List<Map<String, String>> data = et.getRows();
		
		for(Map<String, String> d: data){
			System.out.println(d.get("name"));
			System.out.println(d.get("address"));

		}
	}
	
	@Given("I am testing converter $data")
	public void testConverter(Calculator data){
		System.out.println(data.getInput1());
	}
	
	@Given("I am testing studentconverter $student")
	public void testStudent(StudentBean student){
		System.out.println("Student Data" + student.getStudentBean().toString());
	}
    
}
