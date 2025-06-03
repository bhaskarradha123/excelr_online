package inheritence_program;

public class Single_Child extends Single_Parent  {

	
	public static void main(String[] args) {
		Single_Child child=new Single_Child();
		System.out.println(child.eyeColor);
		child.getProperty();
	}
}
