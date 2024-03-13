package day27.constructor;


public class Example2 {
	//default constructor
	int age;
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 e1=new Example2();
		System.out.println("Age: "+e1.age);
		System.out.println("Program ends");
	}
}
/*
its similar to a method but 
* its name should be same as ClassName
* it won't have return type as well as return value

its use to initialize non-static member of the class when instance/object is created

type-
1. default constructor - written by java compiler, it won;t have body(empty)

2. user defined constructor - written by programmer

*/