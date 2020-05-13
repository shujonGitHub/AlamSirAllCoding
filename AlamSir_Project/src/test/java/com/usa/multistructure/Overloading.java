package com.usa.multistructure;

public class Overloading {

	public static void main(String[] args) {

		Overloading cana = new Overloading();

		cana.getBusiness(10, 20);
		cana.getBusiness(70, "Shujon");
		cana.getBusiness(null, 90);
	}

	public void getBusiness(int a, int b) {

		System.out.println("Its a first overloading");

		int result = a + b;

		System.out.println(result);

		System.out.println("I want to make my own business");
		System.out.println("++++++++++++++++");

	}

	public void getBusiness(int d, String e) {

		System.out.println("Its a second overloading");

		d = 70;
		e = "Shujon";
		System.out.println(d + " " + e);

		System.out.println("I love shopping");
		System.out.println("+++++++++++++++++++");
	}

	public void getBusiness(String f, int g) {
		System.out.println("Its a third overloading");

		f = "My Father";
		g = 90;

		System.out.println(f + " " + g);

		System.out.println("I am dreaming to be US president");
		System.out.println("++++++++++++++++++++++++++++++++++++++");
	}

}
