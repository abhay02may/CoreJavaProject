package com.cred.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTestDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(5);
		list.add(20);
		list.add(15);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(35);
		list.add(25);
		System.out.println(list);

		// Use of filter and collect Method
		List<Integer> evenList=  list.stream().filter(e->e%2==0).collect(Collectors.toList());

		System.out.println(evenList);

		// Use of map and collect Method
		ArrayList<Integer> squareList=(ArrayList<Integer>) list.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(squareList);
		
		// Use of map and forEach Method
		list.stream().map(e->e*2).forEach(e->System.out.print(e+" "));
		System.out.println();
		
		// // Use of sorted and collect Method
        List<Integer> sortedList=list.stream().sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList());
        System.out.println("sortedList by ascending order and comparator \n "+sortedList);
        
        // To sort in reverse order either use -I1.compareTo(I2) or use I2.compareTo(I1)
        List<Integer> reverseSortedList=list.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList());
        System.out.println("Sorted in decending order using comparator: \n"+reverseSortedList);
		
		// Use of Count Method in the List, filtering the odd numbers and getting count
        long count=list.stream().filter(e->e%2!=0).count();
        System.out.println("Odd Numbers in the list: "+count);
        
        // Finding Min and Max value in the Stream, it requires comparator as input to find Min and Max
        int max=list.stream().max((I1,I2)->I1.compareTo(I2)).get();
        System.out.println("Max value in the list: "+max);
        
        int min=list.stream().min((I1,I2)->I1.compareTo(I2)).get();
        System.out.println("Min value in the List: "+min);
        
        // Remove Duplicate from Array List using distinct
        List<Integer> distinctList =list.stream().distinct().collect(Collectors.toList());
        System.out.println("distinctList :"+distinctList);
        
        
        // Find the sum of all the elements in the List
        int sum=list.stream().reduce((i1,i2)->i1+i2).get();
        System.out.println("Sum of the List: "+sum);
        
        // Getting Array using stream
        Integer[] array=list.stream().toArray(Integer[]::new);
        for(int x:array) {
        	System.out.print(" "+x);
        }
        System.out.println();
        // Stream operation on String 
		List<String> strList= Arrays.asList("Abhay","kumar","Srivastava","AK Srivastava");
		List<String> lenStringList=strList.stream().filter(s->s.length()>9).collect(Collectors.toList());
		System.out.println(lenStringList);
		
		List<String> upperCaseList=strList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseList);
		
		// Getting stream on group of values:
		Stream<Integer> streamList=Stream.of(1,2,3,4,5,6,7);
		streamList.forEach(System.out::println);
		
		

	}

}
