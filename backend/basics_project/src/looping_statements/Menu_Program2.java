package looping_statements;

import java.util.Scanner;

public class Menu_Program2 {

	public static void main(String[] args) {
		boolean check=true;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("choose \n1.Mens Wear \n2.Womens Wear \n3.Kids Wear \n4.Exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:{	 
				boolean mensCheck=true;
				do {
					System.out.println("chhose mens wear 1.Shirt 2.Pant 3.Shoes 4.Exit");
					int mensChoice=sc.nextInt();
					 switch (mensChoice) {
					 case 1: System.out.println("shirt");break;
					 case 2: System.out.println("Pant");break;
					 case 3: System.out.println("Shoes");break;
					 case 4: mensCheck=false;break;
					 }
				}while(mensCheck);
			}break;
			case 2:{System.out.println("womens wear");	}break;
			case 3:{System.out.println("kids wear");}break;
			case 4:{check=false;}break;
			default:break;
			}
		}while(check);
		
		
		
		System.out.println("thx for shooping.....");
	}
}
