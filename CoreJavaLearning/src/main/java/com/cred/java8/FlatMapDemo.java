package com.cred.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {

		List<Integer> primeNumberList=Arrays.asList(1,3,5,7,11);
		List<Integer> evenNumberList=Arrays.asList(2,4,6,8,10);
		List<Integer> oddNumberList=Arrays.asList(9,11,13,15,17);
		
		List<List<Integer>> combineList=Arrays.asList(primeNumberList,evenNumberList,oddNumberList);
		System.out.println("Combine List Before Flattening: "+combineList);
		System.out.println("Combine List after Flatening\n");
		List<Integer> simpleList=combineList.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(simpleList);
		System.out.println("Removing Duplicates : \n");
		System.out.println(simpleList.stream().distinct().collect(Collectors.toList()));
	}
	

}
