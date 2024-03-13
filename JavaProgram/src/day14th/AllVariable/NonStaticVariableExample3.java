package day14th.AllVariable;

public class NonStaticVariableExample3 {

	// global variable
	int age = 25;// non static variable
	double salary;// non static variable

	public static void main(String[] args) {
		System.out.println("Program Starts");
		// Object Initialization and Declaration
		NonStaticVariableExample3 ref = new NonStaticVariableExample3();
		System.out.println("Non static global variable, age: " + ref.age);
		System.out.println("Non static global variable, salary: " + ref.salary);
		ref.age = 35;
		ref.salary = 25000.56;
		System.out.println("\nUpdated non static global variable, age with ref object: " + ref.age);
		System.out.println("Updated non static global variable, salary with ref object: " + ref.salary);

		// another object of class NonStaticVariableExample3
		NonStaticVariableExample3 r1 = new NonStaticVariableExample3();
		System.out.println("\nNSGV age with r1 object: " + r1.age);
		System.out.println("NSGV salary with r1 salary: " + r1.salary);

		System.out.println("Program Ends");

	}

}
