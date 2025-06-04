package inheritence_program;

public class Single_Example_1 {

	public static void main(String[] args) {
		Parent_1 p=new Parent_1();
		p.m1();// m1 is parent
		Child_1 c=new Child_1();
		c.m1();	//m1 is override in child class
	}
	
}
class Parent_1{
	public void m1() {
		System.out.println("m1 in parent");
	}
}
class Child_1 extends Parent_1{
	@Override
	public void m1() {
//		super.m1();  -- parent method implementation
		System.out.println("m1 is override in child class");
	}
}