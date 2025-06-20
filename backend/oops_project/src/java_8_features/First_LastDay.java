package java_8_features;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class First_LastDay {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate firstDay=date.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate lastDay=date.with(TemporalAdjusters.lastDayOfMonth());
	     System.out.println("First Day :"+firstDay);
	     System.out.println("Last Day :"+lastDay);
	}
}
