package day15.BasicsOfOperator;

public class RelationOperation {

	public static void main(String[] args) {
		//Variable Declaration and Initialization
		int num1=5, num2= 55;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		// is equal to
		boolean res = (num1 == num2);
		System.out.println("num1==num2: "+res);
		// OR
		System.out.println("num1==num2: "+(num1==num2));
		
		//is not equal to
		System.out.println("num1!=num2: "+(num1!=num2));
		
		//Greater than
		System.out.println("num1>num2: "+(num1>num2));
		
		//Less than
		System.out.println("num1<num2: "+(num1<num2));
		
		//Greater than or equal to
		System.out.println("num1>=num2:"+(num1>=num2));
		
		//Less than or equal to
		System.out.println("num1<=num2: "+(num1<=num2));

	}

}
// All relational operator willgive you the result in the form of tre or false(boolean)
/**
 * Debug: this will help you to execute your program line by line.
           steps:
                  1. Add breakpoint into the required line
                  2. Run the program in debug mode(F11/Run--->Debug/Right click on a file, goto debug as and
                  select Java App.
                  3. F6--> for next line
                     F5--> to inside the method/function
                     ctrl+shift+i--> get value of a variable or operation
                     F8---> to continue the program execution
 */
