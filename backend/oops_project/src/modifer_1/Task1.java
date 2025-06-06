package modifer_1;

public class Task1 {

	public int publicModifer;
	protected int protectedModifer;
	          int defaultModifer;
	private int privateModifer;
	
	public void m1(){
		System.out.println(publicModifer);
		System.out.println(protectedModifer);
		System.out.println(defaultModifer);
		System.out.println(privateModifer);
	}
}
