package org.qainfolabs.jbehave.converter;

import java.lang.reflect.Type;
import java.math.BigDecimal;

import org.jbehave.core.steps.ParameterConverters.ParameterConverter;
import org.qainfolabs.app.Calculator;

public class MyConverter implements ParameterConverter {

	public boolean accept(Type type) {
		if (type instanceof Class<?>) {
            return Calculator.class.isAssignableFrom((Class<?>) type);
        }
        return false;
	}

	public Object convertValue(String value, Type type) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setInput1(new BigDecimal(value));
		return c;
	}

}
