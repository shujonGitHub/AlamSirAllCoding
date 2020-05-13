package com.usa.smarttech;

public class Smarttech {

	public static void main(String[] args) {

		Smarttech obj = new Smarttech();

		obj.voidMethod();
		// obj.parameter(Bomberdier, Westchester);
		System.out.println(obj.ReturnMethod());
		System.out.println(obj.parameter("Bomberdier", " Take off from JFK with 230 notical mile "));

	}

	public void voidMethod() {

		int salary = 9000000;
		int bonus = 2000000;
		int total = salary + bonus;

		System.out.println("Apple CEO John Shujon Salary is = " + total);
	}

	public String ReturnMethod() {
		String f_Name = "Nazmul";
		String L_Name = " Huda";
		String result = f_Name + L_Name;

		return result;
	}

	String parameter(String name, String address) {

		String result1 = name + address;

		return result1;

	}

}
