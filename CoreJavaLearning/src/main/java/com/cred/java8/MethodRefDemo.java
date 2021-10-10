package com.cred.java8;

interface Interface5{
	
	public void display();
	
}

public class MethodRefDemo {

	public static void main(String[] args) {

		// Method Ref for static Method using Class Name
		Interface5 intObj=MethodRefDemo::show;
		intObj.display();
		
		// Method Ref for Non Static Method using Object
		MethodRefDemo obj=new MethodRefDemo();
		Interface5 intObj2=obj::view;
		Interface5 intObj3=new MethodRefDemo()::view;
		intObj2.display();
		intObj3.display();
		
	}
	
	public static String show() {
		System.out.println("Static Show Method called by display method using Method Reference ");
		return "No Use of Return";
	}

	public void view() {
		
		System.out.println("Non Static View Method called by display method using Method Reference ");
		
	}
	
}
