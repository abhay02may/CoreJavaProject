package com.cred.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FileWalkDemo {

	public static void main(String[] args) {

		Path currentDirectory=Paths.get(".");
		Path resourcesPath=Paths.get("./resources/file1.txt");
		Predicate<Path> predicate=path->String.valueOf(path).endsWith(".java");
		try {
			Files.walk(currentDirectory, 6).filter(predicate).forEach(System.out::println);
			
			
			List<String> strList=new ArrayList<String>();
			strList.add("This is the file which contains the name of the Fruits and Animals.\r\n" + 
					"Apple\r\n" + 
					"Banana\r\n" + 
					"Grapes\r\n" + 
					"Mango\r\n" + 
					"Cat \r\n" + 
					"dog\r\n" + 
					"Monkey\r\n" + 
					"Lion\r\n" + 
					"Tiger");
			
			// Writing File using write Method
			Files.write(resourcesPath, strList);
			
			// Read all the lines at a Time
			List<String> allLines=Files.readAllLines(resourcesPath);
			allLines.stream().forEach(System.out::println);
			
			// Read the line one by one using Stream
			Files.lines(resourcesPath).forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		};
		
	}

}
