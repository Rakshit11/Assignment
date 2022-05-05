package assignment;

public class ProjectProgram {
	public static void main (String[] args) {
		Cat A = new Cat(null,null);
		Dog B = new Dog(null, null);
		A.eats();
		B.eats();
	}
	
}
class Animals{
	void walk() {
		System.out.println("Can Walk");
	}
	void eats() {
		System.out.println("Can Eat");
	}
}
class Cat extends Animals{
	String A,B;
	Cat(String A,String B){
		this.A = A;
		this.B = B;
	}
	void walk() {
		System.out.println(A+"Cat can run"+ B+ "Cannot run");
	}
	void eats() {
		System.out.println("Cat eats rats");
	}
}
class Dog extends Animals{
	String A,B;
	Dog(String A,String B){
		this.A = A;
		this.B = B;
	}
	void walk() {
		System.out.println(A+"Dog can run"+ B+ "Cannot run");
	}
	void eats() {
		System.out.println("Dog eats pedigree");
	}
	
}