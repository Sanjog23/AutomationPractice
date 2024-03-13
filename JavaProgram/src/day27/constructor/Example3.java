package day27.constructor;


public class Example3 {
	//user-defined constructor
	Example3(){
		System.out.println("I am zero-param constructor");
		age=25;
	}
	int age;
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 e1=new Example3();
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