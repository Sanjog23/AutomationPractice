package day13.VariableTypesGlobal_Local;


public class StaticGlobalVariableExample3 {

	static int result;//static global variable
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=10,num2=30;//local variables
		StaticGlobalVariableExample3.result=num1+num2;
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+StaticGlobalVariableExample3.result);
		System.out.println("Program Ends");
	}
}
