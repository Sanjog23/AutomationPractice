package Day17.ConditionStatement;

public class IfElseIf_Example4 {

	public static void main(String[] args) {
		int sub1=34;
		//need to check grades: 35-50: C | 51-60: B | 61-75: A | 76+ :A+
		if(sub1>=35 && sub1<=50) {
			System.out.println("You got grade C");
		}else if(sub1>=51 && sub1<=60) {
			System.out.println("You got grade B");
		}else if(sub1>=61 && sub1<=75) {
			System.out.println("You got grade A");
		}else if(sub1>75) {
			System.out.println("You got grade A+");
		}else {
			System.out.println("you are fail");
		}
		
	}
}