package day15.BasicsOfOperator;

public class LogicalOperation1 {

	public static void main(String[] args) {
//Variable Declaration and Initialization
		boolean bool1 = false, bool2 = true;

		// Logical AND
		System.out.println("bool1 && bool2= " + (bool1 && bool2));//

		// Logical OR
		System.out.println("bool1 || bool2= " + (bool1 || bool2));//

		// Logical NOT
		System.out.println("!(bool1 && bool2)= " + !(bool1 && bool2));
	}

}
/**
 * == != LHS & RHS result should be in boolean format && --> and
 * 
 * LHS & RHS--> if both side are having result as true dn it will return true
 * else false true && true-->true false && true-->false true && false-->false
 * 
 * ||--> OR
 * 
 * LHS || RHS --> if any one side return true dn the result will be true else
 * false true || true--> true false || true --> true true || false--> true false
 * || false--> false
 * 
 * !--> not
 * 
 * 
 * 
 */