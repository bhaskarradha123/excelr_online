package inheritence_program;

public class MultiLevelInheitence {

	public static void main(String[] args) {
		System.out.println(" from parent");
		Parent parent=new Parent();
		System.out.println(parent.property1);
		System.out.println("from child");
		Child child=new Child();
		System.out.println(child.property2);
		System.out.println(child.property1);
		System.out.println("from grandChild");
		GrandChild grandChild=new GrandChild();
		System.out.println(grandChild.property3);
		System.out.println(grandChild.property2);
		System.out.println(grandChild.property1);
	}
}

class Parent{
	String property1="hyderabad";
}
class Child extends Parent{
	String property2="mumbai";

}
class GrandChild extends Child{
	String property3="banglore";

	
}
