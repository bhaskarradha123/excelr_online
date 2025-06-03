package abstarction_program;

public class Program1 {

	public static String isPalindrome(String data) {
		StringBuilder sb=new StringBuilder(data);
	    String res=sb.reverse().toString();
	    if(res.equals(data))
	    	return "is palindrome";
	    else
	    	return "is not a palindrome";
	    
	}
	public static void main(String[] args) {
		String res= isPalindrome("bob");
		System.out.println(res);
	}
}
