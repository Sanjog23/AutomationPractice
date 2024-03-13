package day14.Dec10th_Global_Nd_Local_Practice;

public class Dec12th_StaticExample1 {
	//Global Variable
	static int staticVariable=25; // Static Variable
	int nonStaticVariable=35; // Non-Static Variable

	public static void main(String[] args) {
		Dec12th_StaticExample1 obj1=new Dec12th_StaticExample1();
		Dec12th_StaticExample1 obj2=new Dec12th_StaticExample1();
		
		System.out.println("Program Starts");
		
		System.out.println("Static Variable: "+Dec12th_StaticExample1.staticVariable);
		
		System.out.println("Non-static Variable (Obj1): "+obj1.nonStaticVariable);
		System.out.println("Non-static Variable (Obj2): "+obj2.nonStaticVariable);
		System.out.println("Program Ends");
		

	}

}
