package com.exercise07arrays.app;

import java.util.Random;
public class primosArray {

	public static void main(String[] args) {
		// Constant declaration
		final int ELEMENTS_ARRAY = 10;
		// Variables declaration
		byte primeNumbers = 0;
		boolean isPrime = true;
		
		byte[] myRandomArray =  new byte[ELEMENTS_ARRAY];
		
		Random randomNumbers = new Random(System.nanoTime());
		
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			myRandomArray[i] = (byte) (randomNumbers.nextInt(14)+1);
			System.out.println(myRandomArray[i]);
		}
		
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			isPrime = true;
			for(int k = 2; k < myRandomArray[i]; k++) {
				if(myRandomArray[i] % k == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				primeNumbers++;
			}
			
		}
		System.out.println("Quantity of prime numbers is " + primeNumbers);
	}

}
