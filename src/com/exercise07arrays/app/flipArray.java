package com.exercise07arrays.app;

import java.util.Random;

public class flipArray {

	public static void main(String[] args) {
		// Constant declaration
		final int ELEMENTS_ARRAY = 20;
		// Variable declaration
				
		// Array declaration
		int[] myArray = new int[ELEMENTS_ARRAY];
		int[] flipArray = new int[ELEMENTS_ARRAY];
				
		// Object construction
		Random randomNumber = new Random(System.nanoTime());
			
		// Fill array with random numbers
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			myArray[i] = randomNumber.nextInt(10);
		}
		System.out.println("Orignal Array");				
		ArrayPrint(myArray,ELEMENTS_ARRAY);
		
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			flipArray[i] = myArray[ELEMENTS_ARRAY-i-1];
		}
		System.out.format("\nFlip Array\n");
		ArrayPrint(flipArray,ELEMENTS_ARRAY);
	}
	
	public static void ArrayPrint(int[] array,int n) {
		for(int i = 0; i < n ; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
