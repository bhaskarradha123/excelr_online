package java_8_features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter_Program {

	public static void main(String[] args) {
		
//		convert localDate into string formatter
		LocalDate date=LocalDate.now();
		System.out.println("Normal Format :"+date);//2025-06-20
	
		String format=date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	    System.out.println("Format after change :"+format);
	
	    
//	convert string into LocalDateTime    
	    String dateTimeFormat="20-06-2025 18:02:57";
	    LocalDateTime parse=LocalDateTime.parse(dateTimeFormat,
	    		DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
	    System.out.println("Normal Format :"+parse);
	    		
	}
}
