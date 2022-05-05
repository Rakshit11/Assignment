package assignment;

public class SimpleObject {

	public SimpleObject(String s[]) {
		System.out.println("SimpleObject constructor with string functionality.");
	}
	public static void main(String[] args) {
		SimpleObject A = new SimpleObject(args);
		System.out.println(A);	
	}
}
