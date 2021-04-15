package com.demo.ExecutingProcedureExmp;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(TestSuite.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.getMessage());
		}
		
		System.out.println(result.wasSuccessful());
	}

	}


