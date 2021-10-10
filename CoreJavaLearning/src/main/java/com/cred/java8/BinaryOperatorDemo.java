package com.cred.java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> biFunc=(a,b)-> a+b;
		System.out.println("Addition using Bi Function : "+biFunc.apply(20, 30));
		
		BinaryOperator<Integer> biOpt=(a,b)->a+b;
		System.out.println("Addition using Binary Operator : "+biOpt.apply(20, 30));
		
		IntBinaryOperator intBiOpt=(a,b)->a+b;
		System.out.println("Addition using IntBinaryOperator : "+intBiOpt.applyAsInt(20, 30));
		
		LongBinaryOperator longBiOpt=(x,y)->(x-y);
		System.out.println("Substraction using LongBinaryOperator : "+longBiOpt.applyAsLong(10, 5));
		
	}

}
