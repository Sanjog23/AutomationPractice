package day13.VariableTypesGlobal_Local;


public class StaticGlobalVariableExample4 {

	static int num1=10,num2;
	static double result;

	public static void main(String[] args) {
		System.out.println("Number1: "+StaticGlobalVariableExample4.num1);
		System.out.println("Number2: "+StaticGlobalVariableExample4.num2);
		System.out.println("Result: "+StaticGlobalVariableExample4.result);
		
		StaticGlobalVariableExample4.num2=2;
		StaticGlobalVariableExample4.result=StaticGlobalVariableExample4.num1/StaticGlobalVariableExample4.num2;
		System.out.println("Number1: "+StaticGlobalVariableExample4.num1);
		System.out.println("Number2: "+StaticGlobalVariableExample4.num2);
		System.out.println("Result: "+StaticGlobalVariableExample4.result);
	}

}

