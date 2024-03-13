package day18.LoopExample;

public class ForExample1 {

	public static void main(String[] args) {
		for (int n1 = 1; n1 <= 5; n1++) {
			System.out.println("Hello");
		}
		System.out.println("***************Print number from 1 to 5*****************");
		for (int n1 = 1; n1 <= 5; n1++) {
			System.out.println(n1);
		}
		System.out.println("***************Print number from 5 to 1*****************");
		for (int a = 5; a >= 1; a--) {
			System.out.println(a);
		}
		System.out.println("***************Print even number from 1 to 20*****************");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Number is even: " + i);
			}
		}
		System.out.println("***************Print character from a to z*****************");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + ",");
		}
		System.out.println("\n***************Print character from z to a*****************");
		for (char c1 = 'z'; c1 >= 'a'; c1--) {
			System.out.print(c1 + ",");
		}
		System.out.println("\n***************Print vovels between A to Z*****************");
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			if (c1 == 'A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U') {
				System.out.println("Vovels are: " + c1);
			}

		}

	}
}
