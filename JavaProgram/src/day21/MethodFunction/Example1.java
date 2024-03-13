package day21.MethodFunction;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		printDetails();
		System.out.println("*************************");
		printDetails();
		System.out.println("---------------------------");
		printDetails();
		System.out.println("Program ends");
	}

// print your persional details-name,age,salary
	private static void printDetails() {
		System.out.println("Hi, I am xyz");
		System.out.println("I am 30 years old");
		System.out.println("I am getting 35k salary");
	}
}
