package day23.MethodOverloading;


public class MethodOverloading1 {

	public static void main(String[] args) {

	}

	static void add() {
		int n1=10,n2=20,res=n1+n2;
		System.out.println("Number1: "+n1);
		System.out.println("Number2: "+n2);
		System.out.println(res);
	}
	static void add(int a, int b) {
		int res=a+b;
		System.out.println("Number1: "+a);
		System.out.println("Number2: "+b);
		System.out.println(res);
	}
	static void add(int c,double d) {
		double res=c+d;
		System.out.println("Number1: "+c);
		System.out.println("Number2: "+d);
		System.out.println(res);
	}
	static void add(double c,int d) {
		double res=c+d;
		System.out.println("Number1: "+c);
		System.out.println("Number2: "+d);
		System.out.println(res);
	}
}
/*
 * when we declare more then one method in a class with same name but difference in parameter 
 * 1. number of parameter will differ //or
 * 2. type of parameter will differ   //or
 * 3. position of parameter will differ
 * 
 * why: same operation in diff ways 
 */