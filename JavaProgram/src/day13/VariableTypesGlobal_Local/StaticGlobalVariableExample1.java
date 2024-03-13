package day13.VariableTypesGlobal_Local;

public class StaticGlobalVariableExample1 {
	static int num1 = 10, num2 = 20, result;// static global variable

	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("Number1: " + num1);
		System.out.println("Number2: " + num2);
		System.out.println("Result: " + result);
		result = num1 + num2;
		System.out.println("Result value after addition: " + result);
		System.out.println("Program Ends");

	}
}


/*
 * Static Global Variable: a global variable declared with static keyword known
 * as static global variable
 * 
 * any thing declared with static keyword will be loaded in the memory at time
 * of compilation these members are also known as class member once there
 * members are loaded into the memory now we can access them in following ways-
 * 1. we can access any static member from another static method directly 2.
 * standard way: to access any static member always use classname like this-
 * classname.staticvariablename classname.staticmethodname these member will get
 * one time memory allocation any global variable declare but not initialize and
 * we are still trying use these variables without initialization dn java
 * compiler will assign default value based on there datatype example:
 * byte,short,int,long default value will be 0 float = 0.0f double= 0.0d or 0.0
 * char= (blank space) boolean=false
 */