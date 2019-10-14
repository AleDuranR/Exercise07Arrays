package com.exercise07arrays.app;

import java.util.Random;

public class MedianRandomArray {

	public static void main(String[] args) {
		final int NUM_VALUE = 10;
		int sumVector = 0;
		int[] myArray =  new int[NUM_VALUE];
		
		Random randomNumbers = new Random(System.nanoTime());
		
		// Generate Array
		System.out.println("My Array");
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = randomNumbers.nextInt(101);
			sumVector = sumVector + myArray[i];
			System.out.println(myArray[i]);
		}
		System.out.println("The median of the array is " + sumVector/NUM_VALUE);

	}

}
