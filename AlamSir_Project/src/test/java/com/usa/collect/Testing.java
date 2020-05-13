package com.usa.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Testing {

	public static void main(String[] args) {

		List<String> name = new ArrayList<>();

		name.add("shujon");
		name.add("Shujon");
		name.add("Shujon");
		name.add("Shujon");
		name.add("Shujon");
		name.add("Shujon");

		System.out.println("I am List value :" + name);
		System.out.println(" ");

		Set<String> ob = new HashSet<String>(); //Set can not handle duplicate value

		ob.add("Apple");
		ob.add("Apple");
		ob.add("Apple");
		ob.add("Apple");
		ob.add("Apple");
		ob.add("Apple");
		ob.add("Apple");
		ob.add("Apple");

		System.out.println("I am Set value :" + ob);
		System.out.println(" ");

		Map<Integer, String> nam = new HashMap<>();  // key has to be unique & value can be duplicate

		nam.put(1, " Pioneer"); 
		nam.put(2, " Pioneer");  
		nam.put(3, " Pioneer");
		nam.put(4, " Pioneer");
		nam.put(5, " Pioneer");
		nam.put(6, " Pioneer");

		// Special looping for Map
		for (Entry obj : nam.entrySet()) {

			System.out.println(obj.getKey() + " " + obj.getValue());
		}

		System.out.println(nam.get(3)); // for print out specific value

		// System.out.println("I am Map value : " + nam);

	}

}
