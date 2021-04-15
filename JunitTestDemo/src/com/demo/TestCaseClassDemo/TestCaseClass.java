package com.demo.TestCaseClassDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCaseClass extends TestCase{

	@Override
	@Before
	public void setUp() {
		
	}
	
	
	  @Test
	  public void test() {
		  System.out.println("Not yet implemented"); 
	  }
	 
	
	@Test
	public void testCaseDemo() {
		System.out.println("No of test cases "+this.countTestCases());
		
		String name=this.getName();
		System.out.println("Test case name "+name);
		
		this.setName("TestNewAdd");
		String newName= this.getName();
		System.out.println("Updated test case name "+newName);
		
	}
	
	@Override
	@After
	public void tearDown() {
		
	}

}
