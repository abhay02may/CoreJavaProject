package com.cred.java8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUsingLamda {

	public static void main(String[] args) {

		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Mahesh");
		nameList.add("Kamlesh");
		nameList.add("Suresh");
		nameList.add("Abhay");
		
		ArrayList<String> nameList2=nameList;
		
		SortingUsingLamda obj=new SortingUsingLamda();
		
		ArrayList<String> list2=obj.sortUsingJava7(nameList);
		System.out.println(list2);
		
		ArrayList<String> list3=obj.sortUsingJava8Asc(nameList2);
		System.out.println(list3);
		
		ArrayList<Integer> intList=new ArrayList<Integer>();
		intList.add(20);
		intList.add(10);
		intList.add(30);
		intList.add(50);
		intList.add(5);
		intList.add(15);
		intList.add(25);
		intList.add(35);
		intList.add(45);
		
		System.out.println("Before Sorting :  : \n "+intList);
	    ArrayList<Integer> resultList= obj.sortUsingJava8Desc(intList);
	    System.out.println("After Sorting in Desc Order : \n"+resultList);
		
	}
	
	
	public ArrayList<String> sortUsingJava7(ArrayList<String> list){
	   Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		return list;
	}
	
	
	public ArrayList<String> sortUsingJava8Asc(ArrayList<String> list){
		Collections.sort(list, (s1,s2)->s1.compareTo(s2));
		return list;
	}
	
	public ArrayList<Integer> sortUsingJava8Desc(ArrayList<Integer> list){
		Collections.sort(list, (s1,s2)-> (s1>s2)?-1:(s2>s1)?1:0  );
		return list;
	}


}
