package com.usa.selenium;

import org.apache.commons.lang.RandomStringUtils;

public class StringTest {

	public static void main(String[] args) {

		String s = "SmartTech";

		String obj = new StringBuilder(s).reverse().toString();

		System.out.println(obj);

		String n = "Nazmul";
		String ob1 = n.concat(" Huda");
		System.out.println(ob1);

		String name1 = "SmartTech";
		char ch = name1.charAt(4);
		System.out.println("Find the number of character position  of 4: " + ch);

		String d = "danielle";
		String e = "danielle";

		System.out.println(d == e);
		System.out.println(d.equals(e));
		System.out.println(d.equalsIgnoreCase(e));
		splitMethod();
		compareTwoString();
		ganeretStringData();
		ganeretIntegergData();
		
		System.out.println("***********************");
		 joinMethod();
	}

	public static void splitMethod() {

		String a = "Untied States Of America";
		String[] obc = a.split(" ");
		int count = 0;

		for (String bb : obc) {
			count++;
			System.out.println(count + "=" + bb);

		}

	}

	// How to compare two String = expected
	public static void compareTwoString() {

		String j = "John";
		String S = "Shujon";
		String h = "John";

		System.out.println(j.compareTo(h));

	}

	public static void ganeretStringData() {
		String e = "@gmail.com";
		String gmail = RandomStringUtils.randomAlphabetic(6);
		System.out.println("My Email number : " + gmail + e);
	}

	public static void ganeretIntegergData() {
		String phone = RandomStringUtils.randomNumeric(10);
		System.out.println("My phone number : " + phone);
	}
	public static void  joinMethod() {
		
		String join=String.join(" ", "Smart"+"Tech");
		
		System.out.println(join);
		
		
	}

}
