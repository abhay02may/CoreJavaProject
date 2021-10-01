package com.cred.java9;


interface PrivateMethodInterface{
	
	default void method1() {
		System.out.println("Inside Default Method 1");
		method3();
	}
	
	default void method2() {
		System.out.println("Inside Default Method 2");
		method3();
	}
	
	private void method3() {
		System.out.println("Common Code in private Method");
	}
	
	
	
}

public class PrivateMethodInterfaceDemo implements PrivateMethodInterface{

	 public static void main(String[] args) {
		
		 PrivateMethodInterfaceDemo privateMethodObj=new PrivateMethodInterfaceDemo();
		 privateMethodObj.method1();
		 privateMethodObj.method2();
	}
}
