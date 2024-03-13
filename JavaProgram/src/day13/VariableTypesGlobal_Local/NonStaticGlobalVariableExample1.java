package day13.VariableTypesGlobal_Local;

public class NonStaticGlobalVariableExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Non-Static Global Variable:
	any global variable declare without static keyword known as nonstatic global variable
	* any nonstatic member will be loaded in the memory at time of execution(runtime)
	* to load them into the memory we need create an instance/object of the class using-
		classname referenanceVariable;
		referenanceVariable = new classname();
				//or
		classname referenanceVariable =new classname();
	* once object is created, we can access nonstatic member in following ways
		1. any nonstatic member can be access by another nonstatic method directly
		2. always use Object referenanceVariable to access nonstatic members of the class
	* we are allowed to create multiple object of a class for each object creation you will separate
	  memory allocation along copy nonstatic members
*/