package org.qainfolabs.app;

import java.math.BigDecimal;

public class Calculator {
	private BigDecimal input1;
	private BigDecimal input2;
	
	public BigDecimal sum(BigDecimal input1, BigDecimal input2) {
		setInput1(input1);
		setInput2(input2);
		return getInput1().add(getInput2());
	}

	public void setInput1(BigDecimal input1) {
		this.input1 = input1;
	}

	public BigDecimal getInput1() {
		return input1;
	}

	public void setInput2(BigDecimal input2) {
		this.input2 = input2;
	}

	public BigDecimal getInput2() {
		return input2;
	}

}
