package day28.Inheritance;

class Sample100 {
	int age = 10;
	static double salary = 25000.56;
	//default constructor 
	Sample100(){
		System.out.println("This is zero-param cons Sample100");
	}
}

class Sample200 extends Sample100 {
	int age = 20;
	static double salary = 35000.56;
	// default constructor with default super()
	Sample200(){
	System.out.println("This is zero-param cons Sample200");
	}
}

public class Example3 extends Sample200 {
	int age = 30;
	static double salary = 45000.56;
	Example3(){
		System.out.println("This is zero-param cons Example3");
	}
	// default constructor with default super()

	public static void main(String[] args) {
		System.out.println("Sample1 class SGV salary: " + Sample100.salary);
		System.out.println("Sample2 class SGV salary: " + Sample200.salary);
		System.out.println("Example1 class SGV salary: " + Example3.salary);
		System.out.println("\n*********************************************");
		Example3 e2=new Example3();
		System.out.println("Sample1 class NSGV age: "+e2.age);
		System.out.println("Sample2 class NSGV age: "+e2.age);
		System.out.println("Example2 class NSGV age: "+e2.age);

	}

}
