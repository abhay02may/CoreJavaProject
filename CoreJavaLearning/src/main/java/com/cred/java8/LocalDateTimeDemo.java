package com.cred.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateTimeDemo {

	public static void main(String[] args) {

		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("Date and Time: "+dateTime);
		System.out.println("Day : "+dateTime.getDayOfMonth());
		System.out.println("Month : "+dateTime.getMonth());
		System.out.println("Year : "+dateTime.getYear());
		System.out.println("Hour : "+dateTime.getHour());
		System.out.println("Min : "+dateTime.getMinute());
		System.out.println("Second : "+dateTime.getSecond());
		
		LocalDateTime localDateTime=LocalDateTime.of(2021, 6, 24 , 21, 50);
		System.out.println(localDateTime);
		System.out.println(localDateTime.plusMonths(3));
		System.out.println(localDateTime.plusWeeks(1));
		System.out.println(localDateTime.plusYears(1));
		System.out.println(localDateTime.minusMonths(1));
		System.out.println(localDateTime.minusYears(1));
		
		LocalDate localDate=LocalDate.now();
		System.out.println("Today's Date: "+localDate);
		System.out.println("Date of the Month: "+localDate.getDayOfMonth());
		System.out.println("Month of the Date : "+localDate.getMonth());
		System.out.println("Month of the Date : "+localDate.getYear());
		System.out.println("Week Day of the Week:  "+localDate.getDayOfWeek());
		System.out.println("Days out of 365 Days: "+localDate.getDayOfYear());
		
		
		
		LocalTime localTime=LocalTime.now();
		System.out.println("Current Time: "+localTime);
		System.out.println("Current Hour: "+localTime.getHour());
		System.out.println("Current Min: "+localTime.getMinute());
		System.out.println("Current Second:"+localTime.getSecond());
		System.out.println("Current Nano Second: "+localTime.getNano());
		
		// Use of Period Class
		LocalDate birthDate=LocalDate.of(1987, 5, 2);
		LocalDate currentDate=LocalDate.now();
		Period period=Period.between(birthDate, currentDate);
		System.out.println("AGE is :"+period.getYears() +" Years, "+period.getMonths()+" Months, "+period.getDays()+" Days");
		
		
		
	}

}
