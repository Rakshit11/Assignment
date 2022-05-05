package assignment;

public class Inherit {
	public static void main (String[] args) {
		Bike A = new Bike();
		A.petrol();
		A.speed();
		Car B = new Car();
		B.electric();
		B.speed();
		
	}
}
class Vehicle {
	
    void petrol() {
		System.out.println(" runs on petrol");
	}
	void electric() {
		System.out.println(" runs on electricity");
	}
	void speed() {
		System.out.println(" has a average speed of 60");
	}
}
class Bike extends Vehicle{
	public static void main(String[] args) {
		System.out.println("Is a bike");
		Bike a = new Bike();
		a.electric();
}
}
class Car extends Vehicle{
	
	public static void main(String[] args) {
		Car b = new Car();
		b.petrol();
}
}