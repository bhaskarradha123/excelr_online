package string_program;

public class Palindrome {

	public static void main(String[] args) {
		String s="malayalam";
		String s1="";
		
		for(char c:s.toCharArray()) {
			s1=c+s1;
		}
		 if(s.equals(s1)) {
			 System.out.println("palindrome");
			
		 }
		 else {
			 System.out.println("not a palindrome");
		 }
		 
		 StringBuilder sb=new StringBuilder(s);
		 StringBuilder output=sb.reverse();
		 String out=output.toString();
		 if(s.equals(out)) {
			 System.out.println("palindrome");
		 }
		 
	}
}
