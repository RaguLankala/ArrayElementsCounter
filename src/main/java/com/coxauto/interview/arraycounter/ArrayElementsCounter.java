package com.coxauto.interview.arraycounter;

import java.util.HashMap;

/**
 * @author Raghavendra Reddy Lankala
 *
 */
public class ArrayElementsCounter {	
	
	/**
	 * @param array1 (random length between 1 to 10,000 and random content 1 to 10,000)
	 * @param array2 {20,30,1,2,1,3,4,4,5}
	 * @return {number : frequency of number in both arrays,number : frequency of number in both arrays,..}
	 */
	public String mergeCounter(int[] array1, int[] array2) {    	
    	 try {    		
	    	 StringBuilder result = new StringBuilder();
	    	 HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
	    	 int size = array1.length > array2.length ? array1.length : array2.length; //size = max array length.
	    	 
	    	 for(int i=0; i<size; i++){ 
	    		 
	             if(i < array1.length){ 
	                 if(null == countMap.get(array1[i])) //if we don't have number in map assign count as 1.
	                     countMap.put(array1[i], 1);
	                 else{    // else increment count number by 1.
	                     int count = countMap.get(array1[i]);
	                     countMap.put(array1[i], count+1);
	                 }
	             }
	             if(i < array2.length){  //if we don't have number in map assign count as 1.
	                 if(null == countMap.get(array2[i]))
	                	 countMap.put(array2[i], 1);
	                 else{    // else increment count number by 1.
	                     int count = countMap.get(array2[i]);
	                     countMap.put(array2[i], count+1);
	                 }
	             }
	             
	    	 }	    	 
			
			int i = 0;
	     	for(int key: countMap.keySet()) {       		
	     		result.append(key + ":" + countMap.get(key));     
	     		if(i != countMap.size() - 1) {
	     			result.append(",");
	     		}
	     		i++;
	     	}
	     	
	        return "response = {" + result + "}";  
	        
    	}catch(Exception ex) {
    		return ex.getMessage();
    	}
    }   
    
}
