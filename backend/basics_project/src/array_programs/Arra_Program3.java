package array_programs;

import java.util.Arrays;

public class Arra_Program3 {

	public static void main(String[] args) {
		String []colors= {"red","yellow","pink","orange","blue"};


		for(int i=0;i<colors.length;i++) {
			System.out.println(colors[i]);
		}
		
		System.out.println("================");
		for(String color:colors) {
			System.out.println(color);
		}
	}
}
