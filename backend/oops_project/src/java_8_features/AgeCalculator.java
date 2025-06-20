package java_8_features;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		LocalDate birth=LocalDate.of(1997, 05, 21);
		LocalDate current=LocalDate.now();
		
		Period age = Period.between(birth, current);
		System.out.println(age);
		System.out.println("Age : " +age.getYears()+" years "
		+age.getMonths()+" months "+age.getDays()+" days");
	}
}
