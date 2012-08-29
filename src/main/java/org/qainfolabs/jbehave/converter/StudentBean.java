package org.qainfolabs.jbehave.converter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StudentBean {

	private ArrayList<Object> studentID;
	private String[] studentName;
	private List<Map<String, String>> studentData;

	public StudentBean(List<Map<String, String>> data) {
		this.studentData = data;
	}


	

	public ArrayList<Object> getStudentBean() {
		return this.studentID;
	}



	public void setStudentBean(List<Map<String, String>> data) {
		int i=0;
		studentID = new ArrayList<Object>();
		for (Map<String, String> data1:data){
			studentID.add(data1.get("name"));
			i++;
		}
	}

}
