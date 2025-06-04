package inheritence_program;

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.riding();		
		Car car=new Car();
		car.riding();
	}
}
class Vehicle {
	public void riding() {
		System.out.println("vehicle is riding");
	}
}
class Car extends Vehicle {
    
	@Override
	public void riding() {
		System.out.println("car is riding");
	}
}

class Bike extends Vehicle {

}

class Bicycle extends Vehicle {

}
