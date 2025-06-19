package java_8_features;

interface Fruit{
	
	default void fruitTaste() {
		System.out.println("fruit Taste is sweet");
	}
}

class Mango implements Fruit{
	@Override
	public void fruitTaste() {
		System.out.println("mango taste is sweet");
	}
}
public class Main2 {
	public static void main(String[] args) {
		Fruit fruit=new Mango();
		fruit.fruitTaste();
		
		
	}
}
