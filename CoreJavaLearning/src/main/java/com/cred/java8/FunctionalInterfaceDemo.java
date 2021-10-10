package com.cred.java8;


@FunctionalInterface
interface Interface1 {
	
	public void hello();
}

@FunctionalInterface
interface Interface2 {
	
	public void sum(int x, int y);
}

@FunctionalInterface
interface Interface3{
	
	public int square(int x);
}


public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		Interface1 intRef=()->System.out.println("Hello World");
		intRef.hello();
		
		Interface2 sumObj=(x,y)-> System.out.println("Sum="+(x+y));
		sumObj.sum(10, 20);
		
		Interface3 squareObj=(x)->x*x;
		int val=10;
		int result=squareObj.square(val);
		System.out.println("Square of "+val +" is : "+result);
		
	}

}


