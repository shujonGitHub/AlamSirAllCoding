package com.inheritance;

public interface Apple {
	
	 void abstractMethod_A(); // Abstract method by default public
	 
	 default void method() {
		 
		 System.out.println("Its a default method");
	}

}
