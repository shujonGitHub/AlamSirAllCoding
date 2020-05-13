package com.usa.smarttech;

public class ChildClass extends ShujonParents{

	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass ();
		obj.getname();
		
		
		obj.parameterMethod(19, 29);
		
		System.out.println(obj.returnMethod());
		//obj.returnMethod();
		
		

	}
	
	String  getname() {
		
		String name="John_Shujon";
		
		String homeAddress=" 42-33 Elbertson St";
		
		String value="My name is ="+name+" And my address is ="+homeAddress;
		
		System.out.println(value);
		System.out.println("++++++++++++++++");
		
		return value;
		}

}
