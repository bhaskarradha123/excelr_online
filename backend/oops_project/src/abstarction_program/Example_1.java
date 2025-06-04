package abstarction_program;

public class Example_1 {

	public static void main(String[] args) {
//		Animal a=new Animal();
		Animal a=new Dog();
		a.eats();
		
		Dog dog=new Dog();
		dog.eats();
	}
}

abstract class Animal{
	public  abstract void eats(); // functionality
	
	public void sleep() {
		 System.out.println("sleeping at night time");
	}
}






class Dog extends Animal{

	@Override
	public  void eats() {
		System.out.println("eats meat");
		
	}
	
}
