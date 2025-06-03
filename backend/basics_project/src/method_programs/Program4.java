package method_programs;

public class Program4 {

	public static void main(String[] args) {
		m1();
		int res=m2();
		System.out.println(res);
		String res2=m3();
		System.out.println(res2);
		

	}
	
	
	
	
	public static void m1() {
		System.out.println("m1 method");
		return;
	}

	public static int m2() {
		return 646;
		
	}
	public static String m3() {
		int a=34;
		if(a%2==0) {
			return "it is an even number";
		}
		else {
			return "it is not an even number";
		}
		
	}
}
