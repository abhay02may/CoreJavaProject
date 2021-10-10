package com.cred.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(("Abhay"),100,75));
		studentList.add(new Student(("Vinod"),200,55));
		studentList.add(new Student(("Prashant"),400,45));
		studentList.add(new Student(("Ajit"),500,35));
		studentList.add(new Student(("Girish"),600,30));
		
		Consumer<ArrayList<Student>> consumer=studList->{
			for(Student student:studList) {
			   System.out.println("Student Name: "+student.getStudentName());
			   System.out.println("Student Roll Number: "+student.getStudentRollNo());
			   System.out.println("Student Marks: "+student.getMarks());
			}
		};
		consumer.accept(studentList);
		
	}

}


class Student{
	
	String studentName;
	int studentRollNo;
	int marks;
	String grade;
	
	public Student(String studentName, int studentRollNo, int marks) {
		super();
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.marks = marks;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollNo=" + studentRollNo + ", marks=" + marks
				+ ", grade=" + grade + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + marks;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + studentRollNo;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (marks != other.marks)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (studentRollNo != other.studentRollNo)
			return false;
		return true;
	}
	
		
	
}
