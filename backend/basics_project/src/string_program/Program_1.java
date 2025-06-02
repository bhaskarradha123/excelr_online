package string_program;


import java.lang.String;
import java.util.Arrays;

public class Program_1 {
     public static void main(String[] args) {
		String a="raj kumar";
		String b=new String ("raj kumar");
		
		System.out.println(b);//raj kumar
		System.out.println(a);//raj kumar
		
		String s1="raj";
		String s2="raj";
		System.out.println(s1==s2); //true
		
		
		
		String s3=new String ("raj");
		String s4=new String("raj");
		System.out.println(s3==s4);//false
		
		
		
		String s5="this is a string program";
		char []arr=s5.toCharArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		
		String s6="kumar";
		System.out.println("size of "+s6+" is " +s6.length());
		
		
		String s7="this is a string program";
		System.out.println(s7.substring(10, 16));
		System.out.println(s7.charAt(0));//t
	  //System.out.println(s7.charAt(89));//SIOBE(String index out of bounds Exception)
		                                  //RTE(run time exception)
		System.out.println(s7.indexOf('z'));

		

		
	}
}
