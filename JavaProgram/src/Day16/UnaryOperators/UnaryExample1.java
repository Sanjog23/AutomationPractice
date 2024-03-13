package Day16.UnaryOperators;

public class UnaryExample1 {

	public static void main(String[] args) {
		int num = 10;
		int x;

		x = num++; // Post-increment--first use the value dn perform operation

		System.out.println("x: " + x);// 10
		System.out.println("num: " + num);// 11

		x = ++num; // Pre-increment-- first perform operation dn use updated value

		System.out.println("x: " + x);// 12
		System.out.println("num: " + num);// 12

		int y = ++num;

		System.out.println("y: " + y);// 13
		System.out.println("num: " + num);// 13

		int z = num++ + ++num + num;
//initial (z):13 + 15     + 15
//final (num):14   15       15

		System.out.println("z: " + z);// 43
		System.out.println("num: " + num);// 15

		int a = 15;
		int b = a + a++ + ++a + a++ + ++a;
//initial (a):  15 + 15 + 17  + 17  +  19
//final (num):  15   16   17    18     19
		
		System.out.println("b: "+b);//83
		System.out.println("a: "+a);//19

	}

}
