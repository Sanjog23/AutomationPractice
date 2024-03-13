package day29.Inheritance_overriding;

//parent class
class Company {
	// global variable - static and non-static
	int year = 2023;
	static double turnover = 78.25;

	// method with method overloading use of this keyword, static and non-static
	static void companyDetails() {// STATIC METHOD
		System.out.println("\nCompany name: Tata group");
		System.out.println("Established in 1868");
		System.out.println("Founded by Jamsetji Tata");
	}

	static void companyDetails(int year, double turnover) {// STATIC METHOD OVERLOADING
		// year=2020;
		// turnover=45.45;
		System.out.println("\nThe turnover of Tata group in: " + year + " is " + turnover + " Cr.");
		// Company c1=new Company();
		// System.out.println("The turnover of Tata group in: "+c1.year+"is"+Company.turnover+" Cr.");
	}

	public void detailsOfCompany() {// NON-STATIC METHOD
		System.out.println("\nCompany name: Amazon");
		System.out.println("Founded in 1994");
		System.out.println("Founded by Jeff Bezos");
	}

	public void detailsOfCompany(int year, double turnover) {// NON-STATIC METHOD OVERLOADING
		// year=2022;
		// turnover=65.78;
		System.out.println("\nThe turnover of Amazon in " + year + " is " + turnover + "Cr.");
		// USING THIS KEYWORD
		System.out.println("The turnover of Amazon in " + this.year + " is " + Company.turnover + "Cr.");
	}

	// constructor with overloading and use of this()
	Company() {
		System.out.println("\nThis is zero-param cons...of Company class");
	}

	Company(int year) {
		this();
		System.out.println("\nThis is int param cons....of Company class");
		System.out.println("Tata Group of company is established in " + year);
	}

}

//child class of Company
class Employee extends Company {
	// global variable name as Company name variable
	int age = 35, employee = 20;
	static double salary = 100000.25;

	// method with method overloading use of this & super keyword
	static void employeeDetails() {
		System.out.println("\nI am Mahesh");
		System.out.println("I am from Indore,M.P.");
	}

	static void employeeDetails(int age, double salary) {
		System.out.println("I am " + age + " year old");
		System.out.println("Currently I am earning " + salary + " per month");
		System.out.println("Currently I am earning " + Employee.salary + " per month");
	}

	public void displayEmployeeDetails() {
		System.out.println("\nI am Gopal");
		System.out.println("I am from Kallur,Telangana");
	}

	public void displayEmployeeDetails(int age, double salary) {
		// age=31;
		// salary=38000.43;
		System.out.println("I am " + age + " year old.");
		System.out.println("Currently I am earning " + salary + " per month");
		System.out.println("Now I am " + this.age + " year old");
		System.out.println("And I am earning " + Employee.salary + " per month");
		System.out.println("Year of joining: "+super.year);
	}

	// constructor with overloading and use of this() & super()
	Employee() {
		this(45, 87254.58);
		System.out.println("\nThis is zero-param cons...of Employee class");
	}

	Employee(int age, double salary) {
		this(87224.25, 44);
		System.out.println("\nThis is int double param cons...of Employee class");
		System.out.println("Age of employee is: " + age);
		System.out.println("Salary of employee is: " + salary);
		// System.out.println("int double cons end....");
	}

	Employee(double salary, int age) {
		super(1868);
		System.out.println("\nThis is double int param cons...");
		System.out.println("Salary of employee is: " + salary);
		System.out.println("Age of employee is: " + age);
		// System.out.println("double int param cons ends....");
	}
}

public class Inheritance10 {

	public static void main(String[] args) {

		// access all the above class members
		Employee a1 = new Employee();
		a1.companyDetails();
		a1.companyDetails(2020, 45.45);
		a1.detailsOfCompany();
		a1.detailsOfCompany(2022, 65.78);

		a1.employeeDetails();
		a1.employeeDetails(27, 27500.25);
		a1.displayEmployeeDetails();
		a1.displayEmployeeDetails(31, 38000.43);

	}

}
