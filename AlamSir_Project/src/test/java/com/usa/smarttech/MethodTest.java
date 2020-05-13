package com.usa.smarttech;

public class MethodTest {
	
	static String myName; // class level or Global level
	


	double salary; // instance variable
	double bonus;
	double total;
	double credit;

	public static void main(String[] args) {
		
		
		String ob=new String();
		MethodTest obj=new MethodTest();
		obj.getJohnName();
		
		
		System.out.println("My total outcome is for return  = "+obj.getShujonSalary());
		
		System.out.println();
		

	}

	void getJohnName() { // Its a void method or non parameterize
		
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("My total value is = "+c);

	}
	

	double getShujonSalary() { // non void method
		
   salary=8000;
   bonus=500;
   
		return  total=salary + bonus;

	}
	

	double getNazmulCredit() {
		salary = 300000;
		bonus=5000;

		return credit= salary + bonus ;
	}
	

	void getUpate(double upDate, String myName) { // This parameterize method & variable is local

	}
	
	static String students() {
		
		return null;
	}
	
	static void getBonus() {  //This a static method
		
		
	}
}
