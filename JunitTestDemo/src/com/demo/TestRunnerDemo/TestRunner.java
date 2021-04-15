package com.demo.TestRunnerDemo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result=JUnitCore.runClasses(TestClass1.class,TestClass2.class);
		
		for(Failure failure : result.getFailures()) {
//			System.out.println(failure.getMessage());
		}
		
		System.out.println(result.wasSuccessful());
	}

}
