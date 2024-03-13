package day28.Inheritance;

class Sample10 {
	int age = 10;
	static double salary = 25000.56;
	//default constructor 
}

class Sample20 extends Sample10 {
	int age = 20;
	static double salary = 35000.56;
	// default constructor with default super()
}

public class Example2 extends Sample20 {
	int age = 30;
	static double salary = 45000.56;
	// default constructor with default super()

	public static void main(String[] args) {
		System.out.println("Sample1 class SGV salary: " + Sample10.salary);
		System.out.println("Sample2 class SGV salary: " + Sample20.salary);
		System.out.println("Example1 class SGV salary: " + Example2.salary);
		System.out.println("\n*********************************************");
		Example2 e2=new Example2();
		System.out.println("Sample1 class NSGV age: "+e2.age);
		System.out.println("Sample2 class NSGV age: "+e2.age);
		System.out.println("Example2 class NSGV age: "+e2.age);

	}

}
