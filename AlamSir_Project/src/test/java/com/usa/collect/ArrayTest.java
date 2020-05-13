package com.usa.collect;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		int[] test=new int[5];
		test[0]=15;
		test[1]=25;
		test[2]=35;
		test[3]=45;
		test[4]=55;
		
		System.out.println(Arrays.toString(test));
		System.out.println(test[1]);
		
		System.out.println("+++++++++++++++");
		
		for(int i=0;i<5;i++) {
			System.out.println(test[i]);
			
			int[] num= {50,100,150,200,250};
			
			System.out.println(Arrays.toString(num));
			System.out.println(num[1]);// For individual print by index count
		}
		
		 
		
		
		
	}
}