package Day16.UnaryOperators;

public class UnaryPracticeProgram {

	public static void main(String[] args) {

		int a = 0, b;
		b = a++ + ++a + ++a + a;
//Initial : 0  + 2  + 3 + 3
//Final   : 1    2    3   3
		System.out.println("\na: " + a);//3
		System.out.println("b: " + b);//8

		a = 0;
		b = a-- + --a + --a + a;
//Initial : 0   +  -2 +  -3 + -3
//Final   : -1     -2    -3   -3
		System.out.println("\na: " + a);//-3
		System.out.println("b: " + b);//-8

		a = 0;
		b = --a + --a + --a + a + ++a + a++;	
//initial : -1  +  -2 +  -3 + -3 + -2 + -2
//final   : -1     -2    -3   -3   -2   -1
		System.out.println("\na: " + a);//-1
		System.out.println("b: " + b);//-13
		
		
		a = 0;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
//Initial :  0  + -1 + 0  + 0   +  2  + 2   + 3
//final   : -1    -1   0    1      2    3     3
		System.out.println("\na: " + a);//3
		System.out.println("b: " + b);//6

		
	}

}
