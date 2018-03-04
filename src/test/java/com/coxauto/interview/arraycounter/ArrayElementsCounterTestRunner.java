package com.coxauto.interview.arraycounter;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Raghavendra Reddy Lankala.
 *
 */
public class ArrayElementsCounterTestRunner {
	
	/**
	 * @param args
	 * TestRunner method: executes all the test cases from ArrayElementsCounterTest class 
	 * and prints true if the all the test cases are passed else shows the failure trace.	 * 
	 */
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(ArrayElementsCounterTest.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
	
}