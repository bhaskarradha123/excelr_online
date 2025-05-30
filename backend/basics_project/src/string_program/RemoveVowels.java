package string_program;

public class RemoveVowels {

	public static void main(String[] args) {
		String s="hello java";
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb);
		
		for(int i=0;i<sb.length();i++) {
			char c=sb.charAt(i);
			
			if("aeiou".indexOf(c)!=-1) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		
		System.out.println(sb);
		
		
		
		
	}
}
