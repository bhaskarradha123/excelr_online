package string_program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input="silent";//6  eilnst
		String input2="listen";//6 eilnst
		
		if(input.length()==input2.length()) {
			char[]c1=input.toCharArray();
			char[]c2=input2.toCharArray();
			 Arrays.sort(c1);
			 Arrays.sort(c2); 
			 if(Arrays.equals(c1, c2)) {
				 System.out.println("is an anagram");
			 }else {
				 System.out.println("is not an anagram");
			 }	
		}
		else {
			System.out.println("not an anagram");
		}
	}
}
