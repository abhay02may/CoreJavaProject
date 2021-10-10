package com.cred.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamUsesDemo {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Apple","Bat","Cat","Banana");
		printUsingForEach(list);
		printEndsWithAt(list);
		System.out.println("Filter the Even Number from the List \n");
		List<Integer> intList=Arrays.asList(1,7,9,7,1,3,2,3,4,5,15, 12);
		System.out.println(intList);
		System.out.println("Even Numbers are\n");
		printEvenUsingFilter(intList);
		System.out.println(" Using reduced Function to add the elements of the List");
		sumUsingReduced(intList);
		System.out.println("\n Sorting using Stream with Sorted Method");
		sortUsingStream(intList);
		System.out.println("\n Find distinct element using distinct Method");
		distinctUsingStream(intList);
		System.out.println("\n Find Square of each number in the list using Map");
		mapUsingStream(intList);
	}

	public static void printUsingForEach(List<String> list) {
		list.stream().forEach(element-> System.out.println(element));
		System.out.println("\n Printing into lower case");
		list.stream().forEach(element-> System.out.println(element.toLowerCase()));
		System.out.println("Printing Length of Each element\n");
		list.stream().forEach(element->System.out.println(element+" :  "+element.length()));
	}
	
	
	public static void printEndsWithAt(List<String> list) {
		list.stream().filter(element-> ((String) element).endsWith("at")).
		forEach(element-> System.out.println(element));
	}
	
	public static void printEvenUsingFilter(List<Integer> list) {
		list.stream().filter(element-> element % 2==0).
		forEach(element-> System.out.println(element));
	}
	
	public static void sumUsingReduced(List<Integer> list) {

		int sum=list.stream().reduce(0, (a,b)-> (a+b) );
		System.out.println(list);
		System.out.println(" SUM ="+sum);
		int sumOfOdd=list.parallelStream().filter(element-> element % 2==1).reduce(0, (a,b)-> (a+b));
		System.out.println("SUM of Odd="+sumOfOdd);
		
	}
	
	public static void sortUsingStream(List<Integer> list) {
		
		list.stream().sorted().forEach(e->System.out.println(e));
	}

	public static void distinctUsingStream(List<Integer> list) {
		list.stream().distinct().forEach(e->System.out.println(e));
		System.out.println("\n Distinct and Sort both");
		list.stream().distinct().sorted().forEach(e->System.out.println(e));
	}
	
	
	public static void mapUsingStream(List<Integer> list) {
		//list.stream().map(e->e*e).collect(toList());
		list.stream().map(n -> n * n).forEach(e->System.out.println(e));;
		
		List<Integer> squares =list.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(squares);
	}
	
	
	
}
