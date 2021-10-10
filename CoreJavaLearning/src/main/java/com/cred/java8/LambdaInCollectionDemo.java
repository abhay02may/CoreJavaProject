package com.cred.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LambdaInCollectionDemo {

	public static void main(String[] args) {

		// Default Sorting order of Tree Map is Ascending
		// To short in descending lambda expression is passed in the constructor
		TreeMap<Integer,String> treeMap=new TreeMap<Integer, String>((I1,I2)->(I1>I2)?-1:(I2>I1)?1:0);
		
		treeMap.put(100, "Apple");
		treeMap.put(200, "Banana");
		treeMap.put(300, "Carrot");
		treeMap.put(400, "Mango");
		treeMap.put(500, "Grapes");
		
		System.out.println(treeMap);
		
		Set<String> set=new TreeSet<String>((s1,s2)->s2.compareTo(s1));
		set.add("Apple");
		set.add("Banana");
		set.add("Carrot");
		set.add("Mango");
		set.add("Grapes");
		
		System.out.println(set);
		
		ArrayList<Employees> empList=new ArrayList<Employees>();
		empList.add(new Employees(10,"Abhay"));
		empList.add(new Employees(70,"Ballu"));
		empList.add(new Employees(80,"Durgesh"));
		empList.add(new Employees(90,"Vinod"));
		empList.add(new Employees(100,"Chotu"));
		
		// Sorting based on the Employee ID ascending Order 
		Collections.sort(empList, (e1,e2)->e1.getEmpId().compareTo(e2.getEmpId()));
		System.out.println(empList);
		
		// Sorting based on the Employee ID descending Order 
		Collections.sort(empList, (e1,e2)->e2.getEmpId().compareTo(e1.getEmpId()));
		System.out.println(empList);
		
		Collections.sort(empList, (e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));
		System.out.println(empList);
		
		
		
		
	}

}


class Employees{
	
	Integer empId;
	String empName;
	
	public Employees(){
		
	}
	public Employees(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + "]";
	}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
	
	
	
	
	
}
