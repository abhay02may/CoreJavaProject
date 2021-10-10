package com.cred.java8;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class FunctionFunctionalInterfaceDemo {

	public static void main(String[] args) {

		// Function which takes integer as input and returns the square of it
		Function<Integer,Integer> f1=i->i*i;
		System.out.println(f1.apply(5));
		
		// For Primitive Type operation we can use Primitive Type Function Interface
		IntFunction intf1=i->i*i;
		System.out.println("IntFunction for primitive Type : "+intf1.apply(5));
		
		// Function to accept the Integer and return double (25 % ) 
		Function<Integer,Double> f2=i->i*(.25);
		System.out.println(f2.apply(99));
		
		// If Input type is int and return type is double then we can use
		// IntToDouble Function
		IntToDoubleFunction intToDouFunc=i->i*(.25);
		System.out.println("Int To Double Function : "+intToDouFunc.applyAsDouble(15));
		
		// Function to fetch first 5 characters of the String
		Function<String,String> f3=s->s.substring(0, 5);
		System.out.println("First 5 charaters of String: "+f3.apply("EDUCATION"));
		
		// Function to convert the result into upper case
		Function<String,String> f4=s->s.toUpperCase();
		System.out.println("Upper Case : "+f4.apply("abhay Kumar Srivastava"));
		
		// Function Chaining, first f3 will apply and then f4 will apply
		System.out.println(f3.andThen(f4).apply("abhay Kumar Srivastava"));
		
		// Function Chaining, first f4 will apply and then f3 will apply
		System.out.println(f3.compose(f4).apply("abhay Kumar Srivastava"));
		
		// Bi function is a function which can take 2 input argument and 1 output Argument
		BiFunction<Integer,Integer,Integer> biFunc=(x,y)-> x*y;
		System.out.println("Multiplication using BiFunction : "+biFunc.apply(3, 5));
		
		
	}

}
