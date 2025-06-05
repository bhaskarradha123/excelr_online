package constructor_program;


class Chain_Parent{
	 int a;
	 String b;
	 
	 public Chain_Parent(int a, String b) {
		 this.a=a;
		 this.b=b;
	 }
}
class Chain_Child extends Chain_Parent{
	
	
	double c;
	long d;
	
	
	public Chain_Child(int a, String b, double c, long d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}


	public Chain_Child(int a, String b) {
		super(a,b);
	}
}

public class Chaining_2  {

}
