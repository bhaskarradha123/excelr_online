package string_program;

public class FindAlphabets {
    public static void main(String[] args) {
		String s="abcD123";
		char []arr=s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch=s.charAt(i);
			 if(ch>='A'&&ch<='Z') {
				 System.out.println("Captial :"+ch);
			 }
			 else if(ch>='a'&&ch<='z') {
				 System.out.println("Small :"+ch);	 
			 }
		}
//	        or	
		for (int i = 0; i < arr.length; i++) {
			char ch=s.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
            	System.out.println(ch);
            }
		}
		
	}
}
