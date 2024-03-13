package day28.Inheritance;

class Sample1 {
	int age = 10;
	static double salary = 25000.56;
}

class Sample2 {
	int age = 20;
	static double salary = 35000.56;
}

public class Example1 {
	int age = 30;
	static double salary = 45000.56;

	public static void main(String[] args) {
		System.out.println("Sample1 class SGV salary: " + Sample1.salary);
		System.out.println("Sample2 class SGV salary: " + Sample2.salary);
		System.out.println("Example1 class SGV salary: " + Example1.salary);
		System.out.println("\n*********************************************");
		Sample1 s1 = new Sample1();// we have to create object of each class for accessing NSGV of each class which
									// is difficult and time consuming
		System.out.println("Sample1 class NSGV age: " + s1.age);
		Sample2 s2 = new Sample2();
		System.out.println("Sample2 class NSGV age: " + s2.age);
		Example1 e1 = new Example1();
		System.out.println("Example1 class NSGV age: " + e1.age);

	}

}
