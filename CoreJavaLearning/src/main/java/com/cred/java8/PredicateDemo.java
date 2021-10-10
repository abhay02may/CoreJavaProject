package com.cred.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		// Predicate is a functional interface which contains test Method
		// test method can take any input and will return boolean value based on the conditions
		
		Predicate<Integer> predicate=num->num>0; // This Lambda implementation will check the whether number is +ve or not.
		System.out.println(predicate.test(-1)); // false
		System.out.println(predicate.test(10)); // true
		
		// Even Odd Check
		Predicate<Integer> evenOddPredicate=num->num%2==0;
		System.out.println("10 is Even ?: "+evenOddPredicate.test(10));
		System.out.println("19 is Even ?: "+evenOddPredicate.test(19));
		
		//String Length check 
		Predicate<String> steLenPredicate=s->s.length()>=5;
		System.out.println("Length > 5 : : "+steLenPredicate.test("Abhay"));
		System.out.println("Length > 5 : : "+steLenPredicate.test("Ajit"));
		
		// Empty check in collections
		
		Predicate<Collection> emptyCheck=c->c.isEmpty();
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Abhay");
		ArrayList<String> list2=new ArrayList<String>();
		System.out.println(emptyCheck.test(list1));
		System.out.println(emptyCheck.test(list2));
		
		// use of BiPredicate
		// 
		BiPredicate<Integer, Integer> biPred=(a,b)-> a>b;
		System.out.println("Using Bi Predicate to check first value i greater or not :"+biPred.test(10, 20));
		System.out.println("Using Bi Predicate to check first value i greater or not :"+biPred.test(20, 10));
		
		
	}

}
