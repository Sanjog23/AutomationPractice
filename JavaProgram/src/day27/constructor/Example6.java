package day27.constructor;

public class Example6 {
	int age;
	double salary;
	Example6(double num){
		System.out.println("I am double param constructor");
		salary=num;
	}
	Example6(int n1,double n2){
		System.out.println("I am int double param cons...");
		age=n1;
		salary=n2;
	}

	public static void main(String[] args) {
		System.out.println("Program starts");
		Example6 e1=new Example6();
		System.out.println("e1: age is: "+e1.age);
		System.out.println("e1: salary is: "+e1.salary);
		System.out.println("**********************************");
		Example6 e2=new Example6(19);
		System.out.println("e2: age is: "+e2.age);
		System.out.println("e2: salary is: "+e2.salary);
		System.out.println("**********************************");
		Example6 e3=new Example6(25058.25);
		System.out.println("e3: age is; "+e3.age);
		System.out.println("e3: salary is: "+e3.salary);
		System.out.println("**********************************");
		Example6 e4=new Example6(25,48258.256);
		System.out.println("e4: age is: "+e4.age);
		System.out.println("e4: salary is: "+e4.salary);
		

	}
	Example6(){
		System.out.println("I am zero param constructor");
	}
	Example6(int num){
		System.out.println("I am int param constructor");
		age=num;
	}

}
/*
if we declare more then one constructor in a class body, then that will be known as constructor overloading

in this we need to follow following rules:
	1. type of param differ
	2. number of param differ
	3. position of param differ
why: we can initialize each object with different values or based on requirement


*/