package com.usa.smarttech;

public class ShujonParents {

	
	/*
	 * public static void main(String[] args) {
	 * 
	 * ShujonParents  shu = new ShujonParents ();
	 * 
	 * System.out.println(shu.returnMethod());
	 * 
	 * System.out.println(shu.parameterMethod(60, 70)); shu.voidMethod();
	 * returnMethod2();
	 * 
	 * }
	 */
	 

	static int returnMethod2() {

		int x = 20;
		int y = 2;
		int z = x / y;

		System.out.println("Return Method@2 Result = " + z);
		return z;
	}

	void voidMethod() {
		int w = 20;
		int e = 30;
		int r = 40;
		int total = w + e + r;

		System.out.println(total);

	}

	int returnMethod() {

		int a = 50;
		int b = 60;
		int c = a + b;

		return c;
	}

	int parameterMethod(int a, int b) {

		int value = a + b;

		System.out.println(value);

		return value;
	}

}
