package day14th.AllVariable;

public class AllVariable {
	//Global Variable
	static int result;// static global variable
	int num1=10,num2;// non static global variable
	public static void main(String[] args) {
		System.out.println("Program Stats");
		char grade='A';// local variable
		
		System.out.println("local variable grade: "+grade);
		System.out.println("Static global vriable, result: "+AllVariable.result);
		
		AllVariable ref1=new AllVariable();
		System.out.println("\nNon static global variable, num1: "+ref1.num1);
		System.out.println("Non static global variable, num2: "+ref1.num2);
		
		ref1.num1=55;
		ref1.num2=45;
		AllVariable.result=ref1.num1+ref1.num2;
		System.out.println("\nNon static global variable, num1: "+ref1.num1);
		System.out.println("Non static global variable, num2: "+ref1.num2);
		System.out.println("static global variable, result: "+AllVariable.result);
		
		
		AllVariable ref2=new AllVariable();
		System.out.println("\nNon static global variable, num1: "+ref2.num1);
		System.out.println("Non static global variable, num2: "+ref2.num2);
		AllVariable.result=ref2.num1+ref2.num2;
		System.out.println("static global variable, result: "+AllVariable.result);
		
		
		
		System.out.println("Program Ends");
		

	}

}
