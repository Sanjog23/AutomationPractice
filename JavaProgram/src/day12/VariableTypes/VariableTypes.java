package day12.VariableTypes;

public class VariableTypes 
{
	//global variables
	int age=10;//non-static global variable
	static int empId=101;//static global variable
	
	public static void main(String[] args) {
		//local variables
		int num1=10;
		double sum=num1+20;
		System.out.println("Sum of two digit is: "+sum);
		VariableTypes ref=new VariableTypes();
		System.out.println("age of employee is: "+ref.age);
		System.out.println("EmpId: "+VariableTypes.empId);

	}
}
/*
 * Local variable: variable declared inside method/constructor/block body known as local variable, 
 * 					we don;t use static keyword with local variable
 * 					these variable should be initialize before we use them
 * 					These variable won't get separate memory for storage
 * 					these variable are not accessible from outside the method/constructor body
 * Global Variable: variable declared outside the method/constructor body but present in class body
 * 					known as global variable
 * 		type:
 * 			static global variable: 
 * 			non-static global variable:
 */

