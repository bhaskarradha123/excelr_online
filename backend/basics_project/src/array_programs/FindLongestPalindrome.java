package array_programs;

public class FindLongestPalindrome {

	public static void main(String[] args) {
		String[] arr = { "hello", "bob", "madam", "is", "calling", "you" };
		String longest="";
		for(String word:arr) {
		     if(isPalindrome(word)&&word.length()>longest.length()) {
		    	 longest=word;
		     }
		}
		System.out.println("the longest palindrome is "+longest);
		
		
		String smallest=null;
		for(String word:arr) {
			if(isPalindrome(word)) {
				if(smallest==null||word.length()<smallest.length())
					smallest=word;
			}
		}
		System.out.println("the smallest palindrome is "+smallest);

		
		
	}
	public static boolean isPalindrome(String s) {
		StringBuffer buffer = new StringBuffer(s);
		String reverse = buffer.reverse().toString();
		if (s.equals(reverse))
			return true;
		else
			return false;
	}
}
