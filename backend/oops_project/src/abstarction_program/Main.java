package abstarction_program;

public class Main {
	public static void main(String[] args) {

//		Employee employee=new Employee("BOB","bob@gmail.com",345678665,786);
		
		Developer developer=new Developer("Bob", "bob@gmail.com", 23456789, 753, "java");
		developer.work();
	}
}

abstract class Employee {
	String name;
	String email;
	long phone;
	int id;

	public Employee(String name, String email, long phone, int id) {
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.id = id;
		System.out.println("employee class const");
	}
	public abstract void work();
}





class Developer extends Employee {
	String langugage;
	
	
	public Developer(String name, String email, long phone, int id, String language) {
		super(name, email, phone, id);
		this.langugage = language;
		System.out.println("const in developer class");
	}
	
	
	@Override
	public void work() {
		System.out.println(name+" developer working on "+langugage);	
	}
}
