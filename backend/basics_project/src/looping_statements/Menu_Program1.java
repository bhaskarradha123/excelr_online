package looping_statements;

import java.util.Scanner;

public class Menu_Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean out=true;
		while(out) {
			System.out.println("choose an item \n1.idly \n2.dosa \n3.vada \n4.bill");
			String order=sc.next();
			switch (order) {
			case "idly":System.out.println("idly -20$");break;
			case "dosa":System.out.println("dosa -10$");break;
			case "vada":System.out.println("vada -30$");break;
			case "bill": {
				System.out.println("you bill is : .....");
				out=false;
			}break;
			default:System.out.println("not availble ...");
				break;
			}
		}
		System.out.println("thanks visit again");
	}
}
