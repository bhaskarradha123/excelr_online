package string_program;

public class CaptilizeFirstAndLastLetter {

	public static void main(String[] args) {
		String s="this is a java program";
		StringBuilder sb=new StringBuilder();
		for(String word:s.split(" ")) {
			 int length=word.length();
			
			 if(length==1) {
				 sb.append(Character.toUpperCase(word.charAt(0)));
			 }else {
				 char first=Character.toUpperCase(word.charAt(0));
				 char last=Character.toUpperCase(word.charAt(length-1));
				 String remaning=word.substring(1,length-1);
				 sb.append(first).append(remaning).append(last);
			 }
			 sb.append(" ");
		}
		
		System.out.println(sb);
	}
}
