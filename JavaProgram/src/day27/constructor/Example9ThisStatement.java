package day27.constructor;

public class Example9ThisStatement {
	Example9ThisStatement(){
		System.out.println("I am zero param cons...");
	}
	Example9ThisStatement(int num){
		this();
		System.out.println("I am int param cons...");
	}
	Example9ThisStatement(int n1,double n2){
		this(54);
		System.out.println("I am int double param cons...");
	}
	Example9ThisStatement(double n1, int n2){
		this(28,7800.24);
		System.out.println("I am double int param cons...");
	}

	public static void main(String[] args) {
		System.out.println("Program starts");
		Example9ThisStatement e1=new Example9ThisStatement(28000.78,45);
		System.out.println("Program ends");

	}

}
/*
Output:
Program starts
I am zero-param cons...
I am int-param cons...
I am int-double-param cons...
I am double-int-param cons...
Program ends

if we declare more then one constructor in a class body, then that will be known as constructor overloading

in this we need to follow following rules:
	1. type of param differ
	2. number of param differ
	3. position of param differ
why: we can initialize each object with different values or based on requirement

this():
	its also known as current class instance.
	its used to call another constructor of the current class based on the parameter
	it should be used only inside constructor
	it should be the first statement inside the constructor body
*/