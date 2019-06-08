package com.ciarancodilitysolutions.iterations;


import java.util.*;

public class BinaryGap {
	
	public static void main(String args[]) {
		Scanner consoleScanner = new Scanner(System.in);
		int userInput;
		
		System.out.println("Enter an integer:");
		
		while(!consoleScanner.hasNextInt()) {
			System.out.println("Please enter a number: ");
			consoleScanner.nextLine();
		}
		userInput = consoleScanner.nextInt();
		BinaryGap(userInput);
	}

/**
 * 
 * @param Integer
 * @return
 * Take in an integer, convert it into binary and return the largest binary gap.
 * Binary gap is a sequence of zeros that are prefixed and postfixed by ones.
 */
	public static int BinaryGap(int Integer) {
        
        int integer                         = Integer;
        int modValue                        = 0;
        ArrayList<Integer> intBinaryVal         = new ArrayList<Integer>();
        ArrayList<Integer> reversedBinaryVal    = new ArrayList<Integer>();
        
        int binaryGap                       = 0;
        int largestGap                      = 0;
        boolean startBinaryGap              = false;
        
        while( integer != 0 ){
            modValue = integer % 2;
            intBinaryVal.add(modValue);
            integer = integer / 2;
        }
        
        Collections.reverse(intBinaryVal);
        reversedBinaryVal.addAll(intBinaryVal);
        
        System.out.println("Binary List : " + reversedBinaryVal);
        
        for(int i = 0; i < reversedBinaryVal.size(); i++){
            
            if(reversedBinaryVal.get(i).equals(1) && startBinaryGap == false){
                startBinaryGap = true;
                System.out.println("Start binary Gap");
                continue;
            }
            if(reversedBinaryVal.get(i).equals(1) && startBinaryGap == true){
                if(binaryGap > largestGap){
                    largestGap = binaryGap;
                }
                binaryGap = 0;
                System.out.println("Largest Binary gap : " + largestGap);
                continue;
            }
            if(reversedBinaryVal.get(i).equals(0) && startBinaryGap == true){
                binaryGap++;
                System.out.println("Binary gap : " + binaryGap);
                continue;
            }
        }
        return largestGap;
    }

}
