package conditional_statements;

import java.util.Scanner;

public class SwitchCaseMenu_Program {

	public static void main(String[] args) {
		 /*
		  * Idly
		  * Dosa
		  * Vada
		  * 
		  * */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.idly \n2.dosa \n3.vada");
		String order=sc.next();
		switch (order) {
		case "idly":System.out.println("idly -20$");break;
		case "dosa":System.out.println("dosa -10$");break;
		case "vada":System.out.println("vada -30$");break;

		default:System.out.println("not availble ...");
			break;
		}
		
	}
}
