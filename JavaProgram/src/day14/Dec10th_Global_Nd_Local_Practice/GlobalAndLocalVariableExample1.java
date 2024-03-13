package day14.Dec10th_Global_Nd_Local_Practice;

public class GlobalAndLocalVariableExample1 {
	static int globalVariable = 10;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int localVariable = 5;
		System.out.println("Global Variable: " + GlobalAndLocalVariableExample1.globalVariable);
		System.out.println("Local Variable: " + localVariable);
		int result = GlobalAndLocalVariableExample1.globalVariable + localVariable;
		System.out.println("Local Variable Result: " + result);

		GlobalAndLocalVariableExample1.globalVariable = 25;
		localVariable = 25;
		result = GlobalAndLocalVariableExample1.globalVariable * localVariable;
		System.out.println("\nupdated global variable: " + GlobalAndLocalVariableExample1.globalVariable);
		System.out.println("updated local variable: " + localVariable);
		System.out.println("updated result: " + result);

		int methodLocalVariable = 7;
		System.out.println("\nInside example method-global variable: " + GlobalAndLocalVariableExample1.globalVariable);
		System.out.println("Inside Example Method-Local Variable: " + methodLocalVariable);
		System.out.println("Program Ends");
	}

	static void exampleMethod() {
		int methodLocalVariable = 7;
		System.out.println("Inside example method-global variable: " + GlobalAndLocalVariableExample1.globalVariable);
		System.out.println("Inside Example Method-Local Variable: " + methodLocalVariable);
		System.out.println("Program Ends");
	}

}
