package com.usa.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateValue {

	public static void main(String[] args) {
	
		
		List<Integer> abc=new ArrayList<>();
		
		abc.add(10);
		abc.add(20);
		abc.add(30);
		abc.add(40);
		abc.add(50);
		abc.add(60);
		
		
		
		int max=Collections.max(abc);
		System.out.println("Maximum value : "+max);
		
		int min=Collections.min(abc);
		System.out.println("Minimum value : "+min);
		
		System.out.println(abc);
		
		Collections.reverse(abc);
		System.out.println("Reverce integer :: "+abc);
		
		
		secondHigestSalary();
		Break();
		continuenum();
		
	}
		
	public static void secondHigestSalary() {

		int[] ab = { 15, 25, 35, 45, 55 };

		int size = ab.length;

		Arrays.sort(ab);

		System.out.println(Arrays.toString(ab));

		int result = ab[size - 2];

		System.out.println("Second higest :: " + result);

	}

	public static void Break() {

		for (int i = 1; i < 100; i++) {

			System.out.println(i);
			if (i == 20) {
				break;
			}
		}

	}

	public static void continuenum() {

		for (int i = 0; i < 100; i++) {

			if (i == 20) {
				continue;

			}
			System.out.println("Continue :: " + i);

		}

	}

	public static void removeDupli() {

		List<String> abcd = new ArrayList<>();

		abcd.add("Java");
		abcd.add("C++");
		abcd.add("C#");
		abcd.add("Python");
		abcd.add("Ruby");
		abcd.add("Ruby");
		abcd.add("null");
		abcd.add("null");
		abcd.add("null");

		for (int i = 0; i < abcd.size(); i++) {

			System.out.println(abcd.get(i));
			
			abcd.stream().distinct().collect(Collectors.toList());  // for removing duplicate value by distinct() key word. 
			
			System.out.println();
		}

		System.out.println();

	}

}
