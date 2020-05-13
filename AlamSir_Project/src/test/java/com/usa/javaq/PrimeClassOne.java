package com.usa.javaq;

public class PrimeClassOne {

	public static void main(String[] args) {
		//AnotherPrime();

		int x = 79;

		for (int i = 2; i < x / 2; i++) {

			if (x % 1 == 0) {
				System.out.println("Ths is not a prime number :" + x);
				break;
				
			} else {
				System.out.println("This is a Prime number" + x);
				break;
				
			}
		}
		

	}
	
	

}
