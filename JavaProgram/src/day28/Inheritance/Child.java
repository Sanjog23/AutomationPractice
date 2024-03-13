package day28.Inheritance;

class Grandfather{
	int age1=10;
	static double salary=25000.56;
	Grandfather(){
		System.out.println("I am zero-param cons of Grandfather class...");
	}
}
class Father extends Grandfather{
	int age2=20;
	static double salary=35000.56;
	Father(){
		super(); //by default will be written by Java compiler
		System.out.println("I am zero-param cons of Father class...");
	}
}
public class Child extends Father {
	int age3=30;
	static double salary=45000.56;
	Child(){
		super(); //by default will be written by Java compiler
		System.out.println("I am zero-param cons of Example3 class...");
	}
	public static void main(String[] args) {
		System.out.println("Sample10 class SGV salary: "+Grandfather.salary);
		System.out.println("Sample20 class SGV salary: "+Father.salary);
		System.out.println("Example2 class SGV salary: "+Child.salary);
		System.out.println("********************************************");
		Child e1=new Child();
		System.out.println("Grandfather class NSVG age1, from Child class: "+e1.age1);
		System.out.println("Father class NSVG age2, from Child class: "+e1.age2);
		System.out.println("Child class NSVG age3, from Child class: "+e1.age3);
		
		Father f1=new Father();
		System.out.println("Grandfather class NSVG age1, from Father class: "+f1.age1);
		System.out.println("Father class NSVG age2, from Father class: "+f1.age2);
	}
}
/*
constructor chaining: when child class constructor calls parent class constructor and 
parent class constructor calls its parent constructor and so on....

to achieve this we need to use super()

super():
 		is known as parent class instance
 		it will help you to class parent class constructor based on the parameter
 		it should be the first statement inside the constructor body
 		this() and super() can't be written together
 */ 
