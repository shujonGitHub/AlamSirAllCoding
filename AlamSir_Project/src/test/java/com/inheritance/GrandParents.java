package com.inheritance;

public class GrandParents {

	public static void main(String[] args) {
		
		GrandParents obj1=new GrandParents();
		
		System.out.println(GrandParents.gtandParentsProperty());

	}
	
	protected static String gtandParentsProperty() {
		
		String name=" JohnShujonAirlince";
		String cash=" 500000000";
		String value= "My name is ="+name+" My Company's market value is = "+cash;
		
		return value;
		
		
	}

}
