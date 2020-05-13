package com.usa.javaq;

public class PalimClassDemo {
	
	
	

	public static void main(String[] args) {
		
		palimDromeNum();	
		
		

	}
	
	
	public static void palimDromeNum() { // remember the concept /only for manhattan

		int result, sum = 0, temp;

		int num = 454;

		temp = num; // Swap value

		while (num > 0) {

			result = num % 10; // result default value 0, num % 10=45.4

			sum = (num * 10) + result; // o 45.4*454+0=45.4
			num = num / 10; // 45.4/10=4.54
		}

		if (temp == sum) {
			System.out.println(temp + "This is not a palimdrome number");
		} else {
			System.out.println("This is a palimdrome number");
		}
	}

}
