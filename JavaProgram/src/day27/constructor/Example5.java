package day27.constructor;

public class Example5 {
	// User-defined constructor
	Example5(int num) {
		System.out.println("I am zero-param constructor");
		System.out.println("num: " + num);
		System.out.println("age: " + age);
		age = num;
	}

	int age;// non static global variable

	public static void main(String[] args) {
		System.out.println("Program starts");
		Example5 e1 = new Example5(30);
		System.out.println("Age: " + e1.age);
		System.out.println("Program ends");

	}

}
/*
 * its similar to a method but its name should be same as ClassName it won't
 * have return type as well as return value
 * 
 * its use to initialize non-static member of the class when instance/object is
 * created
 * 
 * type- 1. default constructor - written by java compiler, it won;t have
 * body(empty)
 * 
 * 2. user defined constructor - written by programmer
 */