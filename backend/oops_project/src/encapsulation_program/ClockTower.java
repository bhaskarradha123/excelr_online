package encapsulation_program;

public class ClockTower {

	public static void main(String[] args) {
		Clock c = new Clock();//1@x
		System.out.println(c);
		c.displayTime();
		c.setHrs(12);
		c.setMin(65);
		c.setSec(34);
		c.displayTime();
		
		Clock c1 = new Clock();//2@y
		System.out.println(c1);
		c1.displayTime();//0:0:0
		
	}
}
