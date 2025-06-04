package constructor_program;

public class Book {

	int pages;
	String type;
	String name;
// user -defined	
	public Book(int pages) {	 //arg const
	System.out.println("args cons");
	}
	
	public Book() {   //no -args const
		System.out.println("no args const");
	}
	
	public static void main(String[] args) {
//		Book book=new Book(); // no args cons
		Book b2=new Book(100); //args cons
	}
}
