package day14.Dec10th_Global_Nd_Local_Practice;

public class PracticeAllVariable {

	static int num1 = 25;
	double result;
	static float num2;

	public static void main(String[] args) {

		System.out.println("Program Starts");
		System.out.println("Number1: " + PracticeAllVariable.num1);
		System.out.println("Number2: " + PracticeAllVariable.num2);

		PracticeAllVariable opps = new PracticeAllVariable();
		System.out.println("Result: " + opps.result);
		
		PracticeAllVariable.num2=25.266f;
		opps.result=PracticeAllVariable.num1+PracticeAllVariable.num2;
		System.out.println("\nNumber1: "+PracticeAllVariable.num1);
		System.out.println("Number2: "+PracticeAllVariable.num2);
		System.out.println("Result: "+opps.result);
		
		PracticeAllVariable.num1=60;
		PracticeAllVariable.num2=75.2568f;
		PracticeAllVariable v1=new PracticeAllVariable();
		v1.result=PracticeAllVariable.num1+PracticeAllVariable.num2;
		System.out.println("\nNumber1: "+PracticeAllVariable.num1);
		System.out.println("Number2: "+PracticeAllVariable.num2);
		System.out.println("Result: "+v1.result);
		
		

		System.out.println("Program Ends");

	}

}
