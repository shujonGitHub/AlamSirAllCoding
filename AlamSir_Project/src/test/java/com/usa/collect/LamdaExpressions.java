package com.usa.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LamdaExpressions {

	public static void main(String[] args) {

		findSecondSalary();

		
		List<Integer> num = new ArrayList<>();

		num.add(11);
		num.add(22);
		num.add(33);
		num.add(44);
		num.add(55);
		num.add(66);
		
		
		// lambda expression
		num.forEach(list -> { 

			System.out.println(list);
		});

		System.out.println("******************");

		int min = (int) Collections.min(num);
		System.out.println("Minimum number : " + min);

		int max = (int) Collections.max(num);
		System.out.println("Maxium number : " + max);

		System.out.println("********************************");
		findDuplicateValue();
	}

	// How to find second highest number/salary
	public static void findSecondSalary() {

		int obj[] = { 12, 19, 50, 70, 100, 200 };
		int shu = obj.length;
		Arrays.sort(obj);

		System.out.println(Arrays.toString(obj));
		int result = obj[shu - 2];

		System.out.println("My second higest salary =" + result);

	}

	//How to find duplicate value
	public static void findDuplicateValue() {

		String[] name = { "Java", "Ruby", "Pythot", "PHP", "C++", "Java", "C#" };

		Set<String> store = new HashSet<>();

		for (String names : name) {

			if (store.add(names) == false) {

				System.out.println("Duplicate Name Is : " + names);

			}

		}

	}
}
