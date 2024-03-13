package day27.constructor;

public class Example7 {
	Example7(){
		System.out.println("I am zero param constroctur");
	}
	Example7(int n1,double n2){
		System.out.println("I am int double param constructor");
	}

	public static void main(String[] args) {
		System.out.println("Program starts");
		Example7 e1=new Example7();
		System.out.println("****************************");
		Example7 e2=new Example7(10,24002.25);
		System.out.println("Program ends");

	}

}
/*
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