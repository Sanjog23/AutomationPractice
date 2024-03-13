package day17_PracticeProgram;

public class IfElseLargestNo {

	public static void main(String[] args) {

		double x = 25.35, y = 18.25, z = -32.255;

		if (x >= y && x >= z) {
			System.out.println("Largest number is: " + x);
		} else if (y >= x && y >= z) {
			System.out.println("Largest number is: " + y);
		} else {
			System.out.println("Largest number is: " + z);
		}

	}
}
