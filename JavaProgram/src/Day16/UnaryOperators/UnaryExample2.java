package Day16.UnaryOperators;

public class UnaryExample2 {

	public static void main(String[] args) {

		int num = 20;
		int x = num--;// post decrement
		System.out.println("x: " + x);// 20
		System.out.println("num: " + num);// 19

		x = --num;// pre decrement
		System.out.println("x: " + x);// 18
		System.out.println("num: " + num);// 18

		int a = 10;
		int b = a-- + --a + a-- + a;
//Initial (b) :  10 +  8  +  8  + 7
//final   (a):    9     8     7    7
		System.out.println("b: " + b);// 33
		System.out.println("a: " + a);// 7

		int p = -5;
		int q = p-- + p + --p + p;
//Initial (q) :  -5 + -6 + -7 + -7
//final  (p)  :  -6   -6   -7   -7
		
	System.out.println("p: "+p);
	System.out.println("q: "+q);
	}

}


