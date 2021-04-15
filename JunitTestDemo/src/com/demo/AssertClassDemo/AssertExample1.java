package com.demo.AssertClassDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class AssertExample1 {
	int num;
	String temp;
	String str;
	
	@Before
	public void setUp() {
		num=5;
		temp=null;
		str="Junit is working fine";
	}
	
	@Test
	public void test() {
		
		//check for equality
		assertEquals("Junit is working fine..", str);
		
		//check for false condition
		assertFalse(num>6);
		
		//check for not null value
		assertNotNull(str);
		
		//check for null
		assertNull(temp);
		
		//check for true condition
		assertTrue(num==5);
		
	}

}
