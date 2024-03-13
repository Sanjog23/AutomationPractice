package day23.overloadingStdUse;


public class Example2 {

	int num1=10,num2=20;
	void add() {
		int num1=30,num2=40,res;
		System.out.println("local Number1: "+num1);//30
		System.out.println("local Number2: "+num2);//40
		res=num1+num2;
		System.out.println("Additon of two local numbers: "+res);
		Example2 ref=new Example2();
		System.out.println("Global Number1: "+ref.num1);//10
		System.out.println("Global Number2: "+ref.num2);//20
		res=ref.num1+ref.num2;
		System.out.println("Additon of two global numbers: "+res);
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		Example2 e1=new Example2();
		e1.add();
		System.out.println("Program ends");
	}
}
