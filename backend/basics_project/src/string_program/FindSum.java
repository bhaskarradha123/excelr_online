package string_program;

public class FindSum {
   public static void main(String[] args) {
	String s="abc123";
	int sum=0;
	for(char c:s.toCharArray()) {
		
		if(Character.isDigit(c)) {
			int num=c-48;
			sum+=num;
		}
	}
	
	System.out.println(sum);//6
}
}
