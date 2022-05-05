package assignment;

public class Box {
	int length;
	int breadth;
	
	public Box() {
		length = 0;
		breadth = 0;
	}
	public Box(int a, int b) {
		length = a;
		breadth = b;
	}
	
	void setValue(int a , int b) {
		length = a;
		breadth = b;
	}
	
	public int area() {
		return (length*breadth);
	}

	public static void main(String[] args) {
		Box A = new Box();
		Box3d B = new Box3d(2,3,4);
		A.setValue(5, 6);
		System.out.println("Area of box A is "+ A.area());
		System.out.println("Volume of box B is " + B.volume());
	}
}
class Box3d extends Box{

	int height;
	public Box3d() {
		super();
		height = 0;
	}
	public Box3d(int a, int b, int c) {
		super(a,b);
		height = c;
	}
	void setVal(int a, int b , int c) {
		super.setValue(a, b);
		height = c;
	}
	public int volume() {
		return(super.area()*height);
	}
}