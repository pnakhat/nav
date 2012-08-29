package org.qainfolabs.jbehave.steps;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;
import org.qainfolabs.app.Calculator;

public class CalulatorSteps {

	private BigDecimal input1;
	private BigDecimal input2;

	@Given("calculator takes <input1> and <input2>")
	public void readFruits(@Named("input1") BigDecimal input1,
			@Named("input2") BigDecimal input2) {
		this.input1 = input1;
		this.input2 = input2;
	}

	@Then("the sum is <sum>")
	public void doSum(@Named("sum") BigDecimal sum) {
		Calculator calc = new Calculator();
		Assert.assertEquals(sum, calc.sum(input1, input2));
	}

	@Given("I read a table $data")
	public void readTable(ExamplesTable table) {
		List<Map<String, String>> data = table.getRows();
		Iterator it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
