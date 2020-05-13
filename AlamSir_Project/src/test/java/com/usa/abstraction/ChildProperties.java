package com.usa.abstraction;



public class ChildProperties implements FatherProperties,MotherProperties  {
	
	public static void main(String[] args) {
		
		ChildProperties shu=new ChildProperties();
		
		shu.house();
		System.out.println("+++++++ :: L1");
		shu.land();
		System.out.println("++++++++++++ :: L2");
		shu.getold();
		System.out.println("+++++++++++++++++++++ :: L3");
		shu.getCash();
		System.out.println("++++++++++++++++++++++++++++++ :: L4");
		
	}
	
	
	
	

	@Override
	public void house() {
		System.out.println("My father has a big house in Westchester,NY");
		
	}

	@Override
	public void land() {
		System.out.println("America is a land of free country");
		
	}

	@Override
	public void getold() {
		System.out.println("My mother has a lot of Gold");
		
	}

	@Override
	public void getCash() {
		System.out.println("My mother gave me a lot of US green dollars");
		
	}
	

}
