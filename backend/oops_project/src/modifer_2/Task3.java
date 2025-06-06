package modifer_2;

import modifer_1.Task1;// fully qualified name of a class

public class Task3 {

	public void m1() {
		Task1 task1=new Task1();
		System.out.println(task1.publicModifer);
//		System.out.println(task1.protectedModifer);
//		System.out.println(task1.defaultModifer);
//		System.out.println(task1.privateModifer); //can't access outside class
	}
}
