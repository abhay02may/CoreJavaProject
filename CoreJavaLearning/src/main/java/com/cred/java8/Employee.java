package com.cred.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
    
    
    public static void main(String args[]) 
    {
    	List<Employee> employeeList = new ArrayList<Employee>();
        
    	employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
    	employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
    	employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
    	employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
    	employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
    	employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
    	employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
    	employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
    	employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
    	employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
    	employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
    	employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
    	employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
    	employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
    	employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
    	employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
    	employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2010, 35700.0));
    	
    	
    	// How many male and female employees are there in the organization?
    	
    	Map<String, Long> empMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    	System.out.println(empMap);
    	
    	// Print the name of all departments in the organization?
    	
    	Stream<String> depar = employeeList.stream().map(e->e.getDepartment()).distinct();
    	depar.forEach(System.out::println);
    	
    	// What is the average age of male and female employees?
    	Map<String, Double> empAvgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
    	System.out.println(empAvgAge);
    	
    	// What is the average salary of the employee who has less than 30 years
    	double empAvgSal = employeeList.stream().filter(e -> e.getAge() < 30).collect(Collectors.averagingDouble(Employee::getSalary));
    	System.out.println(empAvgSal);
    	
    	// Get the details of highest paid employee in the organization?
    	String empName = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get().getName();
    	
    	System.out.println(empName);
    	
    	// Get the names of all employees who have joined after 2015?
    	Stream<String> empNames = employeeList.stream().filter(e->e.yearOfJoining > 2015).map(Employee::getName);
    	//System.out.println(depar);
    	empNames.forEach(System.out::println);
    	
    	// Count the number of employees in each department?
    	
    	Map<String, Long> depMapCnt = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    	System.out.println(depMapCnt);
    	
    	// What is the average salary of each department?
    	Map<String, Double> depMapAvgSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    	System.out.println(depMapAvgSal);
    	
    	//Get the details of youngest male employee in the product development department?
    	Optional<Employee> getEmp = Optional.ofNullable(employeeList.stream().filter(e -> e.getDepartment().equals("Product Development") && e.getGender().equals("Male")).min(Comparator.comparingInt(Employee::getAge)).get());
    	System.out.println(getEmp);
    	
    	
    	//Who has the most working experience in the organization?
    	Optional<Employee> getEmpOrg = Optional.ofNullable(employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get());
    	System.out.println(getEmpOrg);
    	
    	//How many male and female employees are there in the sales and marketing team?
    	Map<String, Long> depMapCntGen = employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    	System.out.println(depMapCntGen);
    	
    	//List down the names of all employees in each department?
  
    	Map<String, List<Employee>> listOfEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    	System.out.println(listOfEmp);
    	
    	Set<Entry<String, List<Employee>>> employeeSet = listOfEmp.entrySet();
    	
    	for(Entry<String, List<Employee>> eachList : employeeSet) 
    	{
    		System.out.println("Department:"+eachList.getKey());
    		System.out.println("-------------------------------");
    		for(Employee e : eachList.getValue()) 
    		{
    			System.out.println(e.getName());
    		}
    		
    		System.out.println("*************************************");
    		
    	}
    	
    	//What is the average salary and total salary of the whole organization?
    	DoubleSummaryStatistics allSatics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
    	System.out.println(allSatics.getAverage());
    	System.out.println(allSatics.getSum());
    	
    	
    	// Convert Employee List to Employee Map with Employee Id and Employee class
    	Map<Integer, Employee> empMaps = employeeList.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
    	System.out.println("empMaps : "+empMaps);
    }
    
}