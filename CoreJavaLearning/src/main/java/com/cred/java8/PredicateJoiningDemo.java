package com.cred.java8;

import java.util.function.Predicate;

public class PredicateJoiningDemo {

	public static void main(String[] args) {

		Predicate<Integer> P1=num->num>10;
		Predicate<Integer> P2=num->num%2==0;
		
       int arr[]= {1,2,3,4,5,6,7,8,9,10,15,20,25,30};
       System.out.println("Number greater than 10 are\n");
       applyPredicate(P1, arr);
       System.out.println();
       System.out.println("Number Which are Even are\n");
       applyPredicate(P2, arr);
       System.out.println();
       System.out.println("Number which are not greater than 10 are\n");
       applyPredicate(P1.negate(), arr);
       System.out.println();
       System.out.println("Number which are Not Even are \n");
       applyPredicate(P2.negate(), arr);
       System.out.println();
       
       System.out.println("Number Which are Even and greater than 10 are\n");
       applyPredicate(P1.and(P2), arr);
       System.out.println();
       
       System.out.println("Number Which are either Even or greater than 10 are\n");
       applyPredicate(P1.or(P2), arr);
       
		
	}
	
	public static void applyPredicate(Predicate<Integer> P, int arr[]) {
		
		for(int x: arr) {
			if(P.test(x)) {
				System.out.println(x);
			}
		}
	}
	

}
