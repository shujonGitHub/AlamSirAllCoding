package com.usa.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class DetailsCollectionTwo {
	
	public static void main(String[] args) {
		FindMaxandMinValue();
	}
	
	//All for List interface

	int[] array = { 1, 2, 2, 2, 2, 22 };
	
	
   //How to declare collection 
	ArrayList<Integer> obj = new ArrayList<>(); // use add()method

	List<Integer> a = new ArrayList<>(); // use add() method
	
	List<Integer> b = new ArrayList<>(); // use add() method
	List<Integer> c = new Vector<>(); // use add() method
	List<Integer> d = new Stack<>(); // use add() method
		
	public static void FindMaxandMinValue() {
		
		
		List<Integer> num= new ArrayList<>();
		
		num.add(11);
		num.add(22);
		num.add(33);
		num.add(44);
		num.add(55);
		num.add(66);
		
		
		
		 System.out.println(num.size()); 
		 
		 System.out.println(num);
		 
		
		for( int i=0;i<num.size();i++) {
			
			System.out.println(num.get(i)); //in array list we need get method to print
			
		}
		
		
		
	}

}
