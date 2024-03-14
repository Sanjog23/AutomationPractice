package march10.practice;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 151;
		PalindromeNumber pal = new PalindromeNumber();
		pal.reverse(num);

	}

	void reverse(int num) {
		int org = num, reminder, reverse = 0;
		System.out.println("Original number: " + num);
		for (; num != 0; num = num / 10) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
		}
		System.out.println("Reversed number: " + reverse);

		if (org == reverse) {
			System.out.println("Given number is palidrome");
		} else {
			System.out.println("Given number is not palidrome");
		}

	}

}
