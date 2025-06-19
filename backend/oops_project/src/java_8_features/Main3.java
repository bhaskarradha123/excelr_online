package java_8_features;

interface Father{
	default void m1() {
		 System.out.println("From father");
	}
}
interface Mother{
	default void m1() {
		 System.out.println("From mother");
	}
}
class Child implements Father ,Mother{
	@Override
	public void m1() {
		Father.super.m1();
		Mother.super.m1();
	}
}
public class Main3 {
	public static void main(String[] args) {
		Child child=new Child();
		child.m1();
	}
}
