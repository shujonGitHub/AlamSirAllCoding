package com.usa.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("John Shujon");
		list.add("Nazmul Huda");
		list.add("Boeing 737");
		list.add("Air Bus A380");
		list.add("Ambraer ERJ 175");
		list.add("Ambraer ERJ 175");
		list.add("null");

		System.out.println(list);

		System.out.println("");
		

		System.out.println("======= Enhance Loop Print =======");
		// This is enhance loop

		for (String dt : list) {

			System.out.println(dt);
			

			System.out.println("======Using for Loop=======");

			for (int i = 0; i < list.size(); i++) {

				System.out.println(list.get(i));

				// How to remove the duplicate value..Ans= by distinct method

				list = (ArrayList<String>) list.stream().distinct().collect(Collectors.toList());
				
				System.out.println(list);

			}

		}

	}

}
