package assignment;

public class CallByValue {
	static void swap (int x, int y) {
		int temp = x ;
		x = y ;
		y = temp;
	}
	public static void main (String[] args) {
		int a = 1;
		int b = 2;
		System.out.println("Before Swap " + a + " ,"+ b);
		swap(a, b);
		System.out.println("After Swap" + a+" ,"+ b);
	}
}
