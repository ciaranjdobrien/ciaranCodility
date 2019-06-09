package com.ciarancodilitysolutions.arrays;

import java.util.*;

public class OddOccurrencesInArray {

	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> inputArrayList = new ArrayList<Integer>();
		int inputArray[];
		System.out.println("Please enter an array in itegers, with an odd number of elements, \nand each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.\nFor example, 9,9,7,8,8 ");
		
		while(userInput.hasNextInt()) {
			inputArrayList.add(userInput.nextInt());
			userInput.nextLine();
		}
		for(int i = 0; i < inputArrayList.size(); i++) {
		System.out.println("Value " + i +" is: " + inputArrayList.get(i));
		}
		inputArray = new inputArrayList.toArray();
		oddOccurrencesInArray(inputArrayList);
	}
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
