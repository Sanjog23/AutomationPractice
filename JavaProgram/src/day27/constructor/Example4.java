package day27.constructor;


public class Example4 {
	//user-defined constructor
	Example4(int age){
		System.out.println("I am zero-param constructor");
		System.out.println("Constructor age: "+age);//30
	//NSG variable = local variable
		this.age=age;
	}
	int age;
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example4 e1=new Example4(30);
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