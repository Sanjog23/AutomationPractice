package day23.MethodOverloading;

public class MethodOverloading2 {

	// write a program to reverse a number
	int getReverseNumber(int num) {
			int rev = 0, rem;
			while (num > 0) {
				rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			return rev;
	}
	int getReverseNumber() {
		int rev = 0, rem,num=123;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		MethodOverloading2.add();
		MethodOverloading2.add(25,35);
		
		MethodOverloading2 ref=new MethodOverloading2();
		System.out.println(ref.getReverseNumber());
		System.out.println(ref.getReverseNumber(123));
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
}