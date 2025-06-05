package abstarction_program;

public class Multiple_Inheritance {

}

interface Father{
	public static final String propertyA="hyd";
	void propertyList();	
}
interface Mother{
	public static final String propertyB="banglore";
	void propertyList();
}

class Child_ implements Father,Mother{
	@Override
	public void propertyList() {
		System.out.println("properties from both parents");
		
	}
}
