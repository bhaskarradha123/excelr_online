package string_program;

public class FindLength {

	public static void main(String[] args) {
		String a="java";
		char []arr=a.toCharArray();
		int length=arr.length;
		System.out.println(length);	
//		without any inbuilt methods 	
		int stringlength=0;	
		try {
//			while(true) {
//				 a.charAt(stringlength);
//				 stringlength++;
//			}		
			for(;true;stringlength++) {
				a.charAt(stringlength);
			}
		}
		catch (Exception e) {
		}
		System.out.println(stringlength+" without inbuilt ");
	}
}
