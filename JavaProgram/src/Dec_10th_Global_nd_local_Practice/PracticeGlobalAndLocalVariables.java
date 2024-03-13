package Dec_10th_Global_nd_local_Practice;

public class PracticeGlobalAndLocalVariables {

	static int num1 = 36;
	double result;

	public static void main(String[] args) {
		
		float num2=275.569f;
		System.out.println("Program Starts");
		System.out.println("Number1: "+PracticeGlobalAndLocalVariables.num1);
		System.out.println("Number2: "+num2);
		
		PracticeGlobalAndLocalVariables obj1=new PracticeGlobalAndLocalVariables();
		System.out.println("Result: "+obj1.result);
		
		
		obj1.result=PracticeGlobalAndLocalVariables.num1+num2;
		System.out.println("\nNumber1: "+PracticeGlobalAndLocalVariables.num1);
		System.out.println("Number2: "+num2);
		System.out.println("Result: "+obj1.result);
		
		System.out.println("Program Ends");
	

	}

}
