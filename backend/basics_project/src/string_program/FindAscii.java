package string_program;

public class FindAscii {

	public static void main(String[] args) {
		String s="abc123%#";
        for(char c:s.toCharArray()) {
        	int  ascii=(int)c;
        	System.out.println(c+" "+ascii);
        }
	}
}
   