package com.demo.one;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationDemo {

	static int beforeClassCount=1;
	static int afterClassCount=1;
	static int beforeCount=1;
	static int afterCount=1;
	
	@Before  //everytime before test method
	public void setup() {
		System.out.println("Execution count of before method is "+beforeCount++);
		}
	
	@BeforeClass   //only once
	public static void  setUpClass() {
		System.out.println("Execution count of beforeClass method is "+beforeClassCount++);
	}
	
	@Test
	public void test1() {
		System.out.println("test1 method implemented");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 method implemented");
	}
	
	@Test
	public void test3() {
		System.out.println("test3 method implemented");
	}
	
	@After
	public void tearDown() {
		System.out.println("Execution count after method "+afterCount++);
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Execution count afterClass method "+afterClassCount++);
	}

}
