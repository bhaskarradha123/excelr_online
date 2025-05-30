package string_program;

public class ReverseString {

	public static void main(String[] args) {
//		Stirng s=new String("hello")  inside a heap area
		String s="hello"; //inside a pool area 
//		String output="olleh;
		String output="";
		
		for(char c: s.toCharArray()) {
			output=c+output;
		}
		System.out.println(output);
		
		
		StringBuilder s1=new StringBuilder("hello");
		
		System.out.println(s1);
		System.out.println(s1.reverse());
		StringBuffer s2=new StringBuffer("hello");
		
	}
}
