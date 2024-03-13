package Dec16th_AllProgramPractice;

public class LowerCaseAlphabet_FoorLoop_14 {

	public static void main(String[] args) {
		System.out.println("************Print charectar from a to z*************\n");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + ",");
		}
		System.out.println("\n\n************Print charectar from z to a*************\n");
		for (char ch = 'z'; ch >= 'a'; ch--) {
			System.out.print(ch + ",");
		}
	}

}
