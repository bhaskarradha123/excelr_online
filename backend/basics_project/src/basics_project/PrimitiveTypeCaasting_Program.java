package basics_project;

public class PrimitiveTypeCaasting_Program {

	public static void main(String[] args) {
//implicit type casting	
		int a=10;	
		double d=a;
		System.out.println(d);//10.0
// explicit type casting
		double d1=10.8;
		int a2=(int)d1;
		System.out.println(a2);
	
		byte byteValue =127;
		double doubleValue=byteValue;
		
		float floatValue=658987.97f;
		int intValue=(int)floatValue;
		
// implicit typecasting		
		char charValue='A';
		int convertedChar=charValue;
		System.out.println(convertedChar);
		
	}
}
