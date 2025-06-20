package java_8_features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_Time_API_Program {

	public static void main(String[] args) {
		
		LocalDate ld=LocalDate.now();
		System.out.println("Current Date : "+ld);
		
		LocalTime lt=LocalTime.now();
		System.out.println("Current Time : "+lt);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("Current Date and Time : "+dateTime);


	}
}
