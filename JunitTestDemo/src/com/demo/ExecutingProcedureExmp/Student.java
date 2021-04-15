package com.demo.ExecutingProcedureExmp;

public class Student {
	
	String name;
	int percentage;
	String grade;
	
	public Student(String name, int percentage ) {
		super();
		this.name = name;
		this.percentage = percentage;
	}
	
	public String cal_grade() {
		if(percentage <35) {
			grade="Fail";
		}
		else if(percentage <50)
			grade = "Pass class";
		else if(percentage <60)
			grade = "second class";
		else if(percentage <70)
			grade = "First class";
		else
			grade="Distinction";
		return grade;
	}
	
	
	
}
