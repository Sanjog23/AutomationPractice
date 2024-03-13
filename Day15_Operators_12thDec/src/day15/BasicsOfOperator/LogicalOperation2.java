package day15.BasicsOfOperator;

public class LogicalOperation2 {

	public static void main(String[] args) {
		// Variable Declaration and Initialization
		int num1 = -10, num2 = 10;
		boolean res1, res2;
		               // OR
		// boolean res1=(num1!=num2), res2=(num1<num2);
		res1 = (num1 != num2);
		res2 = (num1 < num2);
		System.out.println("Result: " + res1);
		System.out.println("Result2: " + res2);

		// Logical AND
		System.out.println("\nbool1 && bool2= " + (res1 && res2));

		// Logical OR
		System.out.println("boolean1 || Boolean2= " + (res1 || res2));

		// LOgical NOT
		System.out.println("!(Boolean1 && Boolean2)= " + !(res1 && res2));

	}

}
