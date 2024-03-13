package Dec16th_AllProgramPractice;

public class UpperCaseAlphabet_FoorLoop_12 {

	public static void main(String[] args) {
		System.out.println("************Print charectar from A to Z*************\n");

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + ",");
		}
		System.out.println("\n\n************Print charectar from Z to A*************\n");
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			System.out.print(ch + ",");
		}
	}

}
