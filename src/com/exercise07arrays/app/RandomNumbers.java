package com.exercise07arrays.app;

import java.util.Random;
public class RandomNumbers {
	public static void main(String[] args) {
		
		// Constants declaration
		final int ELEMENTS_ARRAY = 100;
		// Variables declaration
		double	generatedNumber = 0;
		int generatedNumberInt = 0;
		byte generatedNumberByte = 0;
		
		byte evenValues = 0;
		byte oddValues = 0;
		byte zeroValues = 0;
		byte positiveValues = 0;
		byte negativeValues = 0;
		
		
		
		// Arrays declaration
		int[] miArray1 = new int[ELEMENTS_ARRAY];
		byte[] myArray2 = new byte[ELEMENTS_ARRAY];
		
		
		// Array pseudo random numbers
		
		// 1st way By means of Random Class
		// it needs a value to start in this case will be '1'
		// Random randomNumbers = new Random(2);
		// 'System.currentTimeMillis()' or 'nanoTime' take a value of the clock of the
		// computer so you have different value each time
		Random randomNumbers = new Random(System.nanoTime());
		
		for(int i = 0; i < miArray1.length; i++) {
			generatedNumber = randomNumbers.nextDouble();
			System.out.println(generatedNumber);
		}
		
		for(int i = 0; i < miArray1.length; i++) {
			// nextInt(10) LIMIT numbers from 0 to 10
			// TIP : if you want a limit from 25 to 100 subtract 25 to 100 (100-25=75) and add 25 
			generatedNumberInt = randomNumbers.nextInt(75)+25;
			System.out.println(generatedNumberInt);
		}
		
				
		// 2nd way By means of Random Class
				for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			generatedNumberInt = (int) (Math.random()*50+50);
			System.out.println(generatedNumberInt);
		}
		
		// Pass1 Initialize
		for(int i = 0; i < myArray2.length; i++) {
			myArray2[i] = (byte) randomNumbers.nextInt(101);
			System.out.println(myArray2[i]);
		}
		// Pass2 2 Process
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			if(myArray2[i] == 0) {
				zeroValues++;
			}
			else if(myArray2[i] % 2 == 0) {
				evenValues++;
			}
			else if(myArray2[i] % 2 != 0) {
				oddValues++;
			}
			if(myArray2[i] >= 0) {
				positiveValues++;
			}
			else if(myArray2[i] <= 0) {
				negativeValues++;
			}
			
		}
		// Pass3 Output
		System.out.println("Zero quantity: " + zeroValues);
		System.out.println("Even quantity: " + evenValues);
		System.out.println("Odd quantity: " + oddValues);
		System.out.println("Positive quantity: " + positiveValues);
		System.out.println("Negative quantity: " + negativeValues);
		
		// 
	}
}
