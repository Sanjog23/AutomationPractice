package day22.MethodFunction_2;

public class MethodOverLoading {

	public static void main(String[] args) {
		add();
		add(25,45);

	}

	static void add() {
		int n1 = 10, n2 = 20, result = n1 + n2;
		System.out.println("Number1: " + n1);
		System.out.println("Number2: " + n2);
		System.out.println("Result: " + result);
	}

	static void add(int a, int b) {
		int res = a + b;
		System.out.println("\nNumbe1: " + a);
		System.out.println("Number2: " + b);
		System.out.println(res);
	}

	static void add(int c, double d) {
		double res=c+d;
		System.out.println("Number1: " + c);
		System.out.println("Number2: " + d);
		System.out.println(res);
	}
	static void add(double c, int d) {
		double res=c+d;
		System.out.println("Number1: "+c);
		System.out.println("Number2: "+d);
		System.out.println(res);
	}

}
/*
 * When we declare more then one method in a class with same name but difference in parameter
 * 1. NUmber of parameter will differ //or
 * type of parameter will differ //or
 * position of parameter will differ 
 * 
 * Why: same operation in different ways
 */
