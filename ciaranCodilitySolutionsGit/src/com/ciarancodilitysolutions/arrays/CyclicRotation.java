package com.ciarancodilitysolutions.arrays;

public class CyclicRotation {

	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

	    public int[] solution(int[] A, int K) {
	        // write your code in Java SE 8
	        
	        int currentIndexValue = 0;
	        int nextIndexValue = 0;
	        if(A.length < 1){
	            return A;
	        }
	        for(int i = 0; i < K; i++){
	            
	            for(int j = 0; j < A.length; j++){
	                if(i == 0 && nextIndexValue == 0){
	                    nextIndexValue = A[j];
	                    A[j] = A[A.length - 1];
	                     System.out.print(A[j]);  
	                    continue;
	                }

	                currentIndexValue = A[j];
	                A[j] = nextIndexValue;
	                nextIndexValue = currentIndexValue;
	                
	             System.out.print(A[j]);  
	            }
	            nextIndexValue = A[A.length - 1];
	            System.out.println(" new line, next index value is " + nextIndexValue);

	        }
	        
	        return A;
	    }
	
}
