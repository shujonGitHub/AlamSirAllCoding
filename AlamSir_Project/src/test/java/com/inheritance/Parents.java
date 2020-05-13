package com.inheritance;

public class Parents extends GrandParents {

	public static void main(String[] args) {

		Parents obj2 = new Parents();

		System.out.println(Parents.gtandParentsProperty());

		System.out.println("+++++++++++++++++++");

		System.out.println(obj2.parentProperty(3000, 9000));

	}

	int parentProperty(int cash, int property) {

		int total = cash + property;

		return total;

	}

}
