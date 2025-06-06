package modifer_1;

public class Task2 {

	public void m1() {
		Task1 task1=new Task1();
		System.out.println(task1.publicModifer);
		System.out.println(task1.protectedModifer);
		System.out.println(task1.defaultModifer);
//		System.out.println(task1.privateModifer); can't access outside class
	}
}
