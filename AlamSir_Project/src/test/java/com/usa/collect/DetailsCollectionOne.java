package com.usa.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetailsCollectionOne {

	public static void main(String[] args) {
		intergerArrayTest();
		System.out.println("++++++========+++++++");
		 ArrayListTest();
		 
		 
System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		int e = 10;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		System.out.println("++++++++++++++++++++++++++");

		int[] objc = { 15, 25, 37, 47, 50 };

		System.out.println(Arrays.toString(objc));

		/*
		 * for (int i = 0; i < objc.length; i++) {
		 * 
		 * System.out.println(objc[i]);
		 */
			String[] name = { "John", "Shujon", "Groove", "Pioneer", "JVC" };

			System.out.println(Arrays.toString(name));

		}

	//}

	public static void intergerArrayTest() {
		
		int [] numList= {1,3,5,7,9};
		System.out.println(Arrays.toString(numList));
		
		for( int dd:numList) {
			
			System.out.println("++++++++++++++++++");
			System.out.println(dd);
		}

	}
	
	public static void ArrayListTest() {
		
		// using List for get all the method for List interface. If we use ArrayList then limit list will come
		
		List<String> value=new ArrayList<String>();  
		
		value.add("JAVA");
		value.add("SELENIUM");
		value.add("CUCUMBER");
		value.add("TESTNG");
		value.add("MAVEN");
		value.add("Jenkins");
		value.add("TESTNG");
		value.add("Null");
		
		System.out.println(value); //For arrayList syso(value); unlike ArrayList
		
		
		
		
		Map<Integer, String> objec=new HashMap<>();
		
		objec.put(0, "TOYOTA");
		objec.put(1, "HONDA");
		objec.put(2, "NISSAN");
		
		System.out.println("********************************");
		
		System.out.println(objec);
		
		
		
		
	}
}
