package class_program;

public class UnBoxing {
// object--->primitive 
	public static void main(String[] args) {
		Integer i=10;
		
		int autoUnBoxing=i; // auto unboxing
		
		int unBoxing=i.intValue(); // manual unboxing
	}
}
