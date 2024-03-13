package day14th.AllVariable;

public class NonStaticVariableExample2 {
//global variable
	int age = 25; // Non-static global variable
	double salary; // Non-static global variable

	public static void main(String[] args) {
		System.out.println("Program Starts");

		// Object Declaration and Initialization
		NonStaticVariableExample2 ref = new NonStaticVariableExample2();
		System.out.println("Non ststic global variable, age: " + ref.age);
		System.out.println("Non ststic global variable, salary: " + ref.salary);

		// updated salary value
		ref.salary = 25000.56;
		System.out.println("Updated Non ststic global variable, salary: " + ref.salary);

		System.out.println("Program Ends");
	}

}
