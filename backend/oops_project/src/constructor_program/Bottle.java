package constructor_program;

public class Bottle {

	String color;
	double price;
	int qunaity;
// used to print object values rather than object address	
	@Override
	public String toString() {
		return "Bottle [color=" + color + ", price=" + price + ", qunaity=" + qunaity + "]";
	}
	
	public Bottle() { //no args
		
	}
	public Bottle(String color) { // 1 args String
		this.color=color;
	}
	
	public Bottle(int qunaity) { // 1 args int
		this.qunaity=qunaity;
	}
	public Bottle(String color,double price) {// 2 args
		this.color=color;
		this.price=price;
	}
	
	public Bottle(String color,double price, int quantity) { // 3args
		this.color=color;
		this.price=price;
		this.qunaity=quantity;
	}

	public static void main(String[] args) {
		Bottle bottle=new Bottle();// no args cons
		System.out.println(bottle);
		
		Bottle bottle2=new Bottle("green");
		System.out.println(bottle2);
		
		Bottle bottle3=new Bottle("blue",100);
		System.out.println(bottle3);
		
		Bottle bottle4=new Bottle("blue",100,2);
		System.out.println(bottle4);
	}

	
}
