package com.ciarancodilitysolutions.arrays;

import java.util.*;

public class OddOccurrencesInArray {

/**
 * 
 * @param inputArray
 * @return
 * Method to take an unsorted array with matching index values and find the odd one.
 */
	 public int oddOccurrencesInArray(int[] inputArray) {
	        // write your code in Java SE 8
	        
	        Arrays.sort(inputArray);
	        System.out.println("Sorted Array: " + Arrays.toString(inputArray));
	        int currentIndexValue;
	        int previousIndexValue;
	        int oddNumber;
	        
	        for(int i = 0; i < inputArray.length; i = i + 2){
	            
	            currentIndexValue = inputArray[i];
	            System.out.println("currentIndexValue = " + currentIndexValue);
	            if(i + 1 == inputArray.length){
	                return currentIndexValue;
	            }
	            if(currentIndexValue != inputArray[i + 1]){
	               return currentIndexValue;
	            }
	        }
	        return 0;
	    }
}
