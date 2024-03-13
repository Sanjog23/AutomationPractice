package day21.MethodFunction;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		add();
		System.out.println("**********************************");
		System.out.println("Addition of two number is: " + add());// method body will be executed and return value will
																	// be printed

		System.out.println("**********************************");

		int result = add(); // body will be executed and return value will be stored in the variable for
							// future use
		
		System.out.println("Addition value is: " + result);
		result = result - 10;
		System.out.println("Program ends");
	}

// Create static method to add two numbers
	static int add() {
		int a = 10, b = 20, res = a + b;
		System.out.println("Number1 is: " + a);
		System.out.println("Number2 is: " + b);
		return res;
	}
}
