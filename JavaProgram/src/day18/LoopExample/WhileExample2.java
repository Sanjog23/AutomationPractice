package day18.LoopExample;

public class WhileExample2 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			System.out.println("Hello");
			i++;
		}
		System.out.println("***************Print number from 1 to 5*****************");
		i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		System.out.println("***************Print number from 5 to 1*****************");
		i = 5;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		System.out.println("***************Print character from A to Z*****************");
		char c1 = 'A';
		while (c1 <= 'Z') {
			System.out.print(c1 + ",");
			c1++;
		}
		System.out.println("\n***************Print character from Z to A*****************");
		c1 = 'Z';
		while (c1 >= 'A') {
			System.out.print(c1 + ",");
			c1--;
		}
		System.out.println("\n***************Print vovels bitween A to Z*****************");
		c1 = 'A';
		while (c1<='Z') {
		if (c1 == 'A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U') 
			System.out.println("Vovels are: " + c1);
			c1++;
		}
	}

}
