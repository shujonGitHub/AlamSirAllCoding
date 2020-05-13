package com.usa.collect;

import java.util.Arrays;

public class ArrayString {

	public static void main(String[] args) {

		String[] name = { "java", "ruby", "python", "php", "C+" };

		System.out.println(Arrays.toString(name));

		System.out.println("=======================");

		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i]);

		}
		for (String str : name) {

			System.out.println(str);
		}
	}

}
