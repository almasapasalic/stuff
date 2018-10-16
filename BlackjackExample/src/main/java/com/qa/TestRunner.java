package com.qa;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

public class TestRunner {
	public static void main(String[] args) {
		TestRunner.allTests(); 
	}
	public static void allTests() { 
		Result result = JUnitCore.runClasses(
				InvalidEntriesSuite.class,
				ValidEntriesSuite.class); 
		
		System.out.println("All results passes: " + result.wasSuccessful());
		
		if (!result.wasSuccessful()) { 
			System.out.println("Failed Tests:");
			for (Failure failure: result.getFailures()) { 
				System.out.println(failure.getMessage());
			}
		}
	}
}
