package assignment;

public class CallByReference {
	static void swap (int x, int y) {
		int temp = x ;
		x = y ;
		y = temp;
	}
	static void swap(CallByReference c) {
		c.swap(0, 0);
	}
	public static void main (String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("Before Swap " + a + " ,"+ b);
		swap(a, b);
		System.out.println("After Swap" + a+" ,"+ b);
	}
}
