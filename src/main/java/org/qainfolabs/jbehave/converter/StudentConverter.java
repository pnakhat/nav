package org.qainfolabs.jbehave.converter;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.steps.ParameterConverters.ParameterConverter;

public class StudentConverter implements ParameterConverter {
	
	private ExamplesTableFactory factory;

	public StudentConverter(ExamplesTableFactory factory) {
		this.factory = factory;
	}

	public boolean accept(Type type) {
		if (type instanceof Class<?>) {
            return StudentBean.class.isAssignableFrom((Class<?>) type);
        }
        return false;
	}

	public Object convertValue(String value, Type type) {
		// TODO Auto-generated method stub
		List<Map<String,String>> data= factory.createExamplesTable(value).getRows();
		StudentBean sb = new StudentBean(data);
		sb.setStudentBean(data);
		return sb;
	}


}
