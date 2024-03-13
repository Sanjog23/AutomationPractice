package day38.string_stringbuffer;

final class Automation {
	final String name;
	final int salary;

	public Automation(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
}

public class ImmutableExample1 {

	public static void main(String[] args) {
		Automation a1 = new Automation("Ram", 45000);
		System.out.println(a1.getName());
		System.out.println(a1.getSalary());
//		a1.name="Amit"; // compile time error as we can;t modify final variable value
//		a1.salary=50000;// compile time error as we can;t modify final variable value

		Automation a2 = new Automation("Amit", 50000);
		System.out.println(a2.getName());
		System.out.println(a2.getSalary());
	}

}
/*
 * Immutable class: once the object is created its value can;t be changed, if
 * you try to change it, it will create new object instead of modifying existing
 * one
 * 
 * to create immutable class: 1. class and its data members should be declared
 * as final 2. using constructor initialize final variables value 3. create
 * getter method to access final variable from outside the class
 */
