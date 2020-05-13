package com.usa.collection;

import java.util.Arrays;

public class TrumpClass {

	public static void main(String[] args) {
		
		
		
		String [] ob=new String[3];
		
		ob[0]="1= Shujon";
		ob[1]="2= Towhid Sarker";
		ob[2]="3= Alam vay";
		
		System.out.println(Arrays.toString(ob));
		
		for ( int i=0;i<ob.length; i++) {
			
			System.out.println(ob[i]);
			
		}
		
		for( String ff:ob) {
			
			System.out.println(ff);
		}
		
		
		String [] abc= {"john","Shujon","Kishore Pilot"};
		
		System.out.println(abc[2]);
		
		
		
		
		

	}

}
