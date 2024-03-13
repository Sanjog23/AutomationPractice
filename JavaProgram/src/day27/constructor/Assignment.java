package day27.constructor;

public class Assignment {
	int num;
	static int num2;
	public void add() {// non static method
		int num1 = 10, num2 = 20, result = num1 + num2;
		System.out.println("\nNumber1: " + num1);
		System.out.println("Number: " + num2);
		System.out.println("Result: " + result);
	}
	public int add(int num, int j) {// non static method accessing non static variable using this keyword
		this.num = num;
		int result = this.num + j;
		System.out.println("\nNumber1: " + num);
		System.out.println("Number2: " + j);
		return result;
	}
	public static int getReverse(int x) {// Static method using static global variable
		Assignment.num2 = x;
		System.out.println("\nOriginal number is: "+num2);
		int reverse = 0, reminder;
		while (num2 > 0) {
			reminder = num2 % 10;
			reverse = reverse * 10 + reminder;
			num2 = num2 / 10;
		}
		return reverse;
	}
	public static int getReverse() {
		int num=987654,reverse=0,reminder;
		System.out.println("\nOriginal number is: "+num);
		while(num>0) {
			reminder=num%10;
			reverse = reverse*10+reminder;
			num=num/10;
		}
		return reverse;
	}
	Assignment() {
		System.out.println("\nThis is zero param constructor");
	}
	Assignment(int age, double salary) {
		this();
		System.out.println("This is int param constructor");
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
	public static void main(String[] args) {
		Assignment obj = new Assignment(25,78025.85);
		obj.add();
		int result = obj.add(25, 35);
		System.out.println("Sum of two number is: " + result);
		System.out.println("Reverse number is: " + getReverse(123));
		System.out.println("Reverse number is: "+Assignment.getReverse());
	
	}

}
//non-static global variable
//static global variable
//non-static global method use this keyword
//static global method
//method overloading
//constructor with overloading and with this()