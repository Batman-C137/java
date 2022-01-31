package one;

public class Lot {
	public static void main(String args[]) {
		int a = 14;
		int b = 7;
		int c = 21;
		if (a > b) {
			if (a > c) {
				System.out.println("A is greater");
			} else {
				System.out.println("C is greater");
			}
		} else {
			if (b > c) {
				System.out.println("B is greater");
			} else {
				System.out.println("C is greater");
			}
		}
	}

}
