package day23.overloadingStdUse;


public class Example1 {

	static int num=10;
	public static void main(String[] args) {
		System.out.println("Program starts");
		int num=20;
		System.out.println("Number: "+num);//20
		System.out.println("Global SV number: "+Example1.num);
		System.out.println("Program ends");
	}
}
