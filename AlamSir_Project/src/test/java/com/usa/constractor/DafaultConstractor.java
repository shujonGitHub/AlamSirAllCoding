package com.usa.constractor;

public class DafaultConstractor {

	public static void main(String[] args) {
		
		DafaultConstractor obj=new DafaultConstractor("Shujon",1000);
		
		DafaultConstractor obj1=new DafaultConstractor();
		
		

	}
	
	public DafaultConstractor() {
		
		System.out.println("It is default constractor");	
		
	}
	
	DafaultConstractor(String name, int age){
		System.out.println(name);
		System.out.println(age);
		
	}
	

}
