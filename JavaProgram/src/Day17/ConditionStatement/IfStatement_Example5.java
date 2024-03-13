package Day17.ConditionStatement;

public class IfStatement_Example5 {

	public static void main(String[] args) {
		int age=17;
		char bldgroup='O';
		//check blood donation for condition age 18+ and blood group as 'O'
		if(age>=18) {
			if(bldgroup=='O') {
				System.out.println("Welcome, you can donate your blood");
			}else {
				System.out.println("Sorry, your blood group doesn't matched");
			}			
		}else {
			System.out.println("Sorry, your age is below 18, not eligible for blood donation");
		}
	}
}
/*
Find Largest Among three numbers using if..else statement
Java Program to Check a Leap Year
*/