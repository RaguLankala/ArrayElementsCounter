package com.coxauto.interview.arraycounter;


import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Raghavendra Reddy Lankala.
 * JUnit test cases for mergeCounter().
 */
public class ArrayElementsCounterTest 
    
{
	Random random = new Random();
    ArrayElementsCounter arrayElementsCounter = new ArrayElementsCounter();
	int arrayLength = random.nextInt(10000) + 1;
	
	int[] array1 = new int[arrayLength]; 
	int[] array2 = {20,30,1,2,1,3,4,4,5};
    
	
	/**
	 * Add numbers to array1 before running test cases.
	 */
	@Before
	public void addArrayElements() {
		for(int i=0; i<arrayLength; i++) {
			array1[i] = random.nextInt(10000) + 1;
		}
	}
	
	/**
	 * Validates whether array1 does not have 0 and all numbers are less than or equal to 10000 
	 */
	@Test()
    public void checkArray1Contents() {
		
		for(int i=0; i<array1.length; i++) {			
			assertTrue(array1[i] <= 10000 && array1[i] != 0);	
		}		
		
    }
	
	/**
	 * Validates whether array1 length is less than or equal to 10000
	 */
	@Test()
	public void checkArray1Length() {
		
		assertTrue(array1.length > 0 && array1.length <= 10000);
		
	}
	
	/**
	 * Executes mergeCounter and prints the response if it is not null.
	 */
	@Test()
	public void executeMergeCounter() {
		String response = arrayElementsCounter.mergeCounter(array1, array2);
		
		if(response != null) {
			System.out.println(response);
		}
	}
	
    
    
}