package day28.Inheritance;

class Grandfather1 {
	int age1 = 10;
	static double salary = 25000.56;
}

class Father1 extends Grandfather1 {
	int age2 = 20;
	static double salary = 35000.56;

	Father1(int i) {// ----------------------------------------------------<Parameterized
					// constructor
		// super();//it will call Grandfather1 default or zero param
		System.out.println("I am zero-param cons of Father class...");
	}
}

public class Child2 extends Father1 {
	int age3 = 30;
	static double salary = 45000.56;

	Child2() {
		super(25);// -----------------------------------------------------<
		System.out.println("I am zero-param cons of Example3 class...");
	}

	public static void main(String[] args) {
		System.out.println("Sample10 class SGV salary: " + Grandfather.salary);
		System.out.println("Sample20 class SGV salary: " + Father.salary);
		System.out.println("Example2 class SGV salary: " + Child2.salary);
		System.out.println("********************************************");
		Child2 e1 = new Child2();
		System.out.println("Grandfather class NSVG age1, from Child class: " + e1.age1);
		System.out.println("Father class NSVG age2, from Child class: " + e1.age2);
		System.out.println("Child class NSVG age3, from Child class: " + e1.age3);
	}
}
/*
 * constructor chaining: when child class constructor calls parent class
 * constructor and parent class constructor calls its parent constructor and so
 * on....
 * 
 * to achieve this we need to use super()
 * 
 * super(): is known as parent class instance it will help you to class parent
 * class constructor based on the parameter it should be the first statement
 * inside the constructor body this() and super() can't be written together
 */
