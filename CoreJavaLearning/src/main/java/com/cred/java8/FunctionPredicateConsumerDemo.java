package com.cred.java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPredicateConsumerDemo {

	public static void main(String[] args) {

		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(("Abhay"),100,75));
		studentList.add(new Student(("Vinod"),200,55));
		studentList.add(new Student(("Prashant"),400,45));
		studentList.add(new Student(("Ajit"),500,35));
		studentList.add(new Student(("Girish"),600,70));
		
		Function<Student,String> gradeFunction=student-> {
	              int marks=student.getMarks();
	              if(marks>=75) {
	            	  return "A[Dictinction]";
	              }else if(marks>=60 && marks<=74) {
	            	  return "B[First Division]";
	              }else if(marks>=50 && marks<60) {
	            	  return "c[Second Division]";
	              }else if(marks>=35 && marks<50) {
	            	  return "C[Third Division]";
	              }else {
	            	  return "D[Fail]";
	              }
		};
		
		Predicate<Student> predicate=student->student.getMarks()>=50;
		
		Consumer<Student> consumer=student->{
				System.out.println("Student Name: "+student.getStudentName());
				System.out.println("Student Roll No: "+student.getStudentRollNo());
				System.out.println("Student Marks: "+student.getMarks());
				System.out.println("Student Grade: "+gradeFunction.apply(student));
		};
		
		for(Student student:studentList) {
			
			if(predicate.test(student)) {
				
				consumer.accept(student);
				
			}
			
		}
		
		
	}

}


