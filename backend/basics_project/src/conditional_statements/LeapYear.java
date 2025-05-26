package conditional_statements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // to ask inputs
		System.out.println("enter a year"); // to print outputs
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if(year%100!=0) {
				System.out.println(year +" is a leap year");
			}

		}

	}
}
