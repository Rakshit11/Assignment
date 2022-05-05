package assignment;

public class ThisOperator {
	String A ;
	int B;

	ThisOperator()
	{
		this("Java", 11);
		System.out.println("Inside Default Constructor");
	}

	public ThisOperator(String A, int B) {
		this.A = A;
		this.B = B;
		System.out.println("Inside Parametrized Constructor");
	}
	public static void main(String[] args) {
		ThisOperator C = new ThisOperator("Java", 11);
	}
}
