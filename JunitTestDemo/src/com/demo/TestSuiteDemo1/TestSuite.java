package com.demo.TestSuiteDemo1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({TestClass1.class,TestClass2.class})
public class TestSuite {

	
	void test() {
		
	}

}

