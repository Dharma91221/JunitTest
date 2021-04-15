package com.demo.ExecutingProcedureExmp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestDemo {

	Student s1,s2,s3,s4;
	
	@Before
	public void setUp() {
		s1=new Student("dharma", 35);
		s2=new Student("ajay", 50);
		s3=new Student("Ravi",60);
		s4=new Student("HAri", 70);
	}
	
	@Test
	public void testPass() {
		s1.cal_grade();
		assertEquals("Pass class", s1.grade);
	}
	
	@Test
	public void testSecond() {
		s2.cal_grade();
		assertEquals("second class", s2.grade);
	}
	
	@Test
	public void testFirst() {
		s3.cal_grade();
		assertEquals("First class", s3.grade);
	}
	
	@Ignore
//	@Test
	public void testDist() {
		s4.cal_grade();
		assertEquals("Distinction", s4.grade);
	}
	
	
	

}
