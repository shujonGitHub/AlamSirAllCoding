package com.inheritance;

public class TestClass implements Apple, Orange {

	public static void main(String[] args) {

		TestClass obj5 = new TestClass();

		obj5.abstractMethod_A();

		System.out.println("+++++++++++++++++++++");

		obj5.abstractMethod_B();

	}

	@Override
	public void abstractMethod_A() {

		System.out.println("I love American White Girls");

	}

	@Override
	public void abstractMethod_B() {
		System.out.println("I hate Bangladesi people's cheap mentalities");

	}
}
