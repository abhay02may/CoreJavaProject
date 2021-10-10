package com.cred.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {

		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6);
       
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(map);
	}

}
