package day22.MethodFunction_2;

public class NonStaticMethod {// For calling Non-Static Method Program we have to create object/instance

	int add(int a, int b) {
		int c = a + b;
		System.out.println("Number1 is: " + a);
		System.out.println("Number2 is: " + b);
		return c;

	}

	public static void main(String[] args) {
		System.out.println("Program Starts");

		NonStaticMethod ref = new NonStaticMethod();// object created for accessing non static method/function

		ref.add(10, 20);// first way to access---> only method body will be executed, we don't get its return value
		System.out.println("Addition of two number is: " + ref.add(10, 20)); // second way to access
		int sum = ref.add(10, 20);
		System.out.println("Addition of two number is: " + sum);// third way to access---> If we have return type of
																// method then the best way to call it is to store
																// return value into datatype

		System.out.println("***************************************");
		
		ref.printMyDetails(); // first way 
		System.out.println(ref); // second way

		
		
		System.out.println("***************************************");
		int i=12345;
		System.out.println("Original number is: "+i);
		int reverseNum=ref.getReverse(i);
		System.out.println("Reverse number is: "+reverseNum);
		System.out.println("Reverse number is: "+ref.getReverse(12345));

		System.out.println("Program ends");
	}

	public void printMyDetails() { // Void method wont return any value hence we can't write them in print statement
		System.out.println("Hello, I am Sanjog");
		System.out.println("I am 25 years old");
		System.out.println("My salary per month is 35k");
	}

	int getReverse(int num) {
		int reverse = 0, reminder;
		while (num != 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		return reverse;

	}
}
