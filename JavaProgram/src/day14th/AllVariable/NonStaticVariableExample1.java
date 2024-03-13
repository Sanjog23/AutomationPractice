package day14th.AllVariable;

public class NonStaticVariableExample1 {
//global variable
	int age = 25; // Non-static global variable
	double salary; // Non-static global variable

	public static void main(String[] args) {
		System.out.println("Program Starts");

		// Declaration and Initialization of non static global variable
		NonStaticVariableExample1 ref = new NonStaticVariableExample1();
		System.out.println("Non ststic global variable, age: " + ref.age);
		System.out.println("Non ststic global variable, salary: " + ref.salary);
		System.out.println("Program Ends");
	}

}
