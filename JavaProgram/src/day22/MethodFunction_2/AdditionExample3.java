package day22.MethodFunction_2;

public class AdditionExample3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		System.out.println("Addition of two number is: " + AdditionExample3.add(10, 20));
		System.out.println("Addition of two number is " + AdditionExample3.add(60, 70));
		System.out.println("Addition of two number is: " + AdditionExample3.add());
		System.out.println("Program ends");
	}

	// Create static method to add two numbers
	static int add(int a, int b) {
		int c = a + b;
		System.out.println("Number1 is: " + a);
		System.out.println("Number2 is: " + b);
		return c;
	}

	static int add() {
		int a = 10, b = 20, c = a + b;
		System.out.println("Number1 is: " + a);
		System.out.println("Number2 is: " + b);
		return c;
	}
}
