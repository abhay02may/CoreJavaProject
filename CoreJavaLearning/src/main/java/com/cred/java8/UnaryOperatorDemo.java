package com.cred.java8;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {

		Function<Integer,Integer> f1=x->x * x;
		System.out.println("Square using Function : "+f1.apply(5));
		
		/*
		 * If Input and Output of the Function Interface is same then we can use Unary Operator
		 * Unary Operator is a child class of Function
		 */
		
		UnaryOperator<Integer> uop=i->i*i;
		System.out.println("Square using Unary Operator"+uop.apply(5));
		
		// If Input type of Unary Operator if Primitive Type then we should use Primitive Unary Operator
		IntUnaryOperator intUop=i->i*i;
		System.out.println("Square using Int Primitive Unary Operator "+intUop.applyAsInt(10));
		
		LongUnaryOperator longOp=j->j*j;
		System.out.println("Square using Long Primitive Unary Operator "+longOp.applyAsLong(10));
		
		DoubleUnaryOperator douOp=j->Math.sqrt(j);
		System.out.println("Square Root using Double Primitive Unary Operator "+douOp.applyAsDouble(10));
		
		
		
	}

}
