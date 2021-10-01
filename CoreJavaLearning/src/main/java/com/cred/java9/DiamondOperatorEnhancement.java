package com.cred.java9;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DiamondOperatorEnhancement {

	public static void main(String[] args) {

		String animals[]= {"Cat","Rat","Dog","Horse","Elephant","Lion"};
		
		Iterator<String> myIterator=new Iterator<>() {

			int i=0;
			
			@Override
			public boolean hasNext() {
				return i<animals.length;
			}

			@Override
			public String next() {
				if(i>animals.length-1) {
					throw new NoSuchElementException();
				}
				return animals[i++];
			}
		
		};
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
	}

}
