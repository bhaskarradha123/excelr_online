package java_8_features;
interface Annonymous{
	void m1();
}
public class InnerAnnonymous1 {
	public static void main(String[] args) {
		Annonymous a= new  Annonymous() 
		//  inner anonymous class doesn't have class Name
		{
			@Override
			public void m1() {
				System.out.println("implements by using annonymous class");	
			}	
		};	
		a.m1();
	}
}
