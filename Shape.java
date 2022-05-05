package assignment;

public class Shape {

	void draw() {
		System.out.println("Shape is drawn");
	}
	public static void main(String[] args) {
		Shape s;
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
		s = new Rectangle();
		s.draw();
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Circle is drawn");
	}
}

class Triangle extends Shape{
	void draw() {
		System.out.println("Triangle is drawn");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Rectangle is drawn");
	}
}