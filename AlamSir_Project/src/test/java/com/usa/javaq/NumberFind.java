package com.usa.javaq;

public class NumberFind {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {

			if (i % 2 != 0) {
				
				System.out.println("Even number :" + i);
				
			} else {
				System.out.println("Odd Number :" + i);
			}

		}
		System.out.println("************************");
		Pali();
	}

	public static void primeExample() {
		
		
		
		

	}
	
	public static void Pali() {
		
	String xy="MOM";
	
	StringBuilder obj=new StringBuilder(xy);
	
	String cc=obj.reverse().toString();
	
	if(xy.equals(cc)) {
		
		System.out.println("It is Palimdrome");
	}
	
	else {System.out.println("Not Palimdrome");
	}
		
	}

}
