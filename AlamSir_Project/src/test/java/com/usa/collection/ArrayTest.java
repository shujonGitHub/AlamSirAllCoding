package com.usa.collection;

import java.util.Arrays;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		
		String [] testArray=new String [5];
		
		testArray[0]="1= Java";
		testArray[1]="2= Ruby";
		testArray[2]="3= Python";
		testArray[3]="4= PHP";
		testArray[4]="5= JavaScripts";
		
		
		System.out.println("++++++ VVVV Traditional Array List Print VVVV+++++");
		//this is for all data print
		System.out.println(Arrays.toString(testArray));
		
		
		System.out.println("=======VVV This is for specific print VVV=====");
		//This for specific print
		System.out.println(testArray[3]);
		
		
		System.out.println("+++++++VVVV This is for Advance Looping print VVV++++++++");
		// This is for Advance Looping 
		for(String cc: testArray) {
		System.out.println(cc);	
			
		}
		
		System.out.println("========VVV For traditional looping print VVV========");
		
		// This is for looping
		for ( int i=0;i<testArray.length;i++) {
			System.out.println(testArray[i]);
		}
		
		
		int [] obj=new int [3];
		
		obj[0]=90;
		obj[0]=110;
		obj[0]=150;
		
		
		
		//or new way
		int [] num= {10,20,30,40,50};
		
		System.out.println("======VVVV This is Traditional print");
		//For specific print
		System.out.println(num[2]); 
		
		
		System.out.println("=========VVV This is Arrays print VVV==========");
		// For all print 
		System.out.println(Arrays.toString(num));
		
		
		
		
		
	}
	
	
	

}
