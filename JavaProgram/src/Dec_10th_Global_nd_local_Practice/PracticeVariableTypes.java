package Dec_10th_Global_nd_local_Practice;

public class PracticeVariableTypes {

	// Global Variable
	static int globalVariable = 10;

	// Static Method with local variable
	public static void methodWithLocalVariable() {
		// Local Variable
		int localVar = 5;

		// Performing operations with local and global variables
		int sum = localVar + globalVariable;
		int product = localVar * globalVariable;

		// Displaying the results
		System.out.println("Inside method with local variable");
		System.out.println("Local variable: " + localVar);
		System.out.println("Global variable: " + globalVariable);
		System.out.println("Sum of local and global variables: " + sum);
		System.out.println("Product of local and global variable: " + product);

	}

	// Static method with global variable
	public static void methodWithGlobalVariable() {
		// Performing operations with global variable
		int squaredGlobalVariable = globalVariable * globalVariable;

		// Displaying the results
		System.out.println("\nInside method with global variable");
		System.out.println("Global variable: " + globalVariable);
		System.out.println("Squared global variable: " + squaredGlobalVariable);
	}

	public static void main(String[] args) {
		// Call the static methods with local and global variables
		methodWithLocalVariable();
		methodWithGlobalVariable();

	}
}
