package inheritence_program;
public class Single_Example_1 {
	public static void main(String[] args) {
		Parent_1 p=new Parent_1();
		p.m1();// m1 is parent
		p.m2();
		Child_1 c=new Child_1();
		c.m1();	//m1 is override in child class
		c.m2();
	}}

class Parent_1{
	public void m1() {
		System.out.println("m1 in parent");
	}

	public final void m2() {
		System.out.println("m2 in parent");
	}
}

class Child_1 extends Parent_1{
	@Override
	public void m1() {
//		super.m1();  -- parent method implementation
		System.out.println("m1 is override in child class");
	}
	
//    @Override  --final methods can't be override
//    public void m2() {
//    	// TODO Auto-generated method stub
//    	super.m2();
//    }

}