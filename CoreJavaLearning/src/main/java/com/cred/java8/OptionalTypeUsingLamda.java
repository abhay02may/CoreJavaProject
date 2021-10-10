package com.cred.java8;

@FunctionalInterface
interface MathOperation {

	int operation(int a, int b);
	
}

public class OptionalTypeUsingLamda {

	public static void main(String[] args) {
	
		MathOperation addition=(a,b)->a+b;
		
		MathOperation substraction = (int a,int b)-> {  return a-b; };
		
		MathOperation multiplication=(a,b)-> (a*b);
		
		MathOperation division=(a,b)-> (a/b);
		
		System.out.println(" Addition of 10 and 5 => "+addition.operation(10, 5));
		System.out.println(" Substraction of 10 and 5 => "+substraction.operation(10, 5));
		System.out.println(" Multiplication of 10 and 5 => "+multiplication.operation(10, 5));
		System.out.println(" Division of 10 and 5 => "+division.operation(10, 5));
		
		System.out.println("\n Using Object Reference\n");
		OptionalTypeUsingLamda obj=new OptionalTypeUsingLamda();
		
		System.out.println(" Addition of 10 and 5 => "+obj.operate(10, 5, addition));
		
		System.out.println(" Substraction of 10 and 5 => "+obj.operate(10, 5, substraction));
		
		System.out.println(" Multiplication of 10 and 5 => "+obj.operate(10, 5, multiplication));
		
		System.out.println(" Division of 10 by 5 => "+obj.operate(10, 5, division));
	}
	
	public int operate(int a, int b, MathOperation mathOperation) {
		
		return mathOperation.operation(a, b);
	}
	


}


